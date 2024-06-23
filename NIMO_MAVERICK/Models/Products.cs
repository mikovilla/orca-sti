using System.ComponentModel.DataAnnotations;

namespace PT10_Maverick_Nimo.Models
{
    public class Products
    {
        [Key]
        public int ProductID { get; set; }

        [Required]
        [StringLength(50)]
        public string ProductName { get; set; }

        [StringLength(50)]
        public string Brand { get; set; }

        [Required]
        public float Price { get; set; }
    }
}
