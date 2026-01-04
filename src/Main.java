import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "DB_PWD";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("✅ Connected to MySQL database");
            System.out.println(connection);
            connection.close();

        } catch (SQLException e) {
            System.out.println("❌ Connection failed");
            e.printStackTrace();
        }
    }
}
