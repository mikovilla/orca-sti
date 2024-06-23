using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata.Internal;

namespace WebApplication10.DAL
{
    public class TableDbContext : DbContext
    {
        public TableDbContext(DbContextOptions<TableDbContext> options) : base(options)
        {
        }

        public DbSet<Table> Tables { get; set; }
    }
}
