import java.util.ArrayList;
import java.util.List;

public class ApartmentBuilding extends Building {
    public List<Apartment> apartments;
    public int countOfApartments;

    public ApartmentBuilding(double area, int countOfApartments) {
        super(area);
        this.countOfApartments = countOfApartments;
        this.apartments = new ArrayList<Apartment>();
    }

    @Override
    public String toString() {
        return String.format("%s with %s apartments", super.toString(), this.countOfApartments);
    }
}
