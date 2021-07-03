package steps;

import utils.DbUtils;

import java.util.List;
import java.util.Map;

public class DbUtilTester {
    public static void main(String[] args) {
        List<Map<String, String>> tableDataAsList = DbUtils.getTableDataAsList("select emp_firstname," +
                "emp_middle_name,emp_lastname" +
                " from hs_hr_employees where emp_number='17551';");
        System.out.println(tableDataAsList);
    }
    //Break till 1:30
}
