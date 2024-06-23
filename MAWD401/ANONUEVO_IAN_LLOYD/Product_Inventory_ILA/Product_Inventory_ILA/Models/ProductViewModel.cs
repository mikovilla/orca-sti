using System.ComponentModel.DataAnnotations.Schema;

namespace Product_Inventory_ILA.Models
{
    public class ProductViewModel
    {
        public int ID { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string productName { get; set; }
        public float Price { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string Brand { get; set; }
    }
}
