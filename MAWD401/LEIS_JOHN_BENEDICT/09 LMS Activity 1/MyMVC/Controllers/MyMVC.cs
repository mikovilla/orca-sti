using Microsoft.AspNetCore.Mvc;

namespace MyMVC.Controllers
{
    public class MyMVC : Controller
    {
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
