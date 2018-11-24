namespace MyPersonal.App.Controllers
{
    using System.Diagnostics;

    using Microsoft.AspNetCore.Mvc;

    using MyPersonal.App.Controllers.Base;
    using MyPersonal.App.ViewModels;
    using MyPersonal.App.ViewModels.Index;

    public class HomeController : BaseController
    {
        public IActionResult Index(IndexViewModel model)
        {
            return View(model);
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
