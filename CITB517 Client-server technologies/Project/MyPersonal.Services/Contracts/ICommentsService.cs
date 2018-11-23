namespace MyPersonal.Services.Contracts
{
    using MyPersonal.Models;

    using System.Collections.Generic;

    public interface ICommentsService
    {
        void CreateComment(string content, string userName);
        IEnumerable<Comment> All();
    }
}