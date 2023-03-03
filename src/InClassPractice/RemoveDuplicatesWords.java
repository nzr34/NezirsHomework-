package InClassPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesWords {
    public static void main(String[] args) {


        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        LinkedHashSet<String> bList = new LinkedHashSet<>(aList);
        System.out.println(bList);
    }
}