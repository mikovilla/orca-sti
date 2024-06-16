using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication2.Models.DBEntities
{
    public class Table2
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int ProductID {  get; set; }
        [Column(TypeName = "varchar(50)")]
        public string ProductName { get; set; }
        public int BrandID { get; set; }
        public double Price { get; set; }
    }
}
