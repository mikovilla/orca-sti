using Microsoft.AspNetCore.Mvc;

namespace LMSA091.Controllers 
{
    public class MyMVCController : Controller
{
    public ActionResult Welcome(string name, int numTimes)
    {
        ViewBag.Message = "Hello " + name;
        ViewBag.NumTimes = numTimes;

        return View();
    }
  }
}
