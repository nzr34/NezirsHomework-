package Homework6;

import java.util.Scanner;

public class Task2ArrCountry {
    public static void main(String[] args) {
        /*2)Using Scanner create an array of countries.
        When an array is created,
        retrieve all values from it and while retrieving those
        values print capital for each country. (use 2 different loops).*/
        Scanner input=new Scanner(System.in);
        String[]countries=new String[5];
        String[]capitals= new String[5];
        System.out.println("Please enter 5 countries:");
        for (int i= 0; i < countries.length; i++) {
            countries[i]=input.nextLine();
        }
        System.out.println("Please enter capital for each country you entered!");
        for (int j = 0; j < capitals.length; j++) {
            capitals[j]=input.nextLine();
        }
        for (int t = 0; t < countries.length; t++) {
        System.out.println("The capital of "+countries[t]+" is :"+capitals[t]);
      }
    }
}

