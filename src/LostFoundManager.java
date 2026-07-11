import java.sql.*;
import java.util.*;

public class LostFoundManager {
    private Connection conn;

    public LostFoundManager(Connection conn) {
        this.conn = conn;
    }

    public void insertItem(LostFoundItem item) throws SQLException {
        String sql = "INSERT INTO lost_found (item_name, description, status, location, date_reported, contact_info) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, item.getItemName());
        ps.setString(2, item.getDescription());
        ps.setString(3, item.getStatus());
        ps.setString(4, item.getLocation());
        ps.setString(5, item.getDateReported());
        ps.setString(6, item.getContactInfo());
        ps.executeUpdate();
        System.out.println("✅ Item added successfully!");
    }

    public void updateItem(LostFoundItem item) throws SQLException {
        String sql = "UPDATE lost_found SET item_name=?, description=?, status=?, location=?, date_reported=?, contact_info=? WHERE item_id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, item.getItemName());
        ps.setString(2, item.getDescription());
        ps.setString(3, item.getStatus());
        ps.setString(4, item.getLocation());
        ps.setString(5, item.getDateReported());
        ps.setString(6, item.getContactInfo());
        ps.setInt(7, item.getItemId());
        ps.executeUpdate();
        System.out.println("✅ Item updated successfully!");
    }

    public void deleteItem(int id) throws SQLException {
        String sql = "DELETE FROM lost_found WHERE item_id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("✅ Item deleted successfully!");
    }

    public void searchItem(String keyword) throws SQLException {
        String sql = "SELECT * FROM lost_found WHERE item_name LIKE ? OR location LIKE ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, "%" + keyword + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LostFoundItem item = new LostFoundItem(
                rs.getInt("item_id"),
                rs.getString("item_name"),
                rs.getString("description"),
                rs.getString("status"),
                rs.getString("location"),
                rs.getString("date_reported"),
                rs.getString("contact_info")
            );
            item.display();
        }
    }

    public void listItems() throws SQLException {
        String sql = "SELECT * FROM lost_found";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            LostFoundItem item = new LostFoundItem(
                rs.getInt("item_id"),
                rs.getString("item_name"),
                rs.getString("description"),
                rs.getString("status"),
                rs.getString("location"),
                rs.getString("date_reported"),
                rs.getString("contact_info")
            );
            item.display();
        }
    }
}