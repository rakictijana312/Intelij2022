package JavaEclipsVezbe.class32.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> students=new HashMap<>();
        students.put(1,"Karina");
        students.put(2,"Roheen");
        students.put(3,"Bryan");
        students.put(4,"Ariana");
        students.put(5,"Ariana");

        Collection<String> values = students.values();
        for (String student:values
             ) {
            System.out.println(student);
        }

        Set<Integer> keys=students.keySet();

        for (Integer key:keys
             ) {
            System.out.println(key);
        }


    }
}
