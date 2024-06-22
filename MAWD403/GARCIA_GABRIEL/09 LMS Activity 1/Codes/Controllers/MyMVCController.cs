using Microsoft.AspNetCore.Mvc;

namespace Garcia_WebApplication.Controllers
{
    public class MyMVCController : Controller
    {
        public IActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
