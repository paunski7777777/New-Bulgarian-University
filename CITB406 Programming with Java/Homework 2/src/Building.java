public class Building {
    private static final double euro = 1.95583;
    private String address;
    private int floors;
    private double buildArea;
    private double pricePerSquareMeter;

    public Building(){

    }

    public Building(String address, int floors, double buildedArea, double pricePerSquareMeter) {
        this.address = address;
        this.floors = floors;
        this.buildArea = buildedArea;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public double getBuildedArea() {
        return buildArea;
    }

    public void setBuildedArea(double buildedArea) {
        this.buildArea = buildedArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalArea(){
        return this.buildArea * this.floors;
    }

    public double getPrice(){
        return this.buildArea * this.pricePerSquareMeter;
    }

    public double increaseAreaPrice(double increaseNumber){
        return getPrice() * increaseNumber;
    }

    public double getPriceInEuro(){
        return getPrice() * euro;
    }

    @Override
    public String toString() {
        return String.format("The building is on addres: %s. It has %s floors with %s built area and %s price per square meter.`", this.address, this.floors, this.buildArea, this.pricePerSquareMeter);
    }
}
