using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using PT10_Maverick_Nimo.Models;
using System.Threading.Tasks;
using PT10_Maverick_Nimo.Data;


namespace PT10_Maverick_Nimo.Controllers
{
    public class ProductsController : Controller
    {
        public readonly ProductsDbContext _context;

        public ProductsController(ProductsDbContext context)
        {
            _context = context;
        }

        // GET: Products/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Products/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("ProductID,ProductName,Brand,Price")] Products product)
        {
            if (ModelState.IsValid)
            {
                _context.Add(product);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(product);
        }

        // GET: Products
        public async Task<IActionResult> Index()
        {
            return View(await _context.Products.ToListAsync());
        }
    }
}

