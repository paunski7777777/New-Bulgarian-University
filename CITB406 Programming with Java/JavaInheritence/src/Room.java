public class Room extends Premise {
    public int beds;

    public Room(double area, int beds) {
        super(area);
        this.beds = beds;
    }

    @Override
    public String toString() {
        return String.format("%s with %s beds", super.toString(), this.beds);
    }
}
