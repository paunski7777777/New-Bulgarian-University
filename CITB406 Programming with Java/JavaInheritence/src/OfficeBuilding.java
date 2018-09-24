import java.util.ArrayList;
import java.util.List;

public class OfficeBuilding extends Building {
    public List<Office> offices;
    public int countOfOffices;

    public OfficeBuilding(double area, int countOfOffices) {
        super(area);
        this.countOfOffices = countOfOffices;
        this.offices = new ArrayList<Office>();
    }

    @Override
    public String toString() {
        return String.format("%s with %s offices", super.toString(), this.countOfOffices);
    }
}
