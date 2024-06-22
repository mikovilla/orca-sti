using System.Web.Mvc;

namespace WebApplication2.Controllers
{
    public class MyMVCController : Controller
    {
        public ActionResult Welcome()
        {
            ViewBag.Message = "• Hello Cenika";
            return View();
        }
    }
}
