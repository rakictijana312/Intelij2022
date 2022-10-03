package JavaEclipsVezbe.class32.class31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(1000);
        LinkedList<String> linkedList=new LinkedList<>();

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("ABZ");
        treeSet.add("AC");
        treeSet.add("AD");

        System.out.println(treeSet);
    }
}
