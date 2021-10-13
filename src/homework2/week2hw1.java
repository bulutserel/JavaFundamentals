package homework2;
import java.util.Random;
public class week2hw1 {

    public static void main(String[] args) {
        int total;
        int i = 0;

        System.out.println("Welcome the Dice Gambling Game!!");

        for(total = 0; total < 50; i++){
            Random random = new Random();
            int dice = random.nextInt(6) + 1;

            if ((dice == 1) || (dice == 2)) {
                System.out.println("Game over!Try again!");
                break;
            }
            if (dice == 3) {
                total = total + 0;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + total + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 4) {
                total = total + 4;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + total + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 5) {
                total = total + 5;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + total + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 6) {
                total = total + 6;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + total + "$");
                dice = random.nextInt(6) + 1;
            }
        }
        if (total >= 50) {
            System.out.println("You have earned the maximum amount of money you can earn." + "\n" + "Your total earning is: " + total + "$");
        }
    }
}

