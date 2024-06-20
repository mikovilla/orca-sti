using _10PerformanceTask_Adlawan.Models.Database;
using Microsoft.EntityFrameworkCore;

namespace _10PerformanceTask_Adlawan.DAL
{
    public class ProductDBContext : DbContext
    {
        public ProductDBContext(DbContextOptions<ProductDBContext> options) : base(options)
        {
        }

        public DbSet<Product>? tblProducts { get; set; } // Update the property name here

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Product>(entity =>
            {
                entity.ToTable("tblProducts"); // This is correct

                entity.Property(e => e.ProductID).HasColumnName("ProductID");

                entity.Property(e => e.ProductName)
                  .IsRequired()
                  .HasMaxLength(50)
                  .IsUnicode(false);

                entity.Property(e => e.Brand)
                  .IsRequired()
                  .HasMaxLength(50)
                  .IsUnicode(false);

                entity.Property(e => e.Price).HasColumnType("float");
            });
        }
    }
}
