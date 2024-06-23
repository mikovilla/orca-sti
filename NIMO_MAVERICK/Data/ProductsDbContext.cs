using Microsoft.EntityFrameworkCore;
using PT10_Maverick_Nimo.Models;

namespace PT10_Maverick_Nimo.Data
{
    public class ProductsDbContext : DbContext
    {
        public ProductsDbContext(DbContextOptions<ProductsDbContext> options)
            : base(options)
        {
        }

        public DbSet<Products> Products { get; set; }
    }
}
