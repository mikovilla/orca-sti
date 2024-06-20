using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication2.Models
{
    [Table("tblProducts")]
    public class Product
    {
        public int ProductID { get; set; }
        public string ProductName { get; set; }
        public string Brand { get; set; }
        public double Price { get; set; }
    }
}
