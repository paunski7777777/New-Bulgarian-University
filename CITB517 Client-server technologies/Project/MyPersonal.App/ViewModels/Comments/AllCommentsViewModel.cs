namespace MyPersonal.App.ViewModels.Comments
{
    using System.Collections.Generic;

    public class AllCommentsViewModel
    {
        public IEnumerable<CommentViewModel> Comments { get; set; }
    }
}
