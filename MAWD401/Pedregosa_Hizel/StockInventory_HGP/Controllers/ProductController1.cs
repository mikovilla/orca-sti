using Microsoft.AspNetCore.Mvc;
using StockInventory_HGP.DAL;
using StockInventory_HGP.Models;

namespace StockInventory_HGP.Controllers
{
    public class ProductController1 : Controller
    {
        private readonly ProductDbContext _context;
        public ProductController1(ProductDbContext context) 
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
                        Name = product.Name,
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
