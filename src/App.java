import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseConnection dbConn = new DatabaseConnection();
        Connection conn = dbConn.getConnection();
        LostFoundManager manager = new LostFoundManager(conn);

        int choice;
        do {
            System.out.println("\n--- Lost & Found Management System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Delete Item");
            System.out.println("4. Search Item");
            System.out.println("5. List All Items");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Item Name: ");
                        String name = sc.nextLine();
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Status (Lost/Found): ");
                        String status = sc.nextLine();
                        System.out.print("Location: ");
                        String loc = sc.nextLine();
                        System.out.print("Date Reported (YYYY-MM-DD): ");
                        String date = sc.nextLine();
                        System.out.print("Contact Info: ");
                        String contact = sc.nextLine();
                        manager.insertItem(new LostFoundItem(0, name, desc, status, loc, date, contact));
                        break;
                    case 2:
                        System.out.print("Enter Item ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Item Name: ");
                        String nName = sc.nextLine();
                        System.out.print("New Description: ");
                        String nDesc = sc.nextLine();
                        System.out.print("New Status: ");
                        String nStatus = sc.nextLine();
                        System.out.print("New Location: ");
                        String nLoc = sc.nextLine();
                        System.out.print("New Date Reported: ");
                        String nDate = sc.nextLine();
                        System.out.print("New Contact Info: ");
                        String nContact = sc.nextLine();
                        manager.updateItem(new LostFoundItem(id, nName, nDesc, nStatus, nLoc, nDate, nContact));
                        break;
                    case 3:
                        System.out.print("Enter Item ID to delete: ");
                        int delId = sc.nextInt();
                        manager.deleteItem(delId);
                        break;
                    case 4:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        manager.searchItem(keyword);
                        break;
                    case 5:
                        manager.listItems();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } while (choice != 0);

        sc.close();
    }
}