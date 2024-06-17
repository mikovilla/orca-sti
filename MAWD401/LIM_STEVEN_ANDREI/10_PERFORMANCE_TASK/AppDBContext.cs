using Shop.Models;
using Microsoft.EntityFrameworkCore;

namespace Shop.Services
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions options) : base(options)
        {

        }

        public DbSet<Product> Products { get; set; }
    }
}
