using System.ComponentModel.DataAnnotations.Schema;

namespace _10PT1.Models
{
    [Table("tblProducts")]
    public class Product
    {
        public int ProductID { get; set; }
        public string ProductName { get; set; } = "";
        public string Brand { get; set; } = "";
        public decimal Price { get; set; }
        public int Quantity { get; set; }

    }
}
