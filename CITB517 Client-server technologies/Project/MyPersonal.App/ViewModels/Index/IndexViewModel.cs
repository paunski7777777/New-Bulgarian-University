namespace MyPersonal.App.ViewModels.Index
{
    public class IndexViewModel
    {
        private const string NameValue = "Alexander Paunski";
        private const string InfoValue = "I'm a C# Web Developer";
        private const string DateOfBirthValue = "30 January 1997";
        private const string AddressValue = "Bulgaria, Sofia";
        private const string EmailValue = "alex_speedy @mail.bg";
        private const string PhoneValue = "+359 884 695 169";

        public string Name { get; set; }
        public string Info { get; set; }
        public string DateOfBirth { get; set; }
        public string Address { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }

        public IndexViewModel()
        {
            this.Name = NameValue;
            this.Info = InfoValue;
            this.DateOfBirth = DateOfBirthValue;
            this.Address = AddressValue;
            this.Email = EmailValue;
            this.Phone = PhoneValue;
        }
    }
}