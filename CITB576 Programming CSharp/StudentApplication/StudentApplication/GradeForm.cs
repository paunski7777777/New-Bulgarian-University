namespace StudentApplication
{
    using System;
    using System.Windows.Forms;

    public partial class GradeForm : Form
    {
        public string StudentName { get; set; }
        public int Grade { get; set; }

        public GradeForm()
        {
            InitializeComponent();
        }

        private void GradeStudentForm_Load(object sender, EventArgs e)
        {
            this.numericUpDownGrade.Value = this.Grade;
            this.studentNameLabel.Text = this.StudentName;
        }

        private void GradeStudentForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            this.Grade = (int)this.numericUpDownGrade.Value;
        }
    }
}
