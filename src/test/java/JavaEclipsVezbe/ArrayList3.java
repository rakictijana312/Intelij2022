package JavaEclipsVezbe;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Javaa");
        System.out.println(subjects);

        ArrayList<String> subjects2 = new ArrayList<>();
        subjects2.add("Git");
        subjects2.add("Selenium");
        subjects2.add("TestNG");

        subjects.addAll(1, subjects2);//zamenice samo mesta ne znam zasto
        System.out.println(subjects);
        subjects.clear();
        System.out.println(subjects);// print ce biti samo []
    }
}
