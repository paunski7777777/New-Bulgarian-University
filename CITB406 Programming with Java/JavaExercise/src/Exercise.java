import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //double a = Double.parseDouble(scanner.nextLine());
       //double b = Double.parseDouble(scanner.nextLine());
       //double c = Double.parseDouble(scanner.nextLine());

       //Equation(a, b, c);

       //int start = Integer.parseInt(scanner.nextLine());
       //int end = Integer.parseInt(scanner.nextLine());
       //System.out.println(Average(start, end));

        //int number = Integer.parseInt(scanner.nextLine());
        //PrintDivider(number);
        //System.out.println(SumDividers(number));
        //System.out.println(IsPerfectNumber(number));
        //PerfectNumbersInRange(start, end);
        //System.out.println(IsPrime(number));
        //PrimeNumbersInRange(start, end);
    }

    private static void Equation(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4*a*c;

        if (d == 0){
            double root = - (b / 2 * a);
            System.out.print(root);
        }
        else if(d > 0){
            double x1 = ( -b + Math.sqrt(Math.pow(d, 2) - 4 * a * c)) / 2 * a;
            double x2 = ( -b - Math.sqrt(Math.pow(d, 2)  - 4 * a * c)) / 2 * a;

            System.out.println(x1);
            System.out.println(x2);
        }
        else if (d < 0) {
            System.out.print("квадратното уравнение няма реални корени");
        }
    }

    private static void EvenNumbers()
    {
        
    }

    private  static double Average(int start, int end) {
        double average = 0;
        double sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++)
        {
            if (i % 5 == 0 && i % 3 != 0){
                count++;
               sum += i;
               average = sum / count;
            }
        }

        return average;
    }

    private static void PrintDivider(int number){
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    private static int SumDividers(int number){
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        return sum;
    }

    private static boolean IsPerfectNumber (int number) {
        return SumDividers(number) == number;
    }

    private static void PerfectNumbersInRange (int start, int end){
        for (int i = start; i <= end; i++){
            if (IsPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean IsPrime(int number){
        boolean isPrime = true;

        if (number < 2)
        {
            System.out.println("Not prime");
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }

            }
        }
        if (isPrime) { return  true; }
        else { return false; }
    }

    private static void PrimeNumbersInRange(int start, int end){
        for (int i = start; i <= end; i ++){
            if (IsPrime(i)){
                System.out.println(i);
            }
        }
    }
}
