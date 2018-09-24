import java.util.ArrayList;
import java.util.List;

public class JewelryShop extends Shop {
    public List<Goods> jewels;

    public JewelryShop(int maxCountOfGoods) {
        super(maxCountOfGoods);
        this.jewels = new ArrayList<Goods>();
    }

    public void AddJewel(Goods jewel){
        if (this.jewels.size() < this.maxCountOfGoods){
            this.jewels.add(jewel);
        }
        else {
            System.out.println("Max capacity reached! Cannot add more jewels!");
        }
    }

    @Override
    public double totalRevenue() {
        double total =  0;

        for (Goods jewel : this.jewels) {
            total += ((Jewel)jewel).getPrice();
        }

        return  total;
    }

    @Override
    public String toString() {
        String result =  String.format(" Total revenue for the Jewelry Shop is: %s \r\n", this.totalRevenue());
        StringBuilder sb = new StringBuilder();

        for (Goods jewel :this.jewels) {
            sb.append(jewel + "\r\n");
        }

        return String.format("%s Products in the shop: \r\n %s", result, sb.toString().trim());
    }
}
