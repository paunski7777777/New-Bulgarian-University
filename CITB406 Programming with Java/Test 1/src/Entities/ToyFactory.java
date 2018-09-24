package Entities;

public class ToyFactory extends Company {
    public int capacity;
    public int countOfToys;
    public double priceForMadeToy;
    public double priceForToyOnTheMarket;
    public double income;
    public double expense;

    public ToyFactory() {
    }

    public ToyFactory(String name, String address, double startingCapital, double tax,
                      int capacity, int countOfToys, double priceForMadeToy, double priceForToyOnTheMarket) {
        super(name, address, startingCapital, tax);
        this.capacity = capacity;
        this.countOfToys = countOfToys;
        this.priceForMadeToy = priceForMadeToy;
        this.priceForToyOnTheMarket = priceForToyOnTheMarket;
        this.income = 0;
        this.expense = 0;
    }

    @Override
    public double income() {
        return this.income - this.expense;
    }

    @Override
    public double netIncome() {
        return this.income() - this.income() * this.tax;
    }

    public void produce(int toysToMake){
        if (this.countOfToys + toysToMake <= this.capacity){
            this.countOfToys += toysToMake;
            this.expense += this.priceForMadeToy * toysToMake;
        }
        else if (toysToMake > this.capacity){
            toysToMake = this.capacity;
            this.countOfToys += toysToMake;
            this.expense += this.priceForMadeToy * toysToMake;
        }
    }

    public void sales(int soldToys){
        if (this.countOfToys - soldToys >= 0 ) {
            this.countOfToys -= soldToys;
            this.income += this.priceForToyOnTheMarket * soldToys;
        }
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(String.format("Income: %s. Expense: %s. Netincome: %s", this.income, this.expense, this.netIncome()));
    }
}
