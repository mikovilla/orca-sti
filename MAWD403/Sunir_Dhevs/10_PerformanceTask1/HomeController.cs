using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebApplication1.Controllers
{
    public class HomeController : Controller
    {
        ProductsInfoDBContext _context = new ProductsInfoDBContext();
        public ActionResult Index()
        {
            var listofData = _context.Products.ToList();
            return View(listofData);    
        }
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(Product model)
        {
            _context.Products.Add(model);
            _context.SaveChanges();
            ViewBag.Message = "Data Insert Successfully";
            return View();
        }
        public ActionResult Edit(int id)
        {
            var data = _context.Products.Where(x => x.ProductID == id).FirstOrDefault();
            return View(data);
        }
        public ActionResult Edit(Product model)
        {
            var data = _context.Products.Where(x => x.ProductID == model.ProductID).FirstOrDefault();
            if (data != null)
            {
                data.ProductID = model.ProductID;
                data.ProductName = model.ProductName;
                data.Brand = model.Brand;
                _context.SaveChanges();
            }
            return RedirectToAction("index");
        }
        public ActionResult Detail(int id)
        {
            var data = _context.Products.Where(x => x.ProductID == id).FirstOrDefault();
            return View(data);
        }
        public ActionResult Delete(int id)
        {
            var data = _context.Products.Where(x => x.ProductID == id).FirstOrDefault();
            _context.Products.Remove(data);
            _context.SaveChanges();
            ViewBag.Message = "Product record deleted successfully";
            return RedirectToAction("index");
        }
             
    }
}