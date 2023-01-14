package Homework2;

public class TemperatureCheck {

    public static void main(String[] args) {

        double temperature = 33;
        if (temperature < 32) {
            System.out.println("Water will freeze with temperature " + temperature+"!");
        } else {
            System.out.println("Water will NOT freeze with temperature " + temperature+"!");
        }
    }
}
