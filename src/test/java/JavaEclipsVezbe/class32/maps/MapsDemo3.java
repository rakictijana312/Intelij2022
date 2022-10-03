package JavaEclipsVezbe.class32.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapsDemo3 {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> items = new LinkedHashMap<>();
        items.put("soap", 5.2);
        items.put("shirt", 10.2);
        items.put("pillow", 12.0);
        items.put("blanket", 8.3);
        System.out.println(items.size());
        System.out.println(items);
        Set<String> keys = items.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("o")) {
                iterator.remove();
            }
        }

        System.out.println(items);


    }
}
