namespace MyPersonal.App.Middlewares
{
    using Microsoft.AspNetCore.Http;
    using Microsoft.AspNetCore.Identity;

    using MyPersonal.App.Utilities;
    using MyPersonal.Data;
    using MyPersonal.Models;

    using System.Linq;
    using System.Threading.Tasks;

    public class SeedDataMiddleware
    {
        private readonly RequestDelegate next;

        public SeedDataMiddleware(RequestDelegate next)
        {
            this.next = next;
        }

        public async Task InvokeAsync(HttpContext context, MyPersonalDbContext dbContext,
           UserManager<User> userManager, RoleManager<IdentityRole> roleManager)
        {
            if (!dbContext.Roles.Any())
            {
                await this.SeedRoles(userManager, roleManager);
            }

            await this.next(context);
        }

        private async Task SeedRoles(UserManager<User> userManager, RoleManager<IdentityRole> roleManager)
        {
            var adminRoleExists = await roleManager.RoleExistsAsync(Constants.AdminRoleName);
            var userRoleExist = await roleManager.RoleExistsAsync(Constants.UserRoleName);

            if (!userRoleExist || !adminRoleExists)
            {
                var adminRoleResult = await roleManager.CreateAsync(new IdentityRole(Constants.AdminRoleName));
                var userRoleResult = await roleManager.CreateAsync(new IdentityRole(Constants.UserRoleName));
            }
        }
    }
}