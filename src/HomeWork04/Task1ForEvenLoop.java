package HomeWork04;

public class Task1ForEvenLoop {
    public static void main(String[] args) {
        for (int x = 20; x >= 0; x -= 2) {
            System.out.println(x);
        }
        for (int x = 21; x >= 0; x -= 1) {
            if (x % 2 == 0) {

                System.out.println(x);

            }
        }
    }
}
