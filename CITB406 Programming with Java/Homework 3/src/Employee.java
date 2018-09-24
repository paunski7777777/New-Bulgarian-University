import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private static final AtomicInteger count = new AtomicInteger(0);

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    private void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    private String name;
    private int id;
    private double monthlySalary;

    public Employee(String name){
        this.name = name;
        this.monthlySalary = 0;
        this.id = count.incrementAndGet();
    }

    public void SetSalary(double salary){
        this.monthlySalary = salary;
    }
    public void IncreaseSalary(double bonus){
        this.monthlySalary += this.monthlySalary * bonus / 100;
    }
    public double GetSalary(){
        return this.monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %s Salary: %s", this.name, this.id, this.monthlySalary);
    }
}