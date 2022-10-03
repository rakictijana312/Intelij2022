package JavaEclipsVezbe.class32.tasks;

import java.util.TreeMap;
//

public class Task1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> building=new TreeMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(1,"Google");
        building.put(3,"Google");
        building.put(1,"IBM");
        building.put(4,"Apple");
        building.put(10,"Amazon");
        System.out.println(building.get(1));
        System.out.println(building);
        System.out.println(building.size());
        building.put(100,"Microsoft");
        System.out.println(building);
        building.replace(4,"Netflix");
        System.out.println(building);
        building.remove(100);
        System.out.println(building);

    }
}
