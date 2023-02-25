package HomeWork19;

import java.util.ArrayList;

public class Task3ArrayListOfWords {
    /*3)Create an arrayList of words. Remove every word that ends with “e”. */
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("Mouse");
        words.add("Den");
        words.add("Glass");
        words.add("Tree");
        words.add("Forest");
        words.add("Dana");
        words.removeIf(x -> x.endsWith("a"));
        System.out.println(words);

    }
}
