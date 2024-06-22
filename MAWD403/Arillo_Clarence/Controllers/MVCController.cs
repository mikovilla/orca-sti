using Microsoft.AspNetCore.Mvc;

namespace _09Arillo.Controllers
{
    public class MVCController : Controller
    {
        public IActionResult Index(string name, int Numtimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.Numtimes = Numtimes;
            return View();
        }
    }
}
