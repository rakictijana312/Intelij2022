package JavaEclipsVezbe.class32.class31.maps;


import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mike");
        arrayList.indexOf("Mike");

        Map<Integer,String> map=new TreeMap<>();
        map.put(123456,"Azizi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Mike");
        map.put(123410,"Jon");

        Map<Integer,String> map2=new TreeMap<>();
        map2.put(1234,"Azizi");
        map2.put(123,"Ram");
        map2.put(1238,"Eugene");
        map2.put(1235,"Saleem");
        map2.put(12341,"MJ");

        map2.putAll(map);
        System.out.println(map2);
        map2.remove(12341);
        System.out.println(map2);
        System.out.println(map2.get(1238));



    }
}
