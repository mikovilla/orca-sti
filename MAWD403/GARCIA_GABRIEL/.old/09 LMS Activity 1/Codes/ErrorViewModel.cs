// ErrorViewModel.cs
// This is within the 'Models' folder
// Garcia, Gabriel L.

namespace Garcia_WebApplication.Models
{
    public class ErrorViewModel
    {
        public string? RequestId { get; set; }

        public bool ShowRequestId => !string.IsNullOrEmpty(RequestId);
    }
}
