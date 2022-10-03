package JavaEclipsVezbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class PrintArray {

    public static void main(String[] args) {
        //Print ArrayList
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("manual");
        System.out.println(subjects.size());
        System.out.println(subjects);
        for (String m : subjects) {
            System.out.println(subjects); //tri puta ponavlja print


        }

        subjects.add("SDLC");
        System.out.println(subjects.size());
        System.out.println(subjects);

        System.out.println("----------LINKEDIN LIST ---------");
        List<String> syntaxStudentList = new LinkedList<>();
        syntaxStudentList.add("Eugene");
        syntaxStudentList.add("Afzal");
        syntaxStudentList.add("Ram");
        System.out.println(syntaxStudentList);

        syntaxStudentList.remove("Ram");
        System.out.println(syntaxStudentList);

        System.out.println("------------PRIMITIVES OF INTIGER-----------");
        int[] array = {10, 20, 30, 40, 50,};
        for (int element : array) {
            if (element == 100) {
                System.out.println("found");
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        //arrayList.add("sbgks");
        System.out.println(arrayList.contains(10));
        System.out.println(arrayList);


        System.out.println("-----ARRAY OF OBJECT REFFERENCES--------");
        // Array of object references:
        String[] strArray = {"John", "Mary", "Bob"};
        System.out.println(Arrays.toString(strArray));


        System.out.println("------ARRAY OF PRIMITIVES-------");
        //Array of primitives
        int[] array1= {1, 2, 3, 4, 5};
        for (int element : array1) {
            System.out.println(array1);//we cant work with primitives
            System.out.println("ARRAY OF PRIMITIVES " + array1); //nije tacno


            System.out.println("---MULTIDIMENZIONAL----------");
            //Multi dimensional array
            int[][] arrayy = {{1, 2}, {3, 4}, {5, 6, 7}};
            System.out.println(Arrays.deepToString(arrayy));

            System.out.println("-------MULTIDIMENZIONAL 2------");
            //Nisam sigurna multi dimenzional za strings????
            String[][] arrray = {{"tijana", "Mihailo"}, {"radica", "darko"}};
            System.out.println(Arrays.deepToString(arrray));


        }
    }
}