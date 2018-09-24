package Entities.Materials;

public class Element extends Material{
    public double weight;

    public Element(String name, boolean isFragile, double weight) {
        super(name, isFragile);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s, Weight: %s",super.toString(), this.weight);
    }
}