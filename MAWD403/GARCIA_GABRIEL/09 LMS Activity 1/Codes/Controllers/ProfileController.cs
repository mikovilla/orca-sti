using Microsoft.AspNetCore.Mvc;

namespace Garcia_WebApplication.Controllers
{
    public class ProfileController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
