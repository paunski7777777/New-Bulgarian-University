public class Food extends Goods {
    private static final int expiration  = 5;
    public static final double sale = 0.20;

    public int expirationDateInDays;

    public Food(String name, double priceWithoutOvercharge, double overchargePercentage, int expirationDateInDays) {
        super(name, priceWithoutOvercharge, overchargePercentage);
        this.expirationDateInDays = expirationDateInDays;
    }

    public double getPrice(){
        if (this.expirationDateInDays <= expiration){
            return this.GetPriceWithOvercharge() - (this.GetPriceWithOvercharge() * sale);
        }

        return this.GetPriceWithOvercharge();
    }

    @Override
    public String toString() {
        return String.format("%s costs %s. Date of expiration: %s days", this.name, this.getPrice(), this.expirationDateInDays);
    }
}
