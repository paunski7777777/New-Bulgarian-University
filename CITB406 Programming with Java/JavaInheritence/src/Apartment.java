public class Apartment extends Premise {
    public int terraces;

    public Apartment(double area, int terraces) {
        super(area);
        this.terraces = terraces;
    }

    @Override
    public String toString() {
        return String.format("%s with %s terraces", super.toString(), this.terraces);
    }
}
