using System.ComponentModel.DataAnnotations.Schema;

namespace sql2mvc_EKS_2.Models
{
    [Table("product")]
    public class Product
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public string Brand { get; set; }
        public float Price { get; set; }
    }
}
