package HomeWork02;

import java.util.Scanner;

public class DMVrepresentative {
    public static void main(String[] args) {

        Scanner dmv=new Scanner(System.in);

        System.out.println("Please Enter your age :");

        int age= dmv.nextInt();
        if(age>=18){
            System.out.println("We will isue your Driver Licence!");
        }else{
            System.out.println("You are not old enough, you can get a learners permit");
        }

    }
}
