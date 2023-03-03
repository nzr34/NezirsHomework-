package HomeWork03;

import java.util.Scanner;

public class Task13Grades2 {
    public static void main(String[] args) {
        Scanner gradesinput = new Scanner(System.in);
        System.out.print("Please enter your Grade: ");
        char grade = gradesinput.next().charAt(0);


        switch (grade) {
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Good");
                break;
            case 'c':
            case 'C':
                System.out.println("Average");
                break;
            case 'd':
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}

