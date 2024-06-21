using System.ComponentModel;
using System.ComponentModel.DataAnnotations.Schema;

namespace _10PerformanceTask_Adlawan.Models
{
    public class ProductViewModel
    {
        public int ProductID { get; set; }

        [DisplayName("ProductName")]
        public string? ProductName { get; set; }

        [DisplayName("Brand")]
        public string? Brand { get; set; }

        public float Price { get; set; }
    }
}
