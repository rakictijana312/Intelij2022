package JavaEclipsVezbe.class32.class31.task4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//
//1)Create a Set collection in which you need to add names of the countries.
//        In this set we want all objects to be sorted in alphabetical order.
//        Using 2 different ways retrieve all elements from set.

public class Main {
    public static void main(String[] args) {

            Set<String> countries = new TreeSet<>();
            countries.add("Ukraine");
            countries.add("Poland");
            countries.add("Spain");
            countries.add("USA");
            countries.add("Germany");
            countries.add("Russia");
            countries.add("China");
            for(String country:countries){
                System.out.print(country+" ");
            }
            System.out.println();
            System.out.println(countries);
           Iterator<String> iterator =countries.iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next());
           }

    }
}
