package JavaEclipsVezbe.class32.tasks;

import java.util.*;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Ukraine","Kiev");
        countries.put("United States","Washington DC");
        countries.put("Albania","Tirana");
        countries.put("Algeria","Algiers");
        countries.put("Angola","Luanda");
        countries.put("Mali","Bamako");
        countries.put("Malta","Valletta");
        countries.put("Mexico","Mexico City");
        countries.put("Morocco","Rabat");
        countries.put("Nepal","Kathmandu");
        Set<String> mapCountries=countries.keySet();
        for(String key:mapCountries){
            System.out.println(key+": "+countries.get(key));
        }

        Iterator<String> it = mapCountries.iterator();
        while(it.hasNext()){
            String country = it.next();
            System.out.println(country+" "+countries.get(country));
    }


        Collection<String> values=countries.values();
        for(String value:values){
            System.out.println(value);
        }

        Iterator<String> iterator=values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
