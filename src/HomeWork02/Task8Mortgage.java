package HomeWork02;

import java.util.Scanner;

public class Task8Mortgage {
    public static void main(String[] args) {

        double mortRate = 4.3;
        int mortPrice = 333000;

        Scanner mortgage = new Scanner(System.in);
        if (mortRate > 4.5) {
            System.out.println("Rates are too high!Client will not buy the house ");

        } else {
            System.out.println("Client will Consider buying the house ");
            if (mortPrice < 200000) {
                System.out.println("Client will pay cash");
            } else if (mortPrice > 200000) {
                System.out.println("Client will take loan out");

                System.out.println("Please enter amount of loan you need: ");
                int loanAmount = mortgage.nextInt();
                if (loanAmount <= 200000) {
                    System.out.println("Your loan application is Approved");
                } else if (loanAmount > 200000) {
                    System.out.println("Your loan application is rejected.");
                }
            }

        }


    }
}
