using System.ComponentModel.DataAnnotations.Schema;

namespace NewMVCWeb.Models
{
    [Table("tblProducts")]
    public class Product
    {
        public int ProductID { get; set; }

        public string ProductName { get; set; } = "";

        public string Brand { get; set; } = "";

        public int Price { get; set; }
    }
}
