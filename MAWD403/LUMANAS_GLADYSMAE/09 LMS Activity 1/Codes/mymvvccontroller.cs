using Microsoft.AspNetCore.Mvc;

namespace _9activity_lumanas.Controllers
{
    public class mymvvccontroller: Controller
    {
        public IActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
