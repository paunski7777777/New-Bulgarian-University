namespace StudentApplication.Data
{
    using Microsoft.EntityFrameworkCore;

    using StudentApplication.Models;

    public class SchoolDbContext : DbContext
    {
        public DbSet<Student> Students { get; set; }
        public DbSet<Course> Courses { get; set; }
        public DbSet<Enrollment> Enrollments { get; set; }

        public SchoolDbContext() { }

        public SchoolDbContext(DbContextOptions options)
           : base(options) { }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer(Configuration.ConnectionString)
                              .UseLazyLoadingProxies();
            }
        }
    }
}