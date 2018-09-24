public class Office extends Premise{
    public int workPlaces;

    public Office(double area, int workPlaces) {
        super(area);
        this.workPlaces = workPlaces;
    }

    @Override
    public String toString() {
        return String.format("%s with %s work places", super.toString(), this.workPlaces);
    }
}
