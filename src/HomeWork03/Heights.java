package HomeWork03;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        System.out.println("Please Enter your height (inch) :");
        double height = sx.nextDouble();
        if (height<60){
            System.out.println("short");
        }else if(height>=60&&height<=72){
            System.out.println("medium");
        }else if(height>72){
            System.out.println("tall");
        }
    }
}
