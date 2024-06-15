using Microsoft.AspNetCore.Mvc;

namespace MyMVCMovieApp.Controllers
{
    public class MyMVC : Controller
    {
        // Get: /MyMVC/Welcome
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;
            return View();
        }
    }
}
