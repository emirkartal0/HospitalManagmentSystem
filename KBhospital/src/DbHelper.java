import java.sql.*;
import java.util.ArrayList;

public class DbHelper {
    private String userName = "";
    private String password = "";
    private String dbUrl = "";

    public void showError(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error: " + exception.getErrorCode());
    }

    Connection connection = null;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

  

}
















