using StockInventory_HGP.Models.DBEntities;
using Microsoft.EntityFrameworkCore;


namespace StockInventory_HGP.DAL
{
    public class ProductDbContext : DbContext
    {
        public ProductDbContext(DbContextOptions options) : base(options)
        {
        }
        public DbSet<Product> Products { get; set; }
    }
}
