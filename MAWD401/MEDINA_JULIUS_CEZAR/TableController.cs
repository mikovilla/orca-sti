using Microsoft.AspNetCore.Mvc;
using WebApplication10.DAL;
using WebApplication10.Models;

namespace WebApplication10.Controllers
{
    public class TableController : Controller
    {

        private readonly TableDbContext _context;
        public TableController(TableDbContext context)
        {
            this._context = context;
        }
        [HttpGet]
        public IActionResult Index()
        {
            var tables = _context.Tables.ToList();
            List<TableViewModel> tablelist = new List<TableViewModel>();
            if(tables != null)
            {
                foreach (var table in tables)
                {
                    var TableViewModel = new TableViewModel()
                    {
                        ProductID = table.Product,
                        ProductName = table.ProductName,
                        Brand = table.Brand,
                        Price = table.Price,
                    };
                    tablelist.Add(TableViewModel);
                }
                return View(tablelist);
            }

            return View(tables);
        }
    }
}
