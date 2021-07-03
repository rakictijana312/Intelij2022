package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {

    //Break 1:37
    public static Connection getConnection() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(ConfigReader.getPropertyValue("dbUrl"),
                    ConfigReader.getPropertyValue("dbUserName"),
                    ConfigReader.getPropertyValue("dbPassword"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static ResultSet getResultSet(String query) {
        Connection connection = getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return resultSet;
    }

    public static List<Map<String, String>> getTableDataAsList(String query) {
        ResultSet resultSet = getResultSet(query);
        ResultSetMetaData resultSetMetaData=null;
        List<Map<String,String>> tableList= new ArrayList<>();
        Map<String,String> rowMap=null;
        try {
             resultSetMetaData=resultSet.getMetaData();
             while (resultSet.next()){
                 rowMap=new HashMap<>();
                 for (int i = 1; i <=resultSetMetaData.getColumnCount() ; i++) {
                     rowMap.put(resultSetMetaData. getColumnName(i),resultSet.getString(i));
                 }
                 tableList.add(rowMap);
             }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tableList;
    }

}
