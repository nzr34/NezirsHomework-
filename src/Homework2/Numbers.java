package Homework2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner pozNeg= new Scanner(System.in);
        System.out.println("Enter a number" );
        int number = pozNeg.nextInt();
        if(number>0){
            System.out.println("The number you enter is positive");
        } else if (number<0) {
            System.out.println("The number you enter is negative");
        }else {
            System.out.println("The number you enter is neither positive nor negative");
        }
    }
}
