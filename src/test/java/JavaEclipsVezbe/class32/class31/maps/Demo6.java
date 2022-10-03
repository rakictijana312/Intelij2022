package JavaEclipsVezbe.class32.class31.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);

        Set<String> mapKeys = groceries.keySet();
        for (String key:mapKeys
        ) {
         if(groceries.get(key)<=15){
             groceries.remove(key);
         }
        }
    }

}
