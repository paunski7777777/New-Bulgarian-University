public class Jewel extends Goods {
    private static final double increase  = 0.5;

    public  boolean isGold;

    public Jewel(String name, double priceWithoutOvercharge, double overchargePercentage, boolean isGold) {
        super(name, priceWithoutOvercharge, overchargePercentage);
        this.isGold = isGold;
    }

    public double getPrice(){
        if (isGold){
            return this.GetPriceWithOvercharge() + GetPriceWithOvercharge() * increase;
        }

        return this.GetPriceWithOvercharge();
    }

    @Override
    public String toString() {
        return String.format("%s costs %s", this.name, this.getPrice());
    }
}
