using Microsoft.AspNetCore.Mvc;
using WebApplication2.DAL;
using WebApplication2.Models;

namespace WebApplication2.Controllers
{
    public class Table2Controller : Controller
    {
        private readonly Product _context;

        public Table2Controller(Product context)
        {
            this._context = context;
        }
        [HttpGet]
        public IActionResult Index()
        {
            var tables = _context.table2s.ToList();
            List<TableViewModel> tablelist = new List<TableViewModel>();
            if (tables != null) { 
              
                foreach (var table2s in tables)
                {
                    var TableViewModel = new TableViewModel()
                    {
                        ProductID = table2s.ProductID,
                        ProductName = table2s.ProductName,
                        BrandID = table2s.BrandID,
                        Price = table2s.Price,
                    };
                    tablelist.Add(TableViewModel);
                }
                return View(tablelist);
            }
                    return View(tablelist);
        }
    }
}
