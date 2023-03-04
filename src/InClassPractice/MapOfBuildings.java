package InClassPractice;

import java.util.HashMap;

/*/*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/
public class MapOfBuildings {

    public static void main(String[] args) {
        HashMap<Integer, String> floorPlan = new HashMap<>();
        floorPlan.put(1, "Google");
        floorPlan.put(2, "Apple");
        floorPlan.put(3, "Twitter");
        floorPlan.put(4, "Google");
        floorPlan.put(5, "JavaBrains");
        floorPlan.put(6, "Oracle");
        floorPlan.put(7, "Verizon");
        System.out.println(floorPlan.size());
        System.out.println(floorPlan);
        floorPlan.replace(4, "Heinz");
        floorPlan.remove(7);
        System.out.println(floorPlan);


    }
}
