using System.ComponentModel;

namespace StockInventory_HGP.Models
{
        public class ProductViewModel
        {
            public int ID { get; set; }
        
            [DisplayName("Product Name")]
            public string Name { get; set; }
        
            [DisplayName("Price")]
            public int Price { get; set; }

            [DisplayName("Brand")]
            public string Brand { get; set; }
        }
}
