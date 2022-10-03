package JavaEclipsVezbe.class32.class31.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);
        System.out.println(groceries);

        groceries.remove("tomato");
        System.out.println(groceries);

        groceries.put(null,null);
        groceries.put("Rice",155.0);
        groceries.put("Apple",null);
        groceries.put("orange",null);
        System.out.println(groceries);

        groceries.replace("orange",35.0);
        System.out.println(groceries);

        groceries.put("eggs",1000.0);
        System.out.println(groceries);

    }
}
