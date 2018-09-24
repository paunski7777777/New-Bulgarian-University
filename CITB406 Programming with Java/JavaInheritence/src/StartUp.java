public class StartUp {
    public static void main(String[] args) {
        Building building = new Building(30000);
        System.out.println(building);

        Premise premise = new Premise(300);
        System.out.println(premise);

        Apartment apartment = new Apartment(200, 3);
        System.out.println(apartment);

        Office office = new Office(100, 2);
        System.out.println(office);

        Room room = new Room(50, 3);
        System.out.println(room);

       OfficeBuilding officeBuilding = new OfficeBuilding(10000, 50);
       System.out.println(officeBuilding);

       ApartmentBuilding apartmentBuilding = new ApartmentBuilding(20000, 30);
       System.out.println(apartmentBuilding);
    }
}
