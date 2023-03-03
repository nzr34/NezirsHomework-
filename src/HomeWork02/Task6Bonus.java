package HomeWork02;

import java.util.Scanner;

public class Task6Bonus {
    public static void main(String[] args) {

        int salary = 0;
        Scanner bonus = new Scanner(System.in);
        System.out.println("How many years have you been working here? ");
        int years = bonus.nextInt();

        if (years >= 5) {
            System.out.println("You are eligible for the bonus");
            System.out.println("What is your salary?");
            salary = bonus.nextInt();
            if (salary > 50000) {
                System.out.println("You are eligible for $5000 bonus.");
            } else {
                System.out.println("You are eligible for $3000 bonus.");
            }
        } else {
            System.out.println("You are not eligible for the bonus.");
        }
    }
}
