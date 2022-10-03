package JavaEclipsVezbe.class32.tasks;

import java.util.*;
//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.

public class Task3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> bestBuy = new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(7983923, "Iron");
        bestBuy.put(7648693, "Kettle");

     //  Iterator<Map.Entry<Integer,String>> entrySet=bestBuy.entrySet().iterator();
        Set<Map.Entry<Integer,String>> set=bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = bestBuy.entrySet().iterator(); //Use ALT+Enter to introduce a variable

        //HashMap<TreeMap<LinkedHashMap<Set<ArrayList<String>>>>>
        while (iterator.hasNext()){
           Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
