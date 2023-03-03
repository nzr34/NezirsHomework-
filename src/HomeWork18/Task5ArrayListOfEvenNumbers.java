package HomeWork18;

import java.util.ArrayList;

/*5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/
public class Task5ArrayListOfEvenNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);

        }
        System.out.println(evenNumbers);
        evenNumbers.removeIf(num -> num % 5 == 0);
        System.out.println(evenNumbers);
    }
}


