using Microsoft.EntityFrameworkCore;
using sql2mvc_EKS_2.Models;

namespace sql2mvc_EKS_2.Datas
{
    public class PT10_EKSDbContext : DbContext
    {
        public PT10_EKSDbContext(DbContextOptions<PT10_EKSDbContext>options) : base(options) 
        { 
        }

        public DbSet<Product> Products { get; set; }
    }
}
