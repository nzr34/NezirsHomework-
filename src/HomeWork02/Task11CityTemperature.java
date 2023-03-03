package HomeWork02;

import java.util.Scanner;

public class Task11CityTemperature {
    public static void main(String[] args) {


        Scanner ct = new Scanner(System.in);
        System.out.println("Please enter your current city :");
        String city = ct.nextLine();
        System.out.println("Please enter temperature(F)");
        double temperature = ct.nextDouble();
        System.out.println("The temperature is " + ((temperature - 32) * 5 / 9) + " Celsius. The city is " + city + ".");
    }
}