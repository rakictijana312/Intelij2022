package class30;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("Z");
        names.add("G");
        names.add("J");
        names.add("F");
        names.add("A");
        names.add("T");

        ArrayList<String> listFromSet=new ArrayList<>(names);
        System.out.println(names);
        for (String name:names
             ) {
            System.out.println(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(listFromSet.get(i));
        }
    }
}
