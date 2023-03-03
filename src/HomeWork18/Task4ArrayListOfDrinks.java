package HomeWork18;

import java.util.ArrayList;

public class Task4ArrayListOfDrinks {
    /*4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.  */
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coca Cola");
        drinks.add("Sprite");
        drinks.add("Wine");
        drinks.add("Ice tea");
        drinks.add("Coffee");
        drinks.add("Tea");
        System.out.println(drinks);
        for (String drink : drinks) {
            System.out.print(" " + drink);

        }
        System.out.println();
        System.out.println("<><><><><><><><><>After<><><><><><><><><>");
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }


        }
        System.out.println(drinks);
        for (String drink : drinks) {
            System.out.print(" " + drink);

        }
    }
}
