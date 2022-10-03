package class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\userData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
       // XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noRowsInSheet=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < noRowsInSheet; i++) {

            Row row=sheet.getRow(i);
            if(i==0){
                Cell cell=row.createCell(3);
                cell.setCellValue("Salary");
            }else {
                Cell cell=row.createCell(3);
                Random random=new Random();
                cell.setCellValue(random.nextInt(150000));

            }


        }
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
