using Microsoft.AspNetCore.Mvc;
using Product_Inventory_ILA.DAL;
using Product_Inventory_ILA.Models;

namespace Product_Inventory_ILA.Controllers
{
    public class ProductController : Controller
    {
        private readonly ProductDbContext _context;
        public ProductController(ProductDbContext context)
        {
            this._context = context;
        }
        [HttpGet]
        public IActionResult Index()
        {
            var products = _context.Products.ToList();
            List<ProductViewModel> productList = new List<ProductViewModel>();

            if (products != null)
            {
                foreach (var product in products)
                {
                    var ProductViewModel = new ProductViewModel()
                    {
                        ID = product.ID,
                        productName = product.productName,
                        Price = product.Price,
                        Brand = product.Brand,
                    };
                    productList.Add(ProductViewModel);
                }
                return View(productList);
            }
            return View(productList);
        }
    }
}
