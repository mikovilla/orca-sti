using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Shop.Models
{
    [Table("tblProduct")]
    public class Product
    {

            public int ProductID { get; set; }

            public string? ProductName { get; set; }

            public string? Brand { get; set; }
            public double Price { get; set; }
    }
}
