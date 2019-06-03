namespace StudentApplication.Models
{
    using System.Collections.Generic;

    public class Course
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public int Credits { get; set; }

        public virtual ICollection<Enrollment> Enrollments { get; set; }

        public Course()
        {
            this.Enrollments = new List<Enrollment>();
        }
    }
}