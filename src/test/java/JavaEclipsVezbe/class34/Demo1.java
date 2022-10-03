package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args)  {
        System.out.println("Important code");
        System.out.println("Important code");
        String path="C:\\Users\\tijan\\Desktop\\userData.xlsx";
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
//            String name=null;
//            name.length();

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("Catch block");
            System.out.println("Catch block");
        }

        System.out.println("Importqant code after try cath ");
        System.out.println("Importqant code after try cath ");

//regerdgrdg


    }
}
