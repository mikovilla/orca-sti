using Microsoft.EntityFrameworkCore.Metadata.Internal;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication10.Models.DBEntities
{
    public class Table
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]

        public int ProductID { get; set; }
        [Column(TypeName = "varchar(50)")]
        public string ProductName { get; set; }
        public string Branded { get; set; }
        public float Price { get; set; }
    }
}
