package HomeWork03;

import java.util.Scanner;

public class Task1BirthMonth {
    public static void main(String[] args) {
        String birthMonth;
        Scanner ns = new Scanner(System.in);
        System.out.println("Please Enter Your Birth Month : ");
        birthMonth = ns.next();

        if (birthMonth.equalsIgnoreCase("December") || birthMonth.equalsIgnoreCase("January") || birthMonth.equalsIgnoreCase("February")) {
            System.out.println("You were born in Winter");
        } else if (birthMonth.equalsIgnoreCase("March") || birthMonth.equalsIgnoreCase("April") || birthMonth.equalsIgnoreCase("May")) {
            System.out.println("You were born in Spring");
        } else if (birthMonth.equalsIgnoreCase("June") || birthMonth.equalsIgnoreCase("July") || birthMonth.equalsIgnoreCase("August")) {
            System.out.println("You were born in Summer");
        } else if (birthMonth.equalsIgnoreCase("September") || birthMonth.equalsIgnoreCase("October") || birthMonth.equalsIgnoreCase("November")) {
            System.out.println("You were born in Autumn");
        } else {
            System.out.println("Invalid input");
        }
    }
}
