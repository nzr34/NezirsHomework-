package Homework10;

import java.lang.reflect.Array;

public class Task4ReverseString {
    public static void main(String[] args) {
        String a="Lets reverse all the words in this sentence";
        String[]b=a.split(" ");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }
}
