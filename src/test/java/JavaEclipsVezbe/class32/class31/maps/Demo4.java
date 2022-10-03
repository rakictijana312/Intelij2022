package JavaEclipsVezbe.class32.class31.maps;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);
        Set<Map.Entry<String,Double>> entrySet =groceries.entrySet();
        LinkedList<Map.Entry<String,Double>>linkedList=new LinkedList<>(entrySet);
        for (Map.Entry<String,Double> entry:entrySet
             ) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
