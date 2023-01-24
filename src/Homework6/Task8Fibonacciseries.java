package Homework6;

public class Task8Fibonacciseries {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int sum=0, fib1 = 0, fib2 = 1;
        for (int i = 1; i <= 10; ++i) {
            System.out.print(fib1 + " ");

            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;

    }
}}
