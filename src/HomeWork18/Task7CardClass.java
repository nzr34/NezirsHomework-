package HomeWork18;

import java.util.LinkedList;

public class Task7CardClass {
    /* Create a Card class that will have interest rate field and card type
    and a constructor that will initialize the fields.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/
    static class Card {
        double interestRate;
        String cardType;

        public Card(double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
            System.out.println(cardType + " interest rate is  :" + interestRate);
        }


    }
}
