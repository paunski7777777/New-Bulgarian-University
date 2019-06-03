namespace StudentApplication
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridViewStudents = new System.Windows.Forms.DataGridView();
            this.label1 = new System.Windows.Forms.Label();
            this.BtnAddStudent = new System.Windows.Forms.Button();
            this.removeBtn = new System.Windows.Forms.Button();
            this.editBtn = new System.Windows.Forms.Button();
            this.dataGridViewCoursesStudents = new System.Windows.Forms.DataGridView();
            this.courses = new System.Windows.Forms.Label();
            this.btnEnroll = new System.Windows.Forms.Button();
            this.dataGridViewCourses = new System.Windows.Forms.DataGridView();
            this.course = new System.Windows.Forms.Label();
            this.buttonRemoveCourse = new System.Windows.Forms.Button();
            this.buttonEditCourse = new System.Windows.Forms.Button();
            this.buttonCourse = new System.Windows.Forms.Button();
            this.dataGridViewStudentsCourses = new System.Windows.Forms.DataGridView();
            this.labelEnrolledInCourses = new System.Windows.Forms.Label();
            this.buttonGradeStudent = new System.Windows.Forms.Button();
            this.buttonRemoveStudenFromCourse = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewStudents)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCoursesStudents)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCourses)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewStudentsCourses)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridViewStudents
            // 
            this.dataGridViewStudents.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewStudents.Location = new System.Drawing.Point(15, 26);
            this.dataGridViewStudents.Name = "dataGridViewStudents";
            this.dataGridViewStudents.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewStudents.Size = new System.Drawing.Size(395, 176);
            this.dataGridViewStudents.TabIndex = 0;
            this.dataGridViewStudents.SelectionChanged += new System.EventHandler(this.DataGridViewStudents_SelectionChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 10);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(49, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Students";
            // 
            // BtnAddStudent
            // 
            this.BtnAddStudent.Location = new System.Drawing.Point(12, 212);
            this.BtnAddStudent.Name = "BtnAddStudent";
            this.BtnAddStudent.Size = new System.Drawing.Size(122, 23);
            this.BtnAddStudent.TabIndex = 2;
            this.BtnAddStudent.Text = "Add Student";
            this.BtnAddStudent.UseVisualStyleBackColor = true;
            this.BtnAddStudent.Click += new System.EventHandler(this.BtnAddStudent_Click);
            // 
            // removeBtn
            // 
            this.removeBtn.Location = new System.Drawing.Point(140, 212);
            this.removeBtn.Name = "removeBtn";
            this.removeBtn.Size = new System.Drawing.Size(125, 23);
            this.removeBtn.TabIndex = 3;
            this.removeBtn.Text = "Remove Student";
            this.removeBtn.UseVisualStyleBackColor = true;
            this.removeBtn.Click += new System.EventHandler(this.RemoveStudentBtn_Click);
            // 
            // editBtn
            // 
            this.editBtn.Location = new System.Drawing.Point(291, 212);
            this.editBtn.Name = "editBtn";
            this.editBtn.Size = new System.Drawing.Size(122, 23);
            this.editBtn.TabIndex = 4;
            this.editBtn.Text = "Edit Student";
            this.editBtn.UseVisualStyleBackColor = true;
            this.editBtn.Click += new System.EventHandler(this.EditStudentBtn_Click);
            // 
            // dataGridViewCoursesStudents
            // 
            this.dataGridViewCoursesStudents.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewCoursesStudents.Location = new System.Drawing.Point(498, 25);
            this.dataGridViewCoursesStudents.Name = "dataGridViewCoursesStudents";
            this.dataGridViewCoursesStudents.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewCoursesStudents.Size = new System.Drawing.Size(398, 176);
            this.dataGridViewCoursesStudents.TabIndex = 5;
            // 
            // courses
            // 
            this.courses.AutoSize = true;
            this.courses.Location = new System.Drawing.Point(495, 9);
            this.courses.Name = "courses";
            this.courses.Size = new System.Drawing.Size(137, 13);
            this.courses.TabIndex = 6;
            this.courses.Text = "Courses enrolled by student";
            // 
            // btnEnroll
            // 
            this.btnEnroll.Location = new System.Drawing.Point(498, 212);
            this.btnEnroll.Name = "btnEnroll";
            this.btnEnroll.Size = new System.Drawing.Size(142, 23);
            this.btnEnroll.TabIndex = 7;
            this.btnEnroll.Text = "Enroll Student in Course";
            this.btnEnroll.UseVisualStyleBackColor = true;
            this.btnEnroll.Click += new System.EventHandler(this.BtnEnroll_Click);
            // 
            // dataGridViewCourses
            // 
            this.dataGridViewCourses.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewCourses.Location = new System.Drawing.Point(12, 280);
            this.dataGridViewCourses.Name = "dataGridViewCourses";
            this.dataGridViewCourses.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewCourses.Size = new System.Drawing.Size(398, 175);
            this.dataGridViewCourses.TabIndex = 8;
            this.dataGridViewCourses.SelectionChanged += new System.EventHandler(this.DataGridViewCourses_SelectionChanged);
            // 
            // course
            // 
            this.course.AutoSize = true;
            this.course.Location = new System.Drawing.Point(12, 264);
            this.course.Name = "course";
            this.course.Size = new System.Drawing.Size(45, 13);
            this.course.TabIndex = 9;
            this.course.Text = "Courses";
            // 
            // buttonRemoveCourse
            // 
            this.buttonRemoveCourse.Location = new System.Drawing.Point(158, 461);
            this.buttonRemoveCourse.Name = "buttonRemoveCourse";
            this.buttonRemoveCourse.Size = new System.Drawing.Size(116, 23);
            this.buttonRemoveCourse.TabIndex = 11;
            this.buttonRemoveCourse.Text = "Remove Course";
            this.buttonRemoveCourse.UseVisualStyleBackColor = true;
            this.buttonRemoveCourse.Click += new System.EventHandler(this.ButtonRemoveCourse_Click);
            // 
            // buttonEditCourse
            // 
            this.buttonEditCourse.Location = new System.Drawing.Point(294, 461);
            this.buttonEditCourse.Name = "buttonEditCourse";
            this.buttonEditCourse.Size = new System.Drawing.Size(116, 23);
            this.buttonEditCourse.TabIndex = 12;
            this.buttonEditCourse.Text = "Edit Course";
            this.buttonEditCourse.UseVisualStyleBackColor = true;
            this.buttonEditCourse.Click += new System.EventHandler(this.ButtonEditCourse_Click);
            // 
            // buttonCourse
            // 
            this.buttonCourse.Location = new System.Drawing.Point(12, 461);
            this.buttonCourse.Name = "buttonCourse";
            this.buttonCourse.Size = new System.Drawing.Size(116, 23);
            this.buttonCourse.TabIndex = 13;
            this.buttonCourse.Text = "Add Course";
            this.buttonCourse.UseVisualStyleBackColor = true;
            this.buttonCourse.Click += new System.EventHandler(this.ButtonAddCourse_Click);
            // 
            // dataGridViewStudentsCourses
            // 
            this.dataGridViewStudentsCourses.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewStudentsCourses.Location = new System.Drawing.Point(498, 280);
            this.dataGridViewStudentsCourses.Name = "dataGridViewStudentsCourses";
            this.dataGridViewStudentsCourses.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewStudentsCourses.Size = new System.Drawing.Size(398, 175);
            this.dataGridViewStudentsCourses.TabIndex = 14;
            // 
            // labelEnrolledInCourses
            // 
            this.labelEnrolledInCourses.AutoSize = true;
            this.labelEnrolledInCourses.Location = new System.Drawing.Point(506, 264);
            this.labelEnrolledInCourses.Name = "labelEnrolledInCourses";
            this.labelEnrolledInCourses.Size = new System.Drawing.Size(140, 13);
            this.labelEnrolledInCourses.TabIndex = 15;
            this.labelEnrolledInCourses.Text = "Students enrolled in courses";
            // 
            // buttonGradeStudent
            // 
            this.buttonGradeStudent.Location = new System.Drawing.Point(498, 461);
            this.buttonGradeStudent.Name = "buttonGradeStudent";
            this.buttonGradeStudent.Size = new System.Drawing.Size(142, 23);
            this.buttonGradeStudent.TabIndex = 16;
            this.buttonGradeStudent.Text = "Grade Student";
            this.buttonGradeStudent.UseVisualStyleBackColor = true;
            this.buttonGradeStudent.Click += new System.EventHandler(this.ButtonGradeStudent_Click);
            // 
            // buttonRemoveStudenFromCourse
            // 
            this.buttonRemoveStudenFromCourse.Location = new System.Drawing.Point(754, 461);
            this.buttonRemoveStudenFromCourse.Name = "buttonRemoveStudenFromCourse";
            this.buttonRemoveStudenFromCourse.Size = new System.Drawing.Size(142, 23);
            this.buttonRemoveStudenFromCourse.TabIndex = 17;
            this.buttonRemoveStudenFromCourse.Text = "Remove Student from Course";
            this.buttonRemoveStudenFromCourse.UseVisualStyleBackColor = true;
            this.buttonRemoveStudenFromCourse.Click += new System.EventHandler(this.ButtonRemoveStudentFromCourse_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(915, 508);
            this.Controls.Add(this.buttonRemoveStudenFromCourse);
            this.Controls.Add(this.buttonGradeStudent);
            this.Controls.Add(this.labelEnrolledInCourses);
            this.Controls.Add(this.dataGridViewStudentsCourses);
            this.Controls.Add(this.buttonCourse);
            this.Controls.Add(this.buttonEditCourse);
            this.Controls.Add(this.buttonRemoveCourse);
            this.Controls.Add(this.course);
            this.Controls.Add(this.dataGridViewCourses);
            this.Controls.Add(this.btnEnroll);
            this.Controls.Add(this.courses);
            this.Controls.Add(this.dataGridViewCoursesStudents);
            this.Controls.Add(this.editBtn);
            this.Controls.Add(this.removeBtn);
            this.Controls.Add(this.BtnAddStudent);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dataGridViewStudents);
            this.Name = "MainForm";
            this.Text = "Student Managment Application";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.StudenForm_Closing);
            this.Load += new System.EventHandler(this.StudentForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewStudents)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCoursesStudents)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCourses)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewStudentsCourses)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridViewStudents;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button BtnAddStudent;
        private System.Windows.Forms.Button removeBtn;
        private System.Windows.Forms.Button editBtn;
        private System.Windows.Forms.DataGridView dataGridViewCoursesStudents;
        private System.Windows.Forms.Label courses;
        private System.Windows.Forms.Button btnEnroll;
        private System.Windows.Forms.DataGridView dataGridViewCourses;
        private System.Windows.Forms.Label course;
        private System.Windows.Forms.Button buttonRemoveCourse;
        private System.Windows.Forms.Button buttonEditCourse;
        private System.Windows.Forms.Button buttonCourse;
        private System.Windows.Forms.DataGridView dataGridViewStudentsCourses;
        private System.Windows.Forms.Label labelEnrolledInCourses;
        private System.Windows.Forms.Button buttonGradeStudent;
        private System.Windows.Forms.Button buttonRemoveStudenFromCourse;
    }
}

