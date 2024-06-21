using Microsoft.AspNetCore.Mvc;

namespace _09Activity_Adlawan.Controllers
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
