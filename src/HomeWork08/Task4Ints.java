package HomeWork08;

public class Task4Ints {
    public static void main(String[] args) {
        int[][] numbers = {{7,28,13},{49,7,6},{7,8,9}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];

            }

        }
        System.out.println("The Sum of all numbers is :"+sum);
    }
}
