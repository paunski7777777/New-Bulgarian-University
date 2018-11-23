namespace MyPersonal.Models
{
    using System;
    using System.ComponentModel.DataAnnotations;

    public class Comment
    {
        public int Id { get; set; }

        [Required]
        public string Content { get; set; }

        [Required]
        public DateTime CreatedOn { get; set; }

        public string UserId { get; set; }
        public virtual User User { get; set; }

        public Comment()
        {
            this.CreatedOn = DateTime.UtcNow;
        }
    }
}