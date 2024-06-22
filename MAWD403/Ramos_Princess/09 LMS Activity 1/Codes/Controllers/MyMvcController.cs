using Microsoft.AspNetCore.Mvc;

namespace _09ActivityRamos_WebApplication.Controllers
{
    public class MyMvcController : Controller
    {
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello " + name;
            ViewBag.NumTimes = numTimes;
            return View();
        }
    }
}
