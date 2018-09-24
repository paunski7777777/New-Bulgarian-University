package Entities.Items;

import Entities.Box;
import Entities.Materials.Element;
import Interfaces.Shipment;

import java.util.ArrayList;
import java.util.List;

public abstract class Item implements Shipment{
    public Box box;
    public String address;
    public double price;
    public int countOfElements;
    public List<Element> elements;

    public Item(Box box, String address, double price, int countOfElements){
        this.box = box;
        this.address = address;
        this.price = price;
        this.countOfElements = countOfElements;
        this.elements = new ArrayList<Element>();
    }

    public void addElement(Element element){
        if (this.elements.size() <= this.countOfElements) {
            this.elements.add(element);
        }
        else {
            System.out.println("There is not enough free space left!");
        }
    }

    public double getTotalWeight(){
        double totalWeight = 0;
        for (Element element : this.elements) {
            totalWeight += element.weight;
        }

        return totalWeight;
    }

    @Override
    public double shippingPrice() {
        return this.getTotalWeight() * this.price;
    }

    public void showElements(){
        System.out.println("All elements of the item:");
        this.elements.forEach(e -> System.out.println(e.toString()));
    }

    @Override
    public String toString() {
        return String
                .format("Box volume: %s. Destination address: %s. Price per KG: %s. Total price: %s",
                        this.box.getVolume(), this.address, this.price, this.shippingPrice());
    }
}
