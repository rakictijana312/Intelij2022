package utils;

import io.cucumber.java.it.Ma;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {
    public static Connection getConnection() {
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
        ResultSet resultSet = null;
        try {
            resultSet = getConnection().createStatement().executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public static List<Map<String, String>> getTableDataAsListOfMaps(String query) {
        ResultSet resultSet = getResultSet(query);
        ResultSetMetaData resultSetMetaData;
        List<Map<String, String>> tableData = new ArrayList<>();
        Map<String, String> row;
        try {

            resultSetMetaData = resultSet.getMetaData();
            while (resultSet.next()) {
                row = new HashMap<>();
                for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                row.put(resultSetMetaData.getColumnName(i),resultSet.getString(i));
                }
                tableData.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return tableData;

    }
}
