using Microsoft.AspNetCore.Mvc;

namespace _9activityBorer.Controllers
{
    public class mvcController1 : Controller
    {
        public IActionResult Index(string name, int numtimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.Numtimes = numtimes;

            return View();
        }
    }
}
