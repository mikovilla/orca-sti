using NewMVCWeb.Models;
using Microsoft.EntityFrameworkCore;

namespace NewMVCWeb.Services
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions options) : base(options)
        {
            
        }

        public DbSet<Product> Products { get; set; }
    }
}
