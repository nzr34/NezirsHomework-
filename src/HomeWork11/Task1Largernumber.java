package HomeWork11;

public class Task1Largernumber {

    /*Create a method that will take 2 parameters as a numbers and prints which number is larger.*/
    int largerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Task1Largernumber two = new Task1Largernumber();
        System.out.println(two.largerNumber(10, 20));
    }
}


