package Entities.Materials;

public abstract class Material {
    public String name;
    public boolean isFragile;

    public Material(String name, boolean isFragile){
        this.name = name;
        this.isFragile = isFragile;
    }

    @Override
    public String toString() {
        String stats = isFragile ? "Fragile" : "Hard";
        return String.format("Name of the material: %s. Status: %s", this.name, stats);
    }
}
