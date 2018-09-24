import Entities.ToyFactory;
import Entities.TransportCompany;

public class StartUp {
    public static void main(String[] args) {
        ToyFactory toyFactory =
                new ToyFactory("Komsed", "Bul. Bulgaria", 10000, 0.20,
                        100, 50, 5, 10);

        toyFactory.produce(30);
        System.out.println(toyFactory.countOfToys);
        toyFactory.sales(50);
        System.out.println(toyFactory.countOfToys);
        System.out.println(toyFactory.income);
        System.out.println(toyFactory.expense);
        System.out.println(toyFactory.income());
        System.out.println(toyFactory.netIncome());
        toyFactory.printData();

        System.out.println("------------------");

        TransportCompany transportCompany =
                new TransportCompany("biomed", "kv.Hladilnika", 50000, 0.30,
                        100, 10);

        transportCompany.printData();
        System.out.println(transportCompany.income());
        System.out.println(transportCompany.netIncome());
    }
}
