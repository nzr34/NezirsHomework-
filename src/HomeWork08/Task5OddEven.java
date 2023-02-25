package HomeWork08;

public class Task5OddEven {
    public static void main(String[] args) {
        int[][] numbers = {{7,28,13,65},{49,7,6,90},{7,8,9,8}};
        int sum=0;
        System.out.print("The Even Numbers are :");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+", ");
                }

            }

        }

    }
}
