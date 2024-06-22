// HomeController.cs
// This is within the 'Controllers' folder
// Garcia, Gabriel L.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Garcia_WebForm.Controllers
{
    public class HomeController : Controller
    {
        ProductsEntities products = new ProductsEntities();
        public ActionResult Index()
        {
            var ListOfData = products.tblProducts.ToList();
            return View(ListOfData);
        }
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(tblProduct model)
        {
            products.tblProducts.Add(model);
            products.SaveChanges();
            ViewBag.Message = "New Data Inserted!";
            return View();
        }
        public ActionResult Details(int id)
        {
            var Data = products.tblProducts.Where(i => i.ProductID == id).FirstOrDefault();
            return View(Data);
        }
    }
}
