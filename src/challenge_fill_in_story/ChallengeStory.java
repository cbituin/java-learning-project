package challenge_fill_in_story;

import java.util.Scanner;

public class ChallengeStory {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide an adjective:");
        String adjective = scanner.next();

        System.out.println("Provide a season:");
        String season = scanner.next();

        System.out.println("Provide a number of cups of coffee:");
        int numberCups = scanner.nextInt();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + numberCups + " cups of coffee.");
    }
}
