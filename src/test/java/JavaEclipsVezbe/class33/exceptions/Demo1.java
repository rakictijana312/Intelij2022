package class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args)  {
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\userData.xlsx";
        /*try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("File not found try again");
            System.out.println("Sent a email to support to fix the file ");
        }*/

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (Exception e){
            System.out.println("File is not found");
            System.out.println("An email has been sent to the support channel");

        }

        System.out.println("Important code");
        System.out.println("other code ");
        System.out.println("other code ");
        System.out.println("other code ");

        System.out.println("other code ");
        System.out.println("other code ");
        System.out.println("other code ");
        System.out.println("other code ");
        System.out.println("other code ");
    }
}
