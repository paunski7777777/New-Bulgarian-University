public class Premise {
    public double area;

    public Premise(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Capacity of the premise: %s", this.area);
    }
}
