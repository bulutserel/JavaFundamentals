package week1;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {

            System.out.println("Your number is negative !!!!");

        }
        else{
            System.out.println("Your number is not negative");
        }
    }
}
