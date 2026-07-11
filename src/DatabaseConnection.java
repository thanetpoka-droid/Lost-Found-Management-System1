import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/lost_found_db";
    private static final String USER = "root";
    private static final String PASS = "";
    private Connection conn;

    public DatabaseConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
                createTableIfNotExist();
            } else {
                System.out.println("❌ Failed to connect to MySQL.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTableIfNotExist() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS lost_found (" +
                     "item_id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "item_name VARCHAR(100), " +
                     "description TEXT, " +
                     "status VARCHAR(10), " +
                     "location VARCHAR(100), " +
                     "date_reported VARCHAR(20), " +
                     "contact_info VARCHAR(100))";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
    }

    public Connection getConnection() {
        return conn;
    }
}