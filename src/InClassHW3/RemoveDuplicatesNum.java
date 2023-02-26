package InClassHW3;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesNum {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);
        LinkedHashSet<Integer>num=new LinkedHashSet<>(numbers);
        System.out.println(num);

    }
}