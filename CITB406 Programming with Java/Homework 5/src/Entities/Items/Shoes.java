package Entities.Items;

import Entities.Box;

public class Shoes extends Item {
    public boolean tryOn;

    public Shoes(Box box, String address, double price, int countOfElements, boolean tryOn) {
        super(box, address, price, countOfElements);
        this.tryOn = tryOn;
    }

    @Override
    public double shippingPrice() {
        return this.tryOn ? super.shippingPrice() + super.shippingPrice() * 0.03 : super.shippingPrice();
    }

    @Override
    public String toString() {
        String tryOnShoes = tryOn ? "yes" : "no";
        return String.format("%s. Try on: %s", super.toString(), this.tryOn);
    }
}
