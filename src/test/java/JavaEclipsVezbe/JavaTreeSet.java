package JavaEclipsVezbe;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("F");
        names.add("I");
        names.add("E");
        names.add("C");
        names.add("A");
        names.add("B");

        ArrayList<String> listFromSet = new ArrayList<>(names);
        System.out.println(names); //print in accending order I think, not sure
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(listFromSet.get(i)); //nisam sigurna
        }
    }
}