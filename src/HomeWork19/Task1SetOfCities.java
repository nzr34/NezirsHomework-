package HomeWork19;

import java.util.LinkedHashSet;

public class Task1SetOfCities {
    public static void main(String[] args) {
        LinkedHashSet<String> countries = new LinkedHashSet<>();
        countries.add("Paris");
        countries.add("France");
        countries.add("Athens");
        countries.add("Auckland");
        countries.add("Istanbul");
        countries.removeIf(a -> a.startsWith("A"));
        System.out.println(countries);

    }
}
