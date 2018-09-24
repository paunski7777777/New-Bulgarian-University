package Entities;

import Entities.Items.Furniture;
import Entities.Items.Item;
import Entities.Items.Shoes;
import Interfaces.Shipment;

import java.util.ArrayList;
import java.util.List;

public class CourierCompany {
    public int itemsCount;
    public List<Shipment> shippedItems;

    public CourierCompany(int itemsCount){
        this.itemsCount = itemsCount;
        this.shippedItems = new ArrayList<Shipment>();
    }

    public void addItem(Shipment item){
        if (this.shippedItems.size() <= this.itemsCount){
            this.shippedItems.add(item);
        }
        else {
            System.out.println("There is not enough space!");
        }
    }

    public double getCapital(){
        double capital = 0;
        for (Shipment item :this.shippedItems) {
            capital += item.shippingPrice();
        }

        return capital;
    }

    public double getVolumeOfAllShipments(){
        double totalVolume = 0;

        for (Shipment shipment:this.shippedItems) {
            totalVolume += ((Item)shipment).box.getVolume();
        }

        return totalVolume;
    }

    @Override
    public String toString() {
        String info =  String.format("The Courier Company has %s items. \r\n", this.itemsCount);

        StringBuilder companyInfo = new StringBuilder();
        companyInfo.append(info);
        companyInfo.append("Items in stock: \r\n");

        for (Shipment item:this.shippedItems) {
            if (item instanceof Shoes){
                companyInfo
                        .append("- Shoes:")
                        .append("\r\n")
                        .append("   Price: " + item.shippingPrice());
            }
            else if (item instanceof Furniture){
                companyInfo
                        .append("- Furniture: ")
                        .append("\r\n")
                        .append("   Brand: " + ((Furniture) item).brand + " Price: " + ((Furniture)item).shippingPrice() + "\r\n");
            }
        }

        companyInfo.append("\r\n");
        companyInfo.append("Total capital of the company: " + this.getCapital());
        companyInfo.append("\r\n");
        companyInfo.append("Total volume of the packages: " + this.getVolumeOfAllShipments());

        return companyInfo.toString().trim();
    }
}
