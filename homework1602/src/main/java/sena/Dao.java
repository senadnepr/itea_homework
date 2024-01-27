package sena;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 27.01.2024
 */
public class Dao {

    private final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB";
    private static final String LOGIN = "sergchumakov";
    private static final String PASSWORD = "winter";

    public List<String> sqlRequest(String request) {

        Connection connection = null;
        Statement statement = null;
        List<String> responseList = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(request);
            ResultSetMetaData metadata = resultSet.getMetaData();
            int columnCount = metadata.getColumnCount();
            while (resultSet.next()) {
                String row = "";
                for (int i = 1; i <= columnCount; i++) {
                    row += resultSet.getString(i) + " ";
                }
                responseList.add(row);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return responseList;
    }
}
