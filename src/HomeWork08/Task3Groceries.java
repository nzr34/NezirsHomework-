package HomeWork08;

public class Task3Groceries {
    public static void main(String[] args) {
        String[][] groceryList = {{"Veggies: ", "Carrots", "Broccoli", "Spinach", "Celery"},
                                  {"Fruits: ", "Apples", "Bananas", "Oranges", "Grapes"},
                                  {"Dairy: ", "Milk", "Cheese", "Yogurt", "Butter"},
                                  {"Sweets: ", "Cake", "Cookies", "Ice cream", "Candy"}};
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");


            }
            System.out.println();

        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
        for (String[] strings : groceryList) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }

}}
