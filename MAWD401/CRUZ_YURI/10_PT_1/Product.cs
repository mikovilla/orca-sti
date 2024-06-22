using System.ComponentModel.DataAnnotations;

namespace MyMVCWeb.Models
{
    public class Product
    {
        [Key]
        public int ProductID { get; set; }

        [Required]
        [StringLength(50)]
        public required string ProductName { get; set; }

        [StringLength(50)]
        public required string Brand { get; set; }

        [Required]
        public int Price { get; set; }
    }
}
