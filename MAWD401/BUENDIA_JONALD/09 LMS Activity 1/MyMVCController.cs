using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebApplication2.Controllers
{
    public class MyMVCController : Controller
    {
        // GET: MyMVC
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello  " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
//Jonald Roy B. Buendia
