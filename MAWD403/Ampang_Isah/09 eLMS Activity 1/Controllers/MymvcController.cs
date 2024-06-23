using Microsoft.AspNetCore.Mvc;

namespace Ampang_WebApp.Controllers
{
    public class MymvcController : Controller
    {
        public ActionResult Index(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello" + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
