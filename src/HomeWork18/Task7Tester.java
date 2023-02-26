package HomeWork18;

import java.util.LinkedList;

public class Task7Tester {
    public static void main(String[] args) {

        LinkedList<Task7CardClass.Card> cards = new LinkedList<>();
        cards.add(new Task7CardClass.Card(17.78, "Amex"));
        cards.add(new Task7CardClass.Card(21.00, "Citi"));
        cards.add(new Task7CardClass.Card(25.00, "Bofa"));

        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).cardType+" :"+cards.get(i).interestRate);

        }
        for (Task7CardClass.Card card : cards) {
            System.out.println(card.cardType + " :" + card.interestRate);

        }



    }
}


