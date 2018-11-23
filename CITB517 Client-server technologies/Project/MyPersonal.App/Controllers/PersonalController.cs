namespace MyPersonal.App.Controllers
{
    using Microsoft.AspNetCore.Mvc;

    using MyPersonal.App.Controllers.Base;

    public class PersonalController : BaseController
    {
        public IActionResult Bio()
        {
            return View();
        }

        public IActionResult Gallery()
        {
            return View();
        }

        public IActionResult Contact()
        {
            return this.View();
        }
    }
}