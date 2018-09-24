import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
       //Employee employee1 = new Employee("Pesho");
       //Employee employee2 = new Employee("Gosho");
       //Employee employee3 = new Employee("Tosho");
       //Employee employee4 = new Employee("Mosho");
       //Employee employee5 = new Employee("Sosho");
       //Employee employee6 = new Employee("Tozi be");

       //employee1.SetSalary(3500);
       //employee2.SetSalary(2750);
       //employee3.SetSalary(3000);

       //employee1.IncreaseSalary(20);
       //employee2.IncreaseSalary(25);

       //Company company = new Company("Billions", 5);
       //company.HireEmployees(employee1, 4000);
       //company.HireEmployees(employee2, 3800);
       //company.HireEmployees(employee3, 3200);
       //company.HireEmployees(employee4, 4300);
       //company.HireEmployees(employee5, 2800);
       //company.HireEmployees(employee6, 10000);

       //company.FireEmployees(employee2);

       //company.HireEmployees(employee6, 10000);

       //company.IncreaseAllSalaries(30);

       //System.out.println(company);
       //System.out.println();

       //company.ShowEmployees();
       //System.out.println();
       //System.out.println(String.format("The sum of all salaries in the company %s is %s", company.getName() ,company.GetSumOfAllSalaries()));

       //System.out.println();
       //company.IncreaseSalaryOnCurrentEmployee(employee6, 10);
       //System.out.println(String.format("Employee: %s, Salary: %s", employee6.getName(),employee6.GetSalary()));

        Employee[] employees1 =
                {
                        new Employee("Gosho"),
                        new Employee("Pesho"),
                        new Employee("Tosho"),
                        new Employee("Onzi"),
                        new Employee("Tozi be")
                };
        Double[] salaries1 =
                {
                        3000.0,
                        2750.0,
                        2100.0,
                        4000.0,
                        7300.0
                };

        Employee[] employees2 =
                {
                        new Employee("Typiq"),
                        new Employee("Debeliq"),
                        new Employee("Mibeliq"),
                        new Employee("Batenceto"),
                        new Employee("Kotenceto")
                };
        Double[] salaries2 =
                {
                        2200.0,
                        1800.0,
                        3100.0,
                        5600.0,
                        4400.0
                };

        for (int i = 0; i < salaries1.length; i++) {
            employees1[i].SetSalary(salaries1[i]);
        }

        for (int i = 0; i < salaries2.length; i++) {
            employees2[i].SetSalary(salaries2[i]);
        }

        
        //Arrays.stream(employees1).forEach(e -> System.out.println(e));
        //Arrays.stream(employees2).forEach(e -> System.out.println(e));

        Company company1 = new Company("Billions", 10);
        Company company2 = new Company("YYY bratlencata", 5);

        Arrays.stream(employees1).forEach(e -> company1.HireEmployees(e, 3000));
        Arrays.stream(employees2).forEach(e -> company2.HireEmployees(e, 5000));

        company1.FireEmployees(employees1[3]);
        company2.FireEmployees(employees2[1]);

        company1.IncreaseAllSalaries(15);
        company2.IncreaseAllSalaries(30);

        company1.IncreaseSalaryOnCurrentEmployee(employees1[0], 10);
        company2.IncreaseSalaryOnCurrentEmployee(employees2[4], 25);

        System.out.println(company1);
        System.out.println(company2);

        System.out.println(String.format("The sum of all salaries in %s is: %s",company1.getName() ,company1.GetSumOfAllSalaries()));
        System.out.println(String.format("The sum of all salaries in %s is: %s",company2.getName() ,company2.GetSumOfAllSalaries()));
    }
}