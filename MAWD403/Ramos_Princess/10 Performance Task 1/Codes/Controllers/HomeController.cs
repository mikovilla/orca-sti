using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _10PerformanceTask_Ramos_WebApplication.Controllers
{
    public class HomeController : Controller
    {
        ItemEntities item = new ItemEntities();
        public ActionResult Index()
        {
            var DataList = item.Products.ToList();
            return View(DataList);
        }
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(Product model)
        {
            item.Products.Add(model);
            item.SaveChanges();
            ViewBag.Message = "New Item Inserted";
            return View();
        }
        public ActionResult Details(int id)
        {
            var data = item.Products.Where(n => n.ProductID == id).FirstOrDefault();
            return View(data);
        }
    }
}