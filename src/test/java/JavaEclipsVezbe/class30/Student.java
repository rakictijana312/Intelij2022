package class30;

import java.util.Objects;

public class Student {
        int rollno;
        String name;
        int age;
        Student(int rollno,String name,int age)
        {
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return  Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
