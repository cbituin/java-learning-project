package challenge_dollar_game;

import java.util.Scanner;

public class ChallengeGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Try to make a dollar! Provide the number of each coin.");
        System.out.println("Provide a number of pennies");
        int pennies = scanner.nextInt();

        System.out.println("Provide a number of nickels");
        int nickels = scanner.nextInt();

        System.out.println("Provide a number of dimes");
        int dimes = scanner.nextInt();

        System.out.println("Provide a number of quarters");
        int quarters = scanner.nextInt();

        double total = 0.00;

        if (pennies > 0) {
            total += (pennies * .01);
        }

        if (nickels > 0) {
            total += (nickels * .05);
        }

        if (dimes > 0) {
            total += (dimes * .10);
        }

        if (quarters > 0) {
            total += (quarters * .25);
        }

        String result = "";
        if (total == 1.00) {
            result = "You win!";
        } else if (total < 1.00) {
            result = "You lose. You were " + (1.00 - total) + " short.";
        } else if (total > 1.00) {
            result = "You lose. You were " + (total - 1.00) + " over.";
        }

        System.out.println(result);

    }
}
