using Microsoft.AspNetCore.Mvc;

namespace MyMVC.Controllers
{
    public class MyMVCController : Controller
    {
        public ActionResult Welcome(string name, int NumTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = NumTimes;

            return View();
        }
    }
}
