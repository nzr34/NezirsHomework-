package Homework6;

import java.util.Scanner;

public class Task1ArrNumScanner {
    public static void main(String[] args) {
        /*Using Scanner create an array of integer values.
        After the array is created,
        calculate the sum of all stored
        elements in that array.*/
        Scanner input=new Scanner(System.in);
        int sum=0;
        int[]numbers=new int[7];
        System.out.println("Please Enter 7 numbers :");
        for (int i= 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }System.out.println(sum);
      }
    }

