using _10PT1.Models;
using Microsoft.EntityFrameworkCore;

namespace _10PT1.Services
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions options) : base(options)
        {

        }

        public DbSet<Product> Products { get; set; }

    }
}
