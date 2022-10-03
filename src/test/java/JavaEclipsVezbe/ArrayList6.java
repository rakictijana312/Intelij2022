package JavaEclipsVezbe;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
    /*    ArrayList arrayList=new ArrayList();
        arrayList.add("azizi");
        arrayList.add("ram");
        arrayList.add("mirage");

     //   arrayList.add(10);

        for (Object ob:arrayList) {
       //     System.out.print(((String)ob).length());
        }

*/
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("azizi");
        arrayList2.add("ram");
        arrayList2.add("mirage");
        // arrayList2.add(10);

        for (String ob:arrayList2) {
            System.out.println(ob.length()); //5 3 6 -isprintace koliko karaktera imaju
        }

    }
}


