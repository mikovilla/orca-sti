using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Web;
using System.Web.Mvc;

namespace _10PT_lumanas.Controllers
{
    public class HomeController : Controller
    {
        ItemEntities item = new ItemEntities();

        public ActionResult Index()
        {
            var ItemList = item.Items.ToList();
            return View(ItemList);
        }
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(Item model)
        {
            item.Items.Add(model);
            item.SaveChanges();
            ViewBag.Message = "Data Added";
            return View();
        }
        public ActionResult Details(int id)
        {
            var Data = item.Items.Where(i => i.ProductID == id).FirstOrDefault();
            return View(Data);
        }
    }
}
