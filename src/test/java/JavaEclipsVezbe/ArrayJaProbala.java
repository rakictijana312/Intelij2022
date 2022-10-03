package JavaEclipsVezbe;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayJaProbala {
    public static void main(String args[]) {
        ArrayList<String> o = new ArrayList<>();
        o.add("Ana");
        o.add("Mihailo");
        o.add("Tijana");
        System.out.println(o);//bolje printa


        System.out.println("----------------");

        for (String m : o) {
            System.out.println(o);//ovo printa u tri reda


        }
    }
}






