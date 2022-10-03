package JavaEclipsVezbe;

import java.util.ArrayList;

public class IteratorArrayList {

        public static void main(String[] args) {
            ArrayList<String> subjects=new ArrayList<>();
            subjects.add("SDLC");
            subjects.add("Manual Testing");
            subjects.add("Java");
            subjects.add("Git");
            subjects.add("Selenium");
            subjects.add("TestNG");
            for (int i = subjects.size()-1; i >=0 ; i--) {
                if(subjects.get(i).length()>4){
                    subjects.remove(subjects.get(i));
                }
                System.out.println(subjects.get(i).length());
            }

        }
    }

