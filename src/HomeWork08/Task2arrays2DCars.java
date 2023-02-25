package HomeWork08;

public class Task2arrays2DCars {
    public static void main(String[] args) {
        String[][] cars = {{"American cars: ", "Ford,", "Chevy,", "Dodge."},
                            {"German cars: ", "BMW,", "Mercedes,", "Audi."},
                            {"Korean cars: ", "Hyundai,", "Kia.", "Genesis."},
                            {"Italian cars: ", "Ferrari,", "Lamborghini,", "Maserati."}};

// First loop: using for-each loop
        for (String[] carGroup : cars) {
            for (String car : carGroup) {
                System.out.print(car + " ");
            }
            System.out.println();
        }
        System.out.println("<><><><><><><><><><><><><>");
// Second loop: using for loop
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
