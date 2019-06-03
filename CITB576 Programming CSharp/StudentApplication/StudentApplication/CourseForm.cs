namespace StudentApplication
{
    using StudentApplication.Models;

    using System.Windows.Forms;

    public partial class CourseForm : Form
    {
        public Course FormCourse { get; set; }

        public CourseForm()
        {
            InitializeComponent();
        }

        private void CourseForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (this.FormCourse == null)
            {
                this.FormCourse = new Course();
            }

            this.FormCourse.Title = this.textBoxCourseTitle.Text;
            this.FormCourse.Credits = (int)this.numericUpDownCredits.Value;
        }

        private void CourseForm_Load(object sender, System.EventArgs e)
        {
            if (this.FormCourse != null)
            {
                this.textBoxCourseTitle.Text = FormCourse.Title;
                this.numericUpDownCredits.Value = FormCourse.Credits;
            }
        }
    }
}