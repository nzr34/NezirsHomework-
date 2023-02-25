package HomeWork19;

import java.util.ArrayList;

public class Task2ArrayListOfCars {
    /*1) 2)Create an arraylist of cars and retrieve all the values using 3 different ways.*/
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("Hyundai Santa Fe");
        cars.add("Tesla S Model");
        cars.add("Toyota Camry");
        cars.add("Honda Civic");
        cars.add("BMW M5i");

        System.out.println(cars);
        System.out.println(cars.get(3));
        System.out.println(cars.indexOf("Honda Civic"));
        for (String car:cars) {
            System.out.println(car);
        }


        }
    }

