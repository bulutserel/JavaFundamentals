package week1;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        System.out.println("Please enter midterm 1 grade");
        Scanner scanner = new Scanner(System.in);
        int midtermGrade1 = scanner.nextInt();

        System.out.println("Please enter midterm 2 grade");
        int midtermGrade2 = scanner.nextInt();

        System.out.println("Please enter final grade");
        int finalGrade = scanner.nextInt();

        scanner.close();

        double midtermPart1 = midtermGrade1 * 0.2;
        double midtermPart2 = midtermGrade2 * 0.2;
        double finalPart = finalGrade * 0.6;
        double grade = midtermPart1 + midtermGrade2 + finalPart;

        System.out.println("Your grade is" + grade);

        if (grade < 50) {

            System.out.println("Your letter grade is F");

        } else if (grade >= 50 && grade < 70) {

            System.out.println("Your letter grade is D");

        } else if (grade >= 70 && grade < 80) {

            System.out.println("Your letter grade is C");
        } else if (grade >= 80 && grade < 90) {

            System.out.println("Your letter grade is B");
        } else if (grade >= 90 && grade < 100) {

            System.out.println("You letter grade is A");

        }
    }
}