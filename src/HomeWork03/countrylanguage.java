package HomeWork03;

import java.util.Scanner;

public class countrylanguage {
        public static void main(String[] args) {
            Scanner scinput = new Scanner(System.in);
            System.out.print("Please enter your country: ");
            String country = scinput.nextLine();


            switch (country.toLowerCase()) {
                case "india":
                    System.out.println("You Speak Hindi");
                    break;
                case "spain":
                    System.out.println("You Speak Spanish");
                    break;
                case "united states":
                    System.out.println("You Speak English");
                    break;
                case "france":
                    System.out.println("You Speak French");
                    break;
                case "china":
                    System.out.println("You Speak chinese");
                    break;
                case "russia":
                    System.out.println("You Speak Russian");
                    break;
                default:
                    System.out.println("invalid country");
            }
            }
    }

