namespace MyPersonal.Services
{
    using System.Collections.Generic;
    using System.Linq;
    using Microsoft.AspNetCore.Identity;
    using MyPersonal.Data;
    using MyPersonal.Models;
    using MyPersonal.Services.Contracts;

    public class CommentsService : ICommentsService
    {
        private readonly MyPersonalDbContext dbContext;
        private readonly UserManager<User> userManager;
        private readonly SignInManager<User> signInManager;

        public CommentsService(MyPersonalDbContext dbContext, UserManager<User> userManager, SignInManager<User> signInManager)
        {
            this.dbContext = dbContext;
            this.userManager = userManager;
            this.signInManager = signInManager;
        }

        public void CreateComment(string content, string userName)
        {
            var user = this.userManager.Users.SingleOrDefault(u => u.UserName == userName);

            var comment = new Comment
            {
                Content = content,
                User = user
            };

            this.dbContext.Comments.Add(comment);
            this.dbContext.SaveChanges();
        }

        public IEnumerable<Comment> All()
            => this.dbContext.Comments.ToList();
    }
}