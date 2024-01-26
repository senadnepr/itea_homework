package sena;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 09.10.2017.
 */
public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB";
    private static final String LOGIN = "sergchumakov";
    private static final String PASSWORD = "winter";

    private static final String SQL_GET_EMPLOYEEINFORMATION =
            " SELECT FName, LName, MName, Phone1, t2.Address as Address " +
                    " FROM Employees t1 " +
                    " LEFT JOIN EmployeeInformation t2 " +
                    " ON t1.ID = t2.EmployeeID;";

    private static final String SQL_GET_SINGLEEMPOLEYEECONTACTS =
            " SELECT FName, LName, MName, Phone1, t2.Birthday as Birthday " +
                    " FROM Employees t1\n" +
                    "         LEFT JOIN EmployeeInformation t2 " +
                    "                   ON t1.ID = t2.EmployeeID " +
                    " WHERE IsMarried = false;";

    private static final String SQL_GET_EMPOLEYEECONTACTS_ON_POSITION =
            " SELECT FName, LName, MName, Phone1, t2.Birthday as Birthday " +
                    " FROM Employees t1 " +
                    "         LEFT JOIN EmployeeInformation t2 " +
                    "                   ON t1.ID = t2.EmployeeID " +
                    "         LEFT JOIN PositionInformation t3 " +
                    "                   ON t1.ID = t3.EmployeeID " +
                    " WHERE Position = ?;";

    public DBWorker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<EmployeeInformation> getAllEmployeeInformation() {
        Connection connection = null;
        Statement statement = null;
        List<EmployeeInformation> employeeInformations = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_EMPLOYEEINFORMATION);
//            FName, LName, MName, Phone1, t2.Birthday
            while (resultSet.next()) {
                EmployeeInformation employeeInformation =
                        new EmployeeInformation();
                employeeInformation.setfName(resultSet.getString("FName"));
                employeeInformation.setlName(resultSet.getString("LName"));
                employeeInformation.setmName(resultSet.getString("MName"));
                employeeInformation.setPhone( resultSet.getString("Phone1"));
                employeeInformation.setAddress(resultSet.getString("Address"));
                employeeInformations.add(employeeInformation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employeeInformations;
    }

    public List<EmployeeInformation> getSingleEmpoleyeeContacts() {
        Connection connection = null;
        Statement statement = null;
        List<EmployeeInformation> singleEmpoleyeeContacts = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_SINGLEEMPOLEYEECONTACTS);

            while (resultSet.next()) {
                EmployeeInformation employeeInformation =
                        new EmployeeInformation();
                employeeInformation.setfName(resultSet.getString("FName"));
                employeeInformation.setlName(resultSet.getString("LName"));
                employeeInformation.setmName(resultSet.getString("MName"));
                employeeInformation.setPhone( resultSet.getString("Phone1"));
                employeeInformation.setBirthday(resultSet.getString("Birthday"));
                singleEmpoleyeeContacts.add(employeeInformation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return singleEmpoleyeeContacts;
    }

    public List<EmployeeInformation> getEmpoleyeeContactsOnPosition(String position) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<EmployeeInformation> singleEmpoleyeeContacts = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(SQL_GET_EMPOLEYEECONTACTS_ON_POSITION);

            statement.setString(1, position);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                EmployeeInformation employeeInformation =
                        new EmployeeInformation();
                employeeInformation.setfName(resultSet.getString("FName"));
                employeeInformation.setlName(resultSet.getString("LName"));
                employeeInformation.setmName(resultSet.getString("MName"));
                employeeInformation.setPhone( resultSet.getString("Phone1"));
                employeeInformation.setBirthday(resultSet.getString("Birthday"));
                singleEmpoleyeeContacts.add(employeeInformation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return singleEmpoleyeeContacts;
    }

}
