package week1;

import java.util.Scanner;

public class FourTransactions {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println("Transaction list");
        System.out.println("1 - sum");
        System.out.println("2 - Decal");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Partition");
        System.out.println("*************");
        System.out.println("Please enter a number 1");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter a number 2");
        int number2 = scanner.nextInt();
        System.out.println("Please select your transaction");
        int transaction = scanner.nextInt();

        if (transaction == 1) {

            double sumResult = number1 + number2;
            System.out.println("Sum Result = " + sumResult);
        } else if (transaction == 2) {
            double decalResult = number1 - number2;
            System.out.println("Decal Result = " + decalResult);
        } else if (transaction == 3) {
            double multiplicationResult = number1 * number2;
            System.out.println("Multiplication Result = " + multiplicationResult);
        } else if (transaction == 4) {
            double partitionResult = number1 / number2;
            System.out.println("Partition Result = " + partitionResult);
        } else {
            System.out.println("Unknown Transaction !!!");
        }
    }
}


