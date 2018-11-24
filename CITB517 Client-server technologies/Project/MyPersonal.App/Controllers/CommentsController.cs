namespace MyPersonal.App.Controllers
{
    using Microsoft.AspNetCore.Authorization;
    using Microsoft.AspNetCore.Mvc;

    using MyPersonal.App.Controllers.Base;
    using MyPersonal.App.ViewModels.Comments;
    using MyPersonal.Services.Contracts;

    using System.Linq;

    public class CommentsController : BaseController
    {
        private readonly ICommentsService commentsService;

        public CommentsController(ICommentsService commentsService)
        {
            this.commentsService = commentsService;
        }

        [Authorize]
        public IActionResult Comment() => this.View();

        [Authorize]
        [HttpPost]
        public IActionResult Comment(CommentInputModel model)
        {
            if (this.ModelState.IsValid)
            {
                this.commentsService.CreateComment(model.Content, this.User.Identity.Name);
            }

            return this.RedirectToAction(nameof(All));
        }

        public IActionResult All()
        {
            var comments = this.commentsService.All()
                                               .Select(vm => new CommentViewModel
                                               {
                                                   User = vm.User.UserName,
                                                   Comment = vm.Content,
                                                   Date = vm.CreatedOn.ToShortDateString()
                                               })
                                               .OrderByDescending(d => d.Date)
                                               .ToList();

            var commentViewModels = new AllCommentsViewModel
            {
                Comments = comments
            };

            return this.View(commentViewModels);
        }

        [Authorize]
        public IActionResult Left()
        {
            var currentUsername = this.User.Identity.Name;

            var comments = this.commentsService.LeftCommentsByUser(currentUsername)
                                               .Select(vm => new CommentViewModel
                                               {
                                                   Comment = vm.Content,
                                                   Date = vm.CreatedOn.ToShortDateString()
                                               })
                                               .OrderByDescending(d => d.Date)
                                               .ToList();

            var commentViewModels = new AllCommentsViewModel
            {
                Comments = comments
            };

            return this.View(commentViewModels);
        }
    }
}