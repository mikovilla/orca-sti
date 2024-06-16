using Microsoft.AspNetCore.Mvc;

namespace WebApplication7.Views.MyMVC
{
    public class MyMVC : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;
            return View();
        }
    }
}
