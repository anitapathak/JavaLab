import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anita";
        String username = "root";
        String password = "anita346";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}

