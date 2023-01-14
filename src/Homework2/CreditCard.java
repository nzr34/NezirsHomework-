package Homework2;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        boolean creditCard=true;
        double cardBalance=0.0;
        Scanner cc=new Scanner(System.in);
        System.out.println("Do you have Credit Card(true or false) :");
        creditCard=cc.nextBoolean();
        if(creditCard){
            System.out.println("What is your balance?");
            cardBalance=cc.nextDouble();
            if(cardBalance>1000){
                System.out.println("Please Pay your balance immediately!");
            }else{
                System.out.println("You can Spend More. yayyyy");
            }
        }else {
            System.out.println("Would you like a Credit card with great APR,CashBack and $500 Bonus!");
            }

        }
    }

