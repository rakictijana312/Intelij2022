package steps;

import utils.ConfigReader;
import utils.Constants;
import utils.DbUtils;

import java.util.List;
import java.util.Map;

public class DBUtilTester {
    public static void main(String[] args) throws ClassNotFoundException {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        String query="select * from employee";
        List<Map<String, String>> tableDataAsListOfMaps = DbUtils.getTableDataAsListOfMaps(query);
        System.out.println(tableDataAsListOfMaps);
    }
}
