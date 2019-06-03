namespace StudentApplication
{
    using Microsoft.EntityFrameworkCore;

    using StudentApplication.Data;
    using StudentApplication.Enums;
    using StudentApplication.Models;

    using System;
    using System.Data;
    using System.Linq;
    using System.Windows.Forms;

    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void StudentForm_Load(object sender, EventArgs e)
        {
            this.LoadStudents();
            this.LoadCourses();
        }

        private void StudenForm_Closing(object sender, FormClosingEventArgs e)
        {
            // TODO: ?!

        }

        private void LoadStudents()
        {
            using (var context = new SchoolDbContext())
            {
                this.dataGridViewStudents.DataSource = context.Students
                                                              .Select(s =>
                                                              new
                                                              {
                                                                  s.Id,
                                                                  Name = $"{s.FirstName} {s.LastName}",
                                                                  s.EnrollmentDate
                                                              })
                                                              .ToList();
            }
        }

        private void LoadCourses()
        {
            using (var context = new SchoolDbContext())
            {
                this.dataGridViewCourses.DataSource = context.Courses
                                                             .Select(c =>
                                                              new
                                                              {
                                                                  c.Id,
                                                                  c.Title,
                                                                  c.Credits
                                                              })
                                                              .ToList();
            }
        }

        private void LoadStudentCourses(int studentId)
        {
            using (var context = new SchoolDbContext())
            {
                this.dataGridViewCoursesStudents.DataSource = context.Enrollments
                                                                     .Where(s => s.StudentId == studentId)
                                                                     .Include(co => co.Course)
                                                                     .Select(c => new
                                                                     {
                                                                         c.Id,
                                                                         c.Course.Title,
                                                                         c.Course.Credits,
                                                                         Grade = (int?)c.Grade
                                                                     })
                                                                     .ToList();
            }
        }

        private void LoadCoursesStudents(int courseId)
        {
            using (var context = new SchoolDbContext())
            {
                this.dataGridViewStudentsCourses.DataSource = context.Enrollments
                                                                     .Where(x => x.CourseId == courseId)
                                                                     .Include(z => z.Student)
                                                                     .Select(c => new
                                                                     {
                                                                         c.StudentId,
                                                                         StudentName = $"{c.Student.FirstName} {c.Student.LastName}",
                                                                         Grade = (int?)c.Grade
                                                                     })
                                                                     .ToList();
            }
        }

        private void BtnEnroll_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewStudents.SelectedRows.Count > 0
                && this.dataGridViewCourses.SelectedRows.Count > 0)
            {
                int studentId = (int)this.dataGridViewStudents.SelectedRows[0].Cells["Id"].Value;
                int courseId = (int)dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                using (var context = new SchoolDbContext())
                {
                    if (context.Enrollments.Any(x => x.CourseId == courseId && x.StudentId == studentId))
                    {
                        MessageBox.Show("Student is already enrolled in this course.",
                                        "Attention",
                                        MessageBoxButtons.OK,
                                        MessageBoxIcon.Exclamation);

                        return;
                    }

                    var enrollment = new Enrollment
                    {
                        StudentId = studentId,
                        CourseId = courseId
                    };

                    context.Enrollments.Add(enrollment);
                    context.SaveChanges();
                }

                this.LoadCoursesStudents(courseId);
                this.LoadStudentCourses(studentId);
            }
        }

        private void ButtonGradeStudent_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewStudentsCourses.SelectedRows.Count > 0 
                && this.dataGridViewCourses.SelectedRows.Count > 0)
            {
                int studentId = (int)this.dataGridViewStudentsCourses.SelectedRows[0].Cells["StudentId"].Value;
                int courseId = (int)this.dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                using (var context = new SchoolDbContext())
                {
                    var enrollment = context.Enrollments.Include(s => s.Student)
                                                        .First(en => en.CourseId == courseId && en.StudentId == studentId);

                    var gradeStudentForm = new GradeForm
                    {
                        StudentName = $"{enrollment.Student.FirstName} {enrollment.Student.LastName}",
                        Grade = (int?)enrollment.Grade ?? 6
                    };

                    if (DialogResult.OK == gradeStudentForm.ShowDialog())
                    {
                        enrollment.Grade = (Grade)gradeStudentForm.Grade;

                        context.SaveChanges();

                        this.LoadCoursesStudents(courseId);
                        this.LoadStudentCourses(studentId);
                    }
                }
            }
        }

        private void ButtonRemoveStudentFromCourse_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewStudentsCourses.SelectedRows.Count > 0
                && this.dataGridViewCourses.SelectedRows.Count > 0)
            {
                int studentId = (int)this.dataGridViewStudentsCourses.SelectedRows[0].Cells["StudentId"].Value;
                int courseId = (int)this.dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                using (var context = new SchoolDbContext())
                {
                    var enrollment = context.Enrollments.Include(y => y.Student)
                                                        .First(x => x.CourseId == courseId && x.StudentId == studentId);

                    context.Enrollments.Remove(enrollment);
                    context.SaveChanges();

                    this.LoadCoursesStudents(courseId);
                    this.LoadStudentCourses(studentId);
                }
            }
        }

        private void BtnAddStudent_Click(object sender, EventArgs e)
        {
            var studentForm = new StudentForm();

            if (DialogResult.OK == studentForm.ShowDialog())
            {
                using (var context = new SchoolDbContext())
                {
                    var student = new Student()
                    {
                        FirstName = studentForm.FormStudent.FirstName,
                        LastName = studentForm.FormStudent.LastName,
                        EnrollmentDate = studentForm.FormStudent.EnrollmentDate
                    };

                    context.Students.Add(student);
                    context.SaveChanges();

                    this.LoadStudents();
                }
            }
        }

        private void RemoveStudentBtn_Click(object sender, EventArgs e)
        {
            if (DialogResult.Yes == MessageBox.Show("Are you sure?", "Confirm", MessageBoxButtons.YesNo))
            {
                if (this.dataGridViewStudents.SelectedRows.Count > 0)
                {
                    int studentId = (int)this.dataGridViewStudents.SelectedRows[0].Cells["Id"].Value;

                    using (var context = new SchoolDbContext())
                    {
                        context.Students.Remove(context.Students.First(x => x.Id == studentId));
                        context.SaveChanges();
                    }

                    if (this.dataGridViewCourses.SelectedRows.Count > 0)
                    {
                        int courseId = (int)dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                        this.LoadCoursesStudents(courseId);
                    }

                    this.LoadStudents();
                }
            }
        }

        private void ButtonRemoveCourse_Click(object sender, EventArgs e)
        {
            if (DialogResult.Yes == MessageBox.Show("Are you sure?", "Confirm", MessageBoxButtons.YesNo))
            {
                if (this.dataGridViewCourses.SelectedRows.Count > 0)
                {
                    int courseId = (int)this.dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                    using (var context = new SchoolDbContext())
                    {
                        context.Courses.Remove(context.Courses.First(x => x.Id == courseId));
                        context.SaveChanges();
                    }

                    if (this.dataGridViewStudents.SelectedRows.Count > 0)
                    {
                        int studentId = (int)this.dataGridViewStudents.SelectedRows[0].Cells["Id"].Value;

                        this.LoadStudentCourses(studentId);
                    }

                    this.LoadCourses();
                }
            }
        }

        private void EditStudentBtn_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewStudents.SelectedRows.Count > 0)
            {
                using (var context = new SchoolDbContext())
                {
                    int studentId = (int)this.dataGridViewStudents.SelectedRows[0].Cells["Id"].Value;

                    var studentForm = new StudentForm
                    {
                        FormStudent = context.Students.First(x => x.Id == studentId)
                    };

                    if (DialogResult.OK == studentForm.ShowDialog())
                    {
                        context.SaveChanges();

                        this.LoadStudents();
                    }
                }
            }
        }

        private void ButtonEditCourse_Click(object sender, EventArgs e)
        {
            if (this.dataGridViewCourses.SelectedRows.Count > 0)
            {
                using (var context = new SchoolDbContext())
                {
                    int courseId = (int)dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                    var courseForm = new CourseForm
                    {
                        FormCourse = context.Courses.First(x => x.Id == courseId)
                    };

                    if (DialogResult.OK == courseForm.ShowDialog())
                    {
                        context.SaveChanges();

                        this.LoadCourses();
                    }
                }
            }
        }

        private void ButtonAddCourse_Click(object sender, EventArgs e)
        {
            var courseForm = new CourseForm();

            if (DialogResult.OK == courseForm.ShowDialog())
            {
                using (var context = new SchoolDbContext())
                {
                    var course = new Course()
                    {
                        Title = courseForm.FormCourse.Title,
                        Credits = courseForm.FormCourse.Credits,
                    };

                    context.Courses.Add(course);
                    context.SaveChanges();

                    this.LoadCourses();
                }
            }
        }

        private void DataGridViewStudents_SelectionChanged(object sender, EventArgs e)
        {
            if (this.dataGridViewStudents.SelectedRows.Count > 0)
            {
                int studentId = (int)dataGridViewStudents.SelectedRows[0].Cells["Id"].Value;

                this.LoadStudentCourses(studentId);
            }
        }

        private void DataGridViewCourses_SelectionChanged(object sender, EventArgs e)
        {
            if (dataGridViewCourses.SelectedRows.Count > 0)
            {
                int courseId = (int)dataGridViewCourses.SelectedRows[0].Cells["Id"].Value;

                this.LoadCoursesStudents(courseId);
            }
        }
    }
}