using Microsoft.AspNetCore.Mvc;
using System.Xml.Linq;

namespace _09LMS.Controllers
{
	public class MyMVCController : Controller
	{
		public ActionResult Welcome(string name, int numTimes = 1)
		{
			ViewBag.Message = "Hello " + name;
			ViewBag.NumTimes = numTimes;

			return View();
		}
	}
}
