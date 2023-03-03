package HomeWork08;

public class Task6Countries {
    public static void main(String[] args) {
        String[][] countries = {
                {"North America :", "United States", "Canada", "Mexico"},
                {"South America :", "Brazil", "Argentina", "Colombia"},
                {"Europe        :", "France", "Germany", "United Kingdom"},
                {"Asia          :", "China", "India", "Japan"},
                {"Africa        :", "Nigeria", "Egypt", "South Africa"}};
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total country in the array is :" + (count - 5));
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
        for (String[] country : countries) {
            for (int j = 0; j < country.length; j++) {
                System.out.print(country[j] + " ");

            }
            System.out.println();
        }
        System.out.println("Total country in the array is :" + (count - 5));
    }
}
