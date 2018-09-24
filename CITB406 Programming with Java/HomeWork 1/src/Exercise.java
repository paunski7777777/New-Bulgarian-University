import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int start = Integer.parseInt(scanner.nextLine()); //10
        //int end = Integer.parseInt(scanner.nextLine()); //10000
        //int difference = Integer.parseInt(scanner.nextLine()); //5000
        //findDifference(start, end, difference);

        //int length = Integer.parseInt(scanner.nextLine()); //6
        //printNumbers(length);
    }

    private static void findDifference(int start, int end, int difference) {
        int firstDigit, middlePart, lastDigit;

        for (int i = start; i <= end; i++) {
            int number = i;
            firstDigit = number % (int) Math.pow(10, (int) Math.log10(number));
            middlePart = Integer.parseInt(Integer.toString(number).substring(0, 1));
            lastDigit = firstDigit * 10 + middlePart;

            if (lastDigit - number > difference) {
                System.out.println(number);
            }
        }
    }

    private static void printNumbers(int length){
        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= length; j++){
                if (i > j){
                    System.out.print(" ");
                }
                else {
                    System.out.print(j);
                }
            }

            for (int k = length; k >= 1; k--){
                if (i > k){
                    System.out.print(" ");
                }
                else{
                    System.out.print(k);
                }
            }
            System.out.println(" ");
        }

        for (int i = length - 1; i >= 1; i--){
            for (int j = 1; j <= length; j++){
                if (i > j){
                    System.out.print(" ");
                }
                else {
                    System.out.print(j);
                }
            }
            for (int k = length; k >= 1; k--){
                if (i > k){
                    System.out.print(" ");
                }
                else {
                    System.out.print(k);
                }
            }
            System.out.println(" ");
        }
    }
}