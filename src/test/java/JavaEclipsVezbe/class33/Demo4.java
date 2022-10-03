package class33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\userData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        ArrayList<Person> arrayList=new ArrayList<>();
        for (int i = 1; i <noOfRows ; i++) {
            Row row=sheet.getRow(i);
            String firstName=row.getCell(0).toString();
            String lastName=row.getCell(1).toString();
            String gender=row.getCell(2).toString();
            Person person=new Person(firstName,lastName,gender);
            arrayList.add(person);
        }
        System.out.println(arrayList);
    }
}
