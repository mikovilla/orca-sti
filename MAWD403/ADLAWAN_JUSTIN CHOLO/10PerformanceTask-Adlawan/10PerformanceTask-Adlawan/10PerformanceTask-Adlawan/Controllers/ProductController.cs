using _10PerformanceTask_Adlawan.DAL;
using _10PerformanceTask_Adlawan.Models;
using Microsoft.AspNetCore.Mvc;

namespace _10PerformanceTask_Adlawan.Controllers
{
    public class ProductController : Controller
    {
        private readonly ProductDBContext _context;

        public ProductController(ProductDBContext context)
        {
            this._context = context;
        }

        [HttpGet]
        public IActionResult Index()
        {

            var products = _context.tblProducts?.ToList();

            List<ProductViewModel> productList = new List<ProductViewModel>();
            if (products != null)
            {
                foreach (var product in products)
                {
                    var ProductViewModel = new ProductViewModel()
                    {
                        ProductID = product.ProductID,
                        ProductName = product.ProductName,
                        Brand = product.Brand,
                        Price = product.Price
                    };
                    productList.Add(ProductViewModel);
                }
                return View(productList);
            }

            return View(productList);
        }
    }
}
