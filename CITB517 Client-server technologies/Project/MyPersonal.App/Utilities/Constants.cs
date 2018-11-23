namespace MyPersonal.App.Utilities
{
    public class Constants
    {
        public const string AdminRoleName = "Admin";
        public const string UserRoleName = "User";

        public const string FullNameDisplayName = "Full Name";
        public const string PasswordDisplayName = "Password";
        public const string ConfirmPasswordDisplayName = "Confirm Password";
        public const string RememberMeDisplayName = "Remember me?";

        public const string FullNamePattern = @"[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+";

        public const string InvalidLoginMessage = "Invalid login attempt.";
        public const string PasswordConfirmationErrorMessage = "The password and confirmation password do not match.";
        public const string PasswordLengthErrorMessage = "The {0} must be at least {2} and at max {1} characters long.";
    }
}