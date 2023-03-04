package HomeWork20;

import java.util.Map;
import java.util.TreeMap;

public class Task2Test2 {
    /*In Test Class create a Map that will store key in ascending order.
        In that map store personId and a Person Object. Print each object details.*/
    public static void main(String[] args) {
        Map<Integer, Task2Person> personMap = new TreeMap<>();
        personMap.put(123, new Task2Person("John", "Wick", 27, 87000.0));
        personMap.put(234, new Task2Person("David", "Marnock", 45, 127000.0));
        personMap.put(345, new Task2Person("Susan", "Den", 34, 97000.0));
        personMap.put(567, new Task2Person("Alina", "Kocovski", 37, 117000.0));
        for (var print : personMap.entrySet()
        ) {
            System.out.print("Person Id: " + print.getKey() + " ");
            print.getValue().printDetails();

        }

    }
}
