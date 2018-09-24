import java.io.Serializable;

public class Hotel implements Serializable {

    private String name;
    private String address;
    private boolean hasSwimmingPool;
    private String category;
    private boolean hasParking;
    private boolean hasAnimators;
    private boolean hasFitness;
    private boolean hasSauna;

    public Hotel() {
    }

    public Hotel(String name, String address, boolean hasSwimmingPool, String category, boolean hasParking,
                 boolean hasAnimators, boolean hasFitness, boolean hasSauna) {
        this.name = name;
        this.address = address;
        this.hasSwimmingPool = hasSwimmingPool;
        this.category = category;
        this.hasParking = hasParking;
        this.hasAnimators = hasAnimators;
        this.hasFitness = hasFitness;
        this.hasSauna = hasSauna;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", address=" + address + ",\n hasSwimmingPool=" + hasSwimmingPool + ", category="
                + category + ",\n hasParking=" + hasParking + ", hasAnimators=" + hasAnimators
                + ",\n hasFitnes=" + hasFitness + ", hasSauna=" + hasSauna + '}';
    }

}
