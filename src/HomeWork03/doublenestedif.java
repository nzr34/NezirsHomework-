package HomeWork03;

import java.util.Scanner;

public class doublenestedif {
    public static void main(String[] args) {
        double num1,num2,num3;

        Scanner cscanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers ");
        num1=cscanner.nextDouble();
        num2=cscanner.nextDouble();
        num3=cscanner.nextDouble();


        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is " + num1);
            } else {
                System.out.println("The largest number is " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The largest number is " + num2);
            } else {
                System.out.println("The largest number is " + num3);
            }
        }
    }
}
