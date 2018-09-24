import Entities.*;
import Entities.Items.Furniture;
import Entities.Items.Item;
import Entities.Items.Shoes;
import Entities.Materials.Element;
import Entities.Materials.Material;
import Interfaces.Shipment;

public class StartUp {
    public static void main(String[] args) {
        Material element1 = new Element("stuklo", true, 2);
        Material element2 = new Element("koja", false, 0.5);
        Material element3 = new Element("durvo", false, 3);

        Box box1 = new Box(10 ,10, 10);
        Shipment furniture = new Furniture(box1, "sofia", 200, 3, "ikea");
        ((Item)furniture).addElement((Element) element1);
        ((Item)furniture).addElement((Element) element2);
        ((Item)furniture).addElement((Element) element3);

       //((Item)furniture).showElements();
       //System.out.println(((Item)furniture).getTotalWeight());
       //System.out.println(furniture.shippingPrice());
       //System.out.println(furniture);

        //System.out.println("-----------------------------------");

        Material element4 = new Element("bambuk", false, 0.3);
        Material element5 = new Element("estestvena koja", false, 0.2);
        Material element6 = new Element("velur", false, 0.25);

        Box box2 = new Box(5,5,5);
        Shipment shoes2 = new Shoes(box2, "plovdiv", 400, 4, false);

        ((Shoes)shoes2).addElement((Element) element4);
        ((Shoes)shoes2).addElement((Element) element5);
        ((Shoes)shoes2).addElement((Element) element6);

       //((Item)shoes2).showElements();
       //System.out.println(((Item)shoes2).getTotalWeight());
       //System.out.println(shoes2.shippingPrice());
       //System.out.println(shoes2);

        CourierCompany courierCompany = new CourierCompany(6);
        courierCompany.addItem(furniture);
        courierCompany.addItem(shoes2);

       //System.out.println(courierCompany.getCapital());
       //System.out.println(courierCompany.getVolumeOfAllShipments());
        System.out.println(courierCompany);
    }
}
