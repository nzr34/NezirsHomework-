package HomeWork02;

import java.util.Scanner;

public class Scholarships {
    /*Write a program to store a boolean value of whether user has diploma or not.
    If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
    Then if user has a degree program should check a gpa score.
    If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
    otherwise → “You should have studied harder” .
     */
    public static void main(String[] args) {
        boolean diploma = false;
        double gpa = 0.0;
        Scanner scholarShip = new Scanner(System.in);  // create Scanner object to read input

        System.out.print("Do you have a diploma (true or false)? ");
        diploma = scholarShip.nextBoolean();

        if (diploma) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("You should consider getting a degree.");
        }

        System.out.print("What is your GPA? ");
        gpa = scholarShip.nextDouble();

        if (gpa >= 3.5) {
            System.out.println("You are eligible for a Scholarship!");
        } else {
            System.out.println("You should have studied harder.");
        }
    }
}