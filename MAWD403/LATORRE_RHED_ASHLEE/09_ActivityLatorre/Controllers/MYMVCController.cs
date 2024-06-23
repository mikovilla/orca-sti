using Microsoft.AspNetCore.Mvc;

namespace Activity9_Latorre.Controllers
{
    public class MYMVCController : Controller
    {
        public IActionResult Index(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
