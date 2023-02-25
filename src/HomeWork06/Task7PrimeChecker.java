package HomeWork06;

import java.util.Scanner;

public class Task7PrimeChecker {
    public static void main(String[] args) {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("This program checks if given number is Prime or not!");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            boolean isPrime = true;

            if (num <= 1) {
            isPrime = false;
            } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
            sc.close();
        }

    }


