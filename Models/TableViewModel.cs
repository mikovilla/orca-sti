using System.ComponentModel;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication2.Models
{
    public class TableViewModel
    {
        public int ProductID { get; set; }
        [DisplayName("Produc tName")]
        public string ProductName { get; set; }
        public int BrandID { get; set; }
        public double Price { get; set; }
    }
}
