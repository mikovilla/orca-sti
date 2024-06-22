using Microsoft.AspNetCore.Mvc;
using Shop.Services;

namespace Shop.Controllers
{
    public class ProductController : Controller
    {

        private readonly AppDbContext context;
        public ProductController(AppDbContext context)
        {
            this.context = context;
        }

        public IActionResult Index()
        {
            var products = context.Products.ToList();
            return View(products);
        }
    }
}
