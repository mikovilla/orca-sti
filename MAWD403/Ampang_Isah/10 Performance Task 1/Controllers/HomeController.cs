using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Web;
using System.Web.Mvc;

namespace AmpangProductWeb.Controllers
{

    public class HomeController : Controller
    {
        AmpangProductWebDBContext _context = new AmpangProductWebDBContext();
        public ActionResult Index()
        {
            var DataList = _context.tblProducts.ToList();
            return View(DataList);
        }
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(tblProduct Model)
        {
            _context.tblProducts.Add(Model);
            _context.SaveChanges();
            ViewBag.Message = "Successful Inserting of Data";
            return View();
        }
        [HttpGet]
        public ActionResult Edit(int id)
        {
            var data = _context.tblProducts.Where(x => x.ProductID == id).FirstOrDefault();
            return View(data);
        }
        [HttpPost]
        public ActionResult Edit(tblProduct Model)
        {
            var data = _context.tblProducts.Where(x => x.ProductID == Model.ProductID).FirstOrDefault();
            if (data != null)
            {
                
                data.ProductName = Model.ProductName;
                data.Brand = Model.Brand;
                data.Price = Model.Price;
                _context.SaveChanges();
            }
            return RedirectToAction("index");
        }
        public ActionResult Detail(int id)
        {
            var data = _context.tblProducts.Where(x => x.ProductID == id).FirstOrDefault();
            return View(data);
        }
        public ActionResult Delete(int id)
        {
            var data = _context.tblProducts.Where(x => x.ProductID == id).FirstOrDefault();
            _context.tblProducts.Remove(data);
            _context.SaveChanges();
            ViewBag.Message = "Successful Deleting of Data";
            return RedirectToAction("index");   
        }

    }

}
