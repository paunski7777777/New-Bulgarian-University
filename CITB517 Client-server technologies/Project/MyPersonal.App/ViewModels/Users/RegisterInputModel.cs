namespace MyPersonal.App.ViewModels.Users
{
    using MyPersonal.App.Utilities;

    using System.ComponentModel.DataAnnotations;

    public class RegisterInputModel
    {

        [Required]
        [StringLength(30, MinimumLength = 3)]
        public string Username { get; set; }

        [Required]
        [EmailAddress]
        public string Email { get; set; }

        [Required]
        [RegularExpression(Constants.FullNamePattern)]
        [StringLength(50, MinimumLength = 3)]
        [Display(Name = Constants.FullNameDisplayName)]
        public string FullName { get; set; }

        [Required]
        [StringLength(50, ErrorMessage = Constants.PasswordLengthErrorMessage, MinimumLength = 6)]
        [DataType(DataType.Password)]
        public string Password { get; set; }

        [Required]
        [DataType(DataType.Password)]
        [Compare(Constants.PasswordDisplayName, ErrorMessage = Constants.PasswordConfirmationErrorMessage)]
        [Display(Name = Constants.ConfirmPasswordDisplayName)]
        public string ConfirmPassword { get; set; }
    }
}