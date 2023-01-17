package Homework5;

public class Task5SumOfNumbers {
    public static void main(String[] args) {
        /*5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
         */
        int[]numbers=new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 51;
        int sum=0;
        for (int i= 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        } System.out.println(sum);

    }
}
