public abstract class Goods {
    public String name;
    public double priceWithoutOvercharge;
    public double overchargePercentage;

    public Goods(String name, double priceWithoutOvercharge, double overchargePercentage) {
        this.name = name;
        this.priceWithoutOvercharge = priceWithoutOvercharge;
        this.overchargePercentage = overchargePercentage;
    }

    public double GetPriceWithOvercharge(){
        return this.priceWithoutOvercharge + priceWithoutOvercharge * overchargePercentage;
    }

    @Override
    public String toString() {
        return String.format("%s costs %s, without VAT: %s", this.name, this.GetPriceWithOvercharge(), this.priceWithoutOvercharge);
    }
}
