package JavaEclipsVezbe.class32.file;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\tijan\\IdeaProjects\\JavaBatch9\\Files\\userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=excelFile.getSheet("Sheet1");
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);





    }
}
