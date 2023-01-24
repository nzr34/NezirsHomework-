package Homework6;

public class Task5OddEvenSum {


        public static void main(String[] args) {
            int[][] numbers
                    = {{11, 20, 31},
                    {41, 50, 60},
                    {7, 60, 9}};
            int sumeven = 0;
            int sumodd = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    if(numbers[i][j]%2==0){
                        sumeven+=numbers[i][j];
                    } else if (numbers[i][j]%2!=0) {
                        sumodd+=numbers[i][j];

                    }
                }
            }
            System.out.println("The sum of even numbers is: " + sumeven);
            System.out.println("The sum of odd numbers is: " + sumodd);
        }
    }


