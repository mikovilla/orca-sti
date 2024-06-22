using _10PT1.Services;
using Microsoft.AspNetCore.Mvc;

namespace _10PT1.Controllers
{
    public class ProductsController : Controller
    {
        private readonly ApplicationDbContext context;

        public ProductsController(ApplicationDbContext context)
        {
            this.context = context;
        }
        public IActionResult Index()
        {
            var products = context.Products.ToList();
            return View();
        }
    }
}
