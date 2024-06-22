using CDG.Models;
using Microsoft.EntityFrameworkCore;

namespace CDG.Services
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions options) : base(options) { }

        public DbSet<Product>Products { get; set; }
    }
}
