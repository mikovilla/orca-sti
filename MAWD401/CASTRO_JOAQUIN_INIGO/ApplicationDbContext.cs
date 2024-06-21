using Microsoft.EntityFrameworkCore;
using WebApplication3.Models;

namespace WebApplication3.Services
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions options) : base(options)
        {
            
        }

        public DbSet<Product> Products { get; set; }
    }
}
