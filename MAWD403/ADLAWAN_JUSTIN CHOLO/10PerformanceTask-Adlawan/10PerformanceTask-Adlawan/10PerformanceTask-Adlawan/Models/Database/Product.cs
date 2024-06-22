using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _10PerformanceTask_Adlawan.Models.Database
{
    public class Product
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int ProductID { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string? ProductName { get; set; }
        public string? Brand { get; set; }
        public float Price { get; set; }


    }
}
