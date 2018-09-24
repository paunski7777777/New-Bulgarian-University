import java.util.ArrayList;
import java.util.List;

public class FoodShop extends Shop {
    public List<Goods> foods;

    public FoodShop(int maxCountOfGoods) {
        super(maxCountOfGoods);
        this.foods = new ArrayList<Goods>();
    }

    public void AddFood(Goods food){
        if (this.foods.size() < this.maxCountOfGoods){
            this.foods.add(food);
        }
        else {
            System.out.println("Max capacity reached! Cannot add more food!");
        }
    }

    @Override
    public double totalRevenue() {
        double total =  0;

        for (Goods food : this.foods) {
            total += ((Food)food).getPrice();
        }

        return  total;
    }

    @Override
    public String toString() {
        String result =  String.format(" Total revenue for the Food Shop is: %s \r\n", this.totalRevenue());
        StringBuilder sb = new StringBuilder();

        for (Goods food :this.foods) {
            sb.append(food + "\r\n");
        }

        return String.format("%s Products in the shop: \r\n %s",result, sb.toString().trim());
    }
}
