public class Building {
    public double area;

    public Building(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Area of the building: %s", this.area);
    }
}
