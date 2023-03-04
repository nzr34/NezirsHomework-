package HomeWork20;

import java.util.*;

public class Task4Strings {
    /*)Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        LinkedHashSet<String>uniqueStrings=new LinkedHashSet<>();
        uniqueStrings.add("HE");
        uniqueStrings.add("LL");
        uniqueStrings.add("O");
        uniqueStrings.add("JA");
        uniqueStrings.add("VA");
        uniqueStrings.add("<>");
        uniqueStrings.add("he");
        uniqueStrings.add("ll");
        uniqueStrings.add("o");
        uniqueStrings.add("ja");
        uniqueStrings.add("va");
        for (var a:uniqueStrings
             ) {
            System.out.print(a);
        }


    }
}
