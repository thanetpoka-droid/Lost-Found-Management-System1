Lost & Found Management System (Java + MySQL)

วิธีติดตั้งและใช้งาน:
1. เปิด XAMPP แล้ว Start MySQL
2. เข้า phpMyAdmin แล้วสร้าง Database ชื่อ lost_found_db
3. เปิดโปรแกรม IDE (VS Code / NetBeans / IntelliJ)
4. ใส่ MySQL JDBC Connector (.jar) ไว้ในโฟลเดอร์ lib/
5. แก้ไข DatabaseConnection.java ได้ถ้าต้องการเปลี่ยนรหัสผ่าน MySQL
6. Run App.java เพื่อเริ่มใช้งานระบบ

ฟังก์ชันหลัก:
- เพิ่ม / แก้ไข / ลบ / ค้นหา / แสดงข้อมูลสิ่งของหายและพบ