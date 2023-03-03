package InClassPractice;

import java.util.TreeSet;

public class Countries {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Usa");
        countries.add("France");
        countries.add("Germany");
        System.out.println(countries);
        for (String a : countries
        ) {
            System.out.println(a);

        }
    }
}
