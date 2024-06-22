using Microsoft.EntityFrameworkCore;
using Product_Inventory_ILA.Models.DBEntities;

namespace Product_Inventory_ILA.DAL
{
    public class ProductDbContext : DbContext
    {
        public ProductDbContext(DbContextOptions options) : base(options)
        {
        }
        public DbSet<Product> Products { get; set; }
    }
}
