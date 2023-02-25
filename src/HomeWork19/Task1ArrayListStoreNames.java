package HomeWork19;

import java.util.ArrayList;

public class Task1ArrayListStoreNames {
    /*1) Create an ArrayList that will store 5 names into it.
         Find out whether the given ArrayList is empty or not?
         Check whether the specific name is present in an ArrayList or not?
         Find the size of your arrayList and print all values from that*/
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("john");
        names.add("Billy");
        names.add("David");
        names.add("Susan");
        names.add("Sores");
        boolean empty = names.isEmpty();
        System.out.println(empty);
        System.out.println(names.contains("Billy"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
