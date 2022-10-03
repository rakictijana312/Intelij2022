package class30;

import java.util.ArrayList;
import java.util.Objects;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Amna",35));
        students.add(new Student(2,"Amna",25));
        students.add(new Student(3,"Kseniia",105));
        students.add(new Student(4,"afzal",15));
        students.add(new Student(5,"Asghar",18));
        students.add(new Student(6,"Nazir",40));
        Student student=new Student(3,"Kseniia",105);
        Student student1=new Student(5,"Asghar",18);
        Student student2=new Student(6,"Nazir",40);

        students.remove(student);
        students.remove(student1);
        students.remove(student2);
        System.out.println(students);


    }
}
