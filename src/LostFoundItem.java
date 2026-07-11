public class LostFoundItem {
    private int itemId;
    private String itemName;
    private String description;
    private String status; // Lost or Found
    private String location;
    private String dateReported;
    private String contactInfo;

    public LostFoundItem(int itemId, String itemName, String description, String status, String location, String dateReported, String contactInfo) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.status = status;
        this.location = location;
        this.dateReported = dateReported;
        this.contactInfo = contactInfo;
    }

    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getLocation() { return location; }
    public String getDateReported() { return dateReported; }
    public String getContactInfo() { return contactInfo; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(String status) { this.status = status; }
    public void setLocation(String location) { this.location = location; }
    public void setDateReported(String dateReported) { this.dateReported = dateReported; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public void display() {
        System.out.println(itemId + ": " + itemName + " (" + status + ") at " + location + " | " + dateReported + " | Contact: " + contactInfo);
    }
}