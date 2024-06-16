using _10PT_JRB.Models;
using Microsoft.EntityFrameworkCore;

namespace _10PT_JRB.Services
{
        public class AppDbContext : DbContext
        {
            public AppDbContext(DbContextOptions options) : base(options) { }

            public DbSet<Product> Products { get; set; }
        }
    }
