using System.Data.Entity;

namespace _10PT1.Models
{
    public class ProductContext : DbContext
    {
        // Updated connection string with the new data source
        public ProductContext() : base("data source=LAPTOP-GGLHDSAC;initial catalog=LMS004-SA;integrated security=True;MultipleActiveResultSets=True;")
        {
        }

        public DbSet<Product> Products { get; set; }

        internal void Update(Product product)
        {
            throw new NotImplementedException();
        }
    }
}
