import java.util.ArrayList;
import java.util.List;

public class Company {
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private String name;
    private int maxCapacity;
    private List<Employee> employees;

    public Company(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.employees = new ArrayList<Employee>();
    }

    public void HireEmployees(Employee employee, double salary){
        if (this.employees.size() < this.maxCapacity) {
            this.employees.add(employee);
            employee.SetSalary(salary);
        }
        else {
            System.out.println("Max capacity reached! Cannot hire more employees");
            return;
        }
    }

    public void FireEmployees(Employee employee){
        this.employees.remove(employee);
    }

    public void IncreaseAllSalaries(double bonus){
        for (Employee employee : this.employees) {
            employee.IncreaseSalary(bonus);
        }
    }

    public void ShowEmployees(){
        this.employees.forEach(e -> System.out.print(e.getName() + " "));
    }

    public double GetSumOfAllSalaries(){
        int sum = 0;

        for (Employee employee : this.employees) {
            sum += employee.getMonthlySalary();
        }

        return sum;
    }

    public void IncreaseSalaryOnCurrentEmployee(Employee employee, double bonus){
        employee.IncreaseSalary(bonus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("The Company %s has %s employees from maximum %s: \r\n", this.name, this.employees.size(), this.maxCapacity));
        for (Employee employee:this.employees) {
            sb.append(employee + "\r\n");
        }

        return sb.toString().trim();
    }
}