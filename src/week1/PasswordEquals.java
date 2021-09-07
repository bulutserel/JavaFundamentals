package week1;

import java.util.Scanner;

public class PasswordEquals {
    public static void main(String[] args){

        String password = "Bulut07";
        System.out.println("Please enter a password");
        Scanner scanner = new Scanner(System.in);
        String enteredPassword = scanner.nextLine();

        if ( enteredPassword.equals(password)){

            System.out.println("Giriş başarılı");
        }
        else{
            System.out.println("Hatalı şifre");
        }

    }
}
