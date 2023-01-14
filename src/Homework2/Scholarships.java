package Homework2;

import java.util.Scanner;

public class Scholarships {
    public static void main(String[] args) {
        boolean diploma = false;
        double gpa = 0.0;

        Scanner scolarship = new Scanner(System.in);  // create Scanner object to read input

        System.out.print("Do you have a diploma (true or false)? ");
        diploma = scolarship.nextBoolean();

        if (diploma) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("You should consider getting a degree.");
        }

        System.out.print("What is your GPA? ");
        gpa = scolarship.nextDouble();

        if (gpa >= 3.5) {
            System.out.println("You are eligible for a Scholarship!");
        } else {
            System.out.println("You should have studied harder.");
        }
    }
}