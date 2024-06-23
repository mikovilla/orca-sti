using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Product_Inventory_ILA.Models.DBEntities
{
    public class Product
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int ID { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string productName { get; set; }
        public float Price { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string Brand { get; set; }
    }
}
