package decision_structures;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota) {
            salary += bonus;
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You were short " + salesShort + " sales.");
        }

        System.out.println("The employee's pay is $" + salary);


    }
}