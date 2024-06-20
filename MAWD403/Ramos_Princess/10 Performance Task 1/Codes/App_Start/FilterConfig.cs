using System.Web;
using System.Web.Mvc;

namespace _10PerformanceTask_Ramos_WebApplication
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
