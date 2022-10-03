package JavaEclipsVezbe;

import java.util.ArrayList;

public class ArrayList4 {

        public static void main(String[] args) {
            ArrayList<String> subjects=new ArrayList<>();
            subjects.add("SDLC");
            subjects.add("Manual Testing");
            subjects.add("Java");

            System.out.println(subjects.contains("SDLC")); //CONTAINS true
            System.out.println(subjects.contains("Selenium"));//CONTAINS falls

            System.out.println(subjects.containsAll(subjects)); //CONTAINS ALL false
        }

}
