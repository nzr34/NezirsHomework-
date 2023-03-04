package HomeWork20;

import java.util.HashMap;
import java.util.Map;
            /*Create a map of Best Buy store. Place
            item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
            Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Task1BestBuyStore {
    public static void main(String[] args) {
        Map<Integer,String>bestBuy=new HashMap<>();
        bestBuy.put(76648447,"Printer");
        bestBuy.put(87658769,"Toner");
        bestBuy.put(76876999,"Camera");
        bestBuy.put(56456568,"Head Phones");
        for (var a:bestBuy.entrySet()
             ) {
            System.out.println("Key: "+a.getKey()+" Value: "+a.getValue());
        }
    }
}
