package HomeWork11;

public class Task4CountryLanguage {


    static String hello(String countryName) {
        /*Create a method that will say Hello in different language based on the country that will passed when method is executed*/

        switch (countryName) {
            case "Italy":
                return "Ciao";
            case "USA":
                return "Hello";
            case "Russia":
                return "Privyet";
            case "France":
                return "Salut";
            default:
                return "Not valid ";
        }
    }

    public static void main(String[] args) {
        System.out.println(hello("Italy"));

    }


}
