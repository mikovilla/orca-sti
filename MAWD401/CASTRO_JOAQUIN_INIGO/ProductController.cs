using Microsoft.AspNetCore.Mvc;
using WebApplication3.Models;
using WebApplication3.Services;

namespace WebApplication3.Controllers
{
    public class ProductController : Controller
    {
        private readonly ApplicationDbContext context;
        public ProductController(ApplicationDbContext context)
        { 
            this.context = context;
        }

        public IActionResult Index()
        {
            var products = context.Products.ToList().Select(p => new Product
            {
                ProductID = p.ProductID,
                ProductName = p.ProductName,
                Brand = p.Brand,
                Price = Convert.ToSingle(p.Price)
            }).ToList();

            return View(products);
        }
    }
}
