package HomeWork20;

import java.util.LinkedList;
import java.util.List;

public class Task5IntegerSum {
    //Create a collection of integers in which you can keep duplicates.
    public static void main(String[] args) {
        List<Integer>numbers=new LinkedList<>();
        numbers.add(5);
        numbers.add(56);
        numbers.add(5);
        numbers.add(30);
        numbers.add(64);
        numbers.add(30);
        numbers.add(59);
        numbers.add(59);
        numbers.add(50);
        numbers.add(85);
        //Write a logic to find sum of all integers
        int sum=0;
        for (var num:numbers
             ) {
            System.out.print(num+"+");
          sum+=num;
        }
        System.out.println("==>>"+sum+" Total!");
    }
}
