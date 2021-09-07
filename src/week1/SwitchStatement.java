package week1;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Please enter your trouser size in number");
        Scanner scanner = new Scanner(System.in);
        int sizeNumber = scanner.nextInt();
        scanner.close();
        String size;

        switch(sizeNumber) {
            case 46:
                size = "Small";
                break;
            case 48:
                size = "Medium";
                break;
            case 50:
                size = "Large";
                break;
            case 52:
                size = "X Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Your size in text: " + size);
    }
}

