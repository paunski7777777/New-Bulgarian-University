public class MainClass {
    public static void main(String[] args) {
        Building building = new Building();

        Building building1 = new Building("bul.Cherni Vruh", 20, 300, 2000);

        System.out.println(String.format("The total area for the building is: %s", building1.getTotalArea()));
        System.out.println(String.format("The price for the building is: %s", building1.getPrice()));
        System.out.println(String.format("Increased price for the building: %s ", building1.increaseAreaPrice(10)));

        Building building2 = new Building("bul. Simeonovsko shose", 15, 400, 1800);

        System.out.println(String.format("The highest price is: %s", getTheHighestPriceForBuilding(building1, building2)));

        System.out.println(String.format("The price for the building in euro is: %s", building1.getPriceInEuro()));

        System.out.println(building1.toString());
        System.out.println(building2.toString());
    }

    private static double getTheHighestPriceForBuilding(Building building1, Building building2){
        return Math.max(building1.getPrice(),building2.getPrice());
    }
}
