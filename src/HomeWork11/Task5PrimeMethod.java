package HomeWork11;

public class Task5PrimeMethod {
   static int primeChecker(int num) {
       /*5) Write a method to return whether given number is prime or not?
        */

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(primeChecker(7));
    }
}
