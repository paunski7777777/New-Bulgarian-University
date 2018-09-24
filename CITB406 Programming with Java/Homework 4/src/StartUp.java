public class StartUp {
    public static void main(String[] args) {
        Goods domat = new Food("domat", 2, 0.2, 5);
       // System.out.println(domat);
        Goods krastavica = new Food("krastavica", 1.5, 0.2, 12);
        //System.out.println(krastavica);
        Goods pupesh = new Food("pupesh", 5, 0.3, 7);
       // System.out.println(pupesh);

        Goods jewel = new Jewel("diamant", 10000, 0.50, false);
      //  System.out.println(jewel);

        Goods gold = new Jewel("zlatno kiulche", 50000, 0.20, true);
       // System.out.println(gold);

       FoodShop foodShop = new FoodShop(2);
       foodShop.AddFood(domat);
       foodShop.AddFood(krastavica);
       foodShop.AddFood(pupesh);
       System.out.println(foodShop);

        System.out.println();

       JewelryShop jewelryShop = new JewelryShop(2);
       jewelryShop.AddJewel(jewel);
       jewelryShop.AddJewel(gold);
       System.out.println(jewelryShop);
    }
}
