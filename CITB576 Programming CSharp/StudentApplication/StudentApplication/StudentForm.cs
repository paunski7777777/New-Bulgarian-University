namespace StudentApplication
{
    using StudentApplication.Models;

    using System;
    using System.Windows.Forms;

    public partial class StudentForm : Form
    {
        public Student FormStudent { get; set; }

        public StudentForm()
        {
            InitializeComponent();
        }

        private void StudentForm_Load(object sender, EventArgs e)
        {
            if (this.FormStudent != null)
            {
                this.textBoxFirstName.Text = FormStudent.FirstName;
                this.textBoxLastName.Text = FormStudent.LastName;
                this.dateTimePickerEnrollmentDate.Value = FormStudent.EnrollmentDate;
            }
            else
            {
                this.dateTimePickerEnrollmentDate.Value = DateTime.Now.Date;
            }
        }

        private void StudentForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (this.FormStudent == null)
            {
                this.FormStudent = new Student();
            }

            this.FormStudent.FirstName = this.textBoxFirstName.Text;
            this.FormStudent.LastName = this.textBoxLastName.Text;
            this.FormStudent.EnrollmentDate = this.dateTimePickerEnrollmentDate.Value.Date;
        }
    }
}