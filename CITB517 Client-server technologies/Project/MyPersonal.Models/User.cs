namespace MyPersonal.Models
{
    using Microsoft.AspNetCore.Identity;

    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;

    public class User : IdentityUser
    {
        [Required]
        [RegularExpression(@"[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+")]
        [StringLength(50, MinimumLength = 3)]
        public string FullName { get; set; }

        public virtual ICollection<Comment> Comments { get; set; }

        public User()
        {
            this.Comments = new HashSet<Comment>();
        }
    }
}