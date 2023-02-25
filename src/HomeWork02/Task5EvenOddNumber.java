package HomeWork02;

import java.util.Scanner;

public class Task5EvenOddNumber {
    public static void main(String[] args) {

        Scanner evenOddNumber = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int number = evenOddNumber.nextInt();

        if (number%2==0){
            System.out.println("The number you enter is Even.");
        }else{
            System.out.println("The number you enter is Odd.");
        }
    }
}
