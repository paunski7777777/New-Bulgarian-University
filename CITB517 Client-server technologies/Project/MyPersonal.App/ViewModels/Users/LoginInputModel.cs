namespace MyPersonal.App.ViewModels.Users
{
    using MyPersonal.App.Utilities;

    using System.ComponentModel.DataAnnotations;

    public class LoginInputModel
    {
        [Required]
        public string Username { get; set; }

        [Required]
        [DataType(DataType.Password)]
        public string Password { get; set; }

        [Display(Name = Constants.RememberMeDisplayName)]
        public bool RememberMe { get; set; }
    }
}