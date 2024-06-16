using Microsoft.EntityFrameworkCore;
using WebApplication2.Models.DBEntities;

namespace WebApplication2.DAL
{
    public class Product : DbContext
    {
        public Product(DbContextOptions options) : base(options)
        {
        }
        public DbSet<Table2> table2s { get; set; }
    }
}
