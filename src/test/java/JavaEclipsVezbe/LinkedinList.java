package JavaEclipsVezbe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedinList {
    public static void main(String[] args) {
        List<String> syntaxStudentList = new LinkedList<>();
        syntaxStudentList.add("Eugene");
        syntaxStudentList.add("Afzal");
        syntaxStudentList.add("Ram");
        System.out.println(syntaxStudentList);

        syntaxStudentList.remove("Ram");
        System.out.println(syntaxStudentList);

    }
}