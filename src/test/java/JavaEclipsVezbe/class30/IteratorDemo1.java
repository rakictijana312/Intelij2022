package class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        System.out.println(subjects);
        Iterator<String> iterator=subjects.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(subjects);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(subjects);
         iterator=subjects.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(subjects);
      //  System.out.println(iterator.next());

    }
}
