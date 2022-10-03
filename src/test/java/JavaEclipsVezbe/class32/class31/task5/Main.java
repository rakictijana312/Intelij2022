package JavaEclipsVezbe.class32.class31.task5;
//2)Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Albany");
        cities.add("Kiev");
        cities.add("Minsk");
        cities.add("Austin");
        //cities.removeIf(city -> city.startsWith("A"));
        Iterator<String> iterator= cities.iterator();
        while(iterator.hasNext()) {
            String city = iterator.next();
            if(city.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
