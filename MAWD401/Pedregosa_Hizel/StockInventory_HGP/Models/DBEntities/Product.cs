using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace StockInventory_HGP.Models.DBEntities
{
    public class Product
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int ID { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string Name { get; set; }
        public int Price { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string Brand { get; set; }
    }
}
