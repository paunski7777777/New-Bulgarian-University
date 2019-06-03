﻿namespace StudentApplication.Models
{
    using System;
    using System.Collections.Generic;

    public class Student
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime EnrollmentDate { get; set; }
        public virtual ICollection<Enrollment> Enrollments { get; set; }

        public Student()
        {
            this.Enrollments = new List<Enrollment>();
        }
    }
}