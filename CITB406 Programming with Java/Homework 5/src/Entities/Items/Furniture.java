package Entities.Items;

import Entities.Box;
import Entities.Materials.Element;

public class Furniture extends Item {
    public String brand;

    public Furniture(Box box, String address, double price, int countOfElements, String brand) {
        super(box, address, price, countOfElements);
        this.brand = brand;
    }

    public double getFurnitureWeight(){
        return super.getTotalWeight();
    }

    public boolean isFurnitureFragile(){
        boolean isFragile = false;
        for (Element element : this.elements) {
            if (element.isFragile){
                isFragile = true;
                break;
            }
        }

        return isFragile;
    }

    @Override
    public double shippingPrice() {
        return this.isFurnitureFragile() ? super.shippingPrice() + super.shippingPrice() * 0.015 : super.shippingPrice();
    }

    @Override
    public String toString() {
        return String.format("%s. Brand: %s", super.toString(), this.brand);
    }
}
