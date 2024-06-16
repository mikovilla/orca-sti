using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore;

namespace CDG.Models
{
    [Table("tblsProducts_CDG")]
    public class Product
    {
        public int ProductID { get; set; }
        public string? ProductName { get; set; }
        public string? Brand { get; set; }
        public int Price { get; set; }

    }
}
