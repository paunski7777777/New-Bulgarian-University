namespace MyPersonal.Data
{
    using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
    using Microsoft.EntityFrameworkCore;

    using MyPersonal.Models;

    public class MyPersonalDbContext : IdentityDbContext<User>
    {
        public DbSet<Comment> Comments { get; set; }

        public MyPersonalDbContext(DbContextOptions<MyPersonalDbContext> options)
            : base(options) { }
    }
}