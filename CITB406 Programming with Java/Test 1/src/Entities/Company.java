package Entities;

public abstract class Company {
    protected String name;
    protected String address;
    protected double startingCapital;
    protected double tax;

    protected Company(){

    }

    protected Company(String name, String address, double startingCapital, double tax) {
        this.name = name;
        this.address = address;
        this.startingCapital = startingCapital;
        this.tax = tax;
    }

    protected double increaseFund(double amount){
        return this.startingCapital += amount;
    }

    protected double increaseTax(double amount){
        return this.tax += amount;
    }

    protected double decreaseTax(double amount){
        return this.tax -= amount;
    }

    protected abstract double income();

    protected abstract double netIncome();

    protected void printData(){
        System.out.println(String.format("Name: %s. Address: %s. Capital: %s", this.name, this.address, this.startingCapital));
    }
}
