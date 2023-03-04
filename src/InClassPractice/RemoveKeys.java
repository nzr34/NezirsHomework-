package InClassPractice;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeys {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        studentsMap.put(5, "Gul");
        studentsMap.put(6, "Bahar");
        studentsMap.put(7, "Saba");
            /*studentsMap.keySet().removeIf(x->x>2);
            System.out.println(studentsMap);*/
        /*Set<Integer>allKEys=studentsMap.keySet();
        System.out.println(allKEys);
        allKEys.removeIf(x->x>2);
        System.out.println(allKEys);*/
        studentsMap.values().removeIf(x -> x.contains("i"));
        System.out.println(studentsMap);


    }
}
