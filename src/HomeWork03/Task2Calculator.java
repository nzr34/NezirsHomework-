package HomeWork03;

import java.util.Scanner;

public class Task2Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}