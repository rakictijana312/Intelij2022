package class29;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int a=2147483647;
       // double[] array=new double[2147483647];

        String[] names=new String[40];
        names[0]="Monika";
        names[1]="Yanci";
       // names[2]="MJ"; CE
      //  names=new String[3];
        String[] names2=new String[3];
        names2[0]=names[0];
        names2[1]=names[1];
        names2[2]="MJ";

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));

        int array[]={10,20,30,40,50,60};

        System.out.println( Arrays.stream(array).sum());



    }
}
