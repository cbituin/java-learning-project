package challenge_roll_die_game;

import java.util.Objects;
import java.util.Scanner;

public class ChallengeGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rolledValue = 0;
        int currentSpace = 0;
        int spacesLeft = 20;

        System.out.println("Welcome to the roll the die game. Try to roll the dice to get exactly to 20 without going over!");
        String response = "";

        while(!Objects.equals(response, "y")) {
            System.out.println("Would you like to start? (y/n)");
            response = scanner.next();
        }

        for(int roll = 0; roll < 5; roll++) {
            System.out.println(roll);
        }



    }
}
