package HomeWork03;

import java.util.Scanner;

public class doubleiflogical {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Please Enter three Numbers");
        n1=scanner.nextDouble();
        n2=scanner.nextDouble();
        n3=scanner.nextDouble();
        if(n1>n2&& n1>n3){
            System.out.println("The Largest Number is "+ n1);
        } else if (n2>n3 && n2>n1) {
            System.out.println("The Largest Number is "+ n2);
        } else if (n3>n2&&n3>n1) {
            System.out.println("Largest number is "+ n3);
        }

    }
}
