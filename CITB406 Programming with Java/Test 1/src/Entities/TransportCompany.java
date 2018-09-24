package Entities;

public class TransportCompany extends Company{
    public int countOfSoldTickets;
    public double priceForTicket;

    //public TransportCompany() {
    //}

    public TransportCompany(String name, String address, double startingCapital, double tax, int countOfSoldTickets, double priceForTicket) {
        super(name, address, startingCapital, tax);
        this.countOfSoldTickets = countOfSoldTickets;
        this.priceForTicket = priceForTicket;
    }

    @Override
    public double income() {
        return this.priceForTicket * this.countOfSoldTickets;
    }

    @Override
    public double netIncome() {
        return this.income() - this.income() * this.tax;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(String.format("Sold tickets: %s. Price for a ticket: %s.", this.countOfSoldTickets, this.priceForTicket));
    }
}
