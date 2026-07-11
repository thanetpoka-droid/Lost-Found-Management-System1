🔍 Lost & Found Management System
Java Console/Desktop Application for Item Tracking & Management

โปรเจกต์ระบบบริหารจัดการของหายและตามหาของ (Lost & Found) พัฒนาขึ้นโดยใช้ภาษา Java มุ่งเน้นการประยุกต์ใช้หลักการ Object-Oriented Programming (OOP) ในการจัดการข้อมูลอย่างเป็นระบบ พร้อมโครงสร้างโค้ดที่ออกแบบมาเพื่อรองรับการทำ Software Testing & QA เพื่อความถูกต้องของข้อมูล (Data Integrity)

🛠 Tech Stack & Tools
Language: Java (100%)
IDE/Environment: VS Code / Eclipse / IntelliJ
Architecture: Object-Oriented Programming (OOP), Data Structures (Lists/Maps)
Testing Scope: Unit Testing, Validation Testing, Boundary Value Analysis
🎯 Core Features
Item Registration: ระบบบันทึกข้อมูลของที่หาย/ของที่พบ โดยมีการทำ Input Validation ป้องกันการกรอกข้อมูลว่างหรือฟอร์แมตผิดพลาด
Search & Filter: ระบบค้นหาและคัดกรองสถานะของวัตถุ (เช่น Lost, Found, Claimed) ได้อย่างแม่นยำ
User Management: ระบบจัดการสิทธิ์และข้อมูลผู้ใช้งานเบื้องต้น เพื่อระบุเจ้าของเคสและผู้จัดเก็บข้อมูล
🧪 Quality Assurance & Testing Cases (แนวทางการทดสอบระบบ)
เพื่อรับประกันความเสถียรของระบบจัดการข้อมูล Java ตัวนี้ ได้มีการคิดค้นและจำลอง Case การทดสอบไว้ดังนี้:
Input Validation & Negative Testing (การทดสอบความถูกต้องของข้อมูล):
ทดสอบกรอกข้อมูลวันที่ย้อนหลัง หรือกรอกค่าว่าง (Null) ในฟิลด์สำคัญ เช่น ชื่อสิ่งของ สถานที่ เพื่อดูว่าระบบโยน Exception ออกมาจัดการได้อย่างถูกต้อง ไม่เกิดโปรแกรมแครช (NullPointerException)
Boundary Value Analysis (BVA) on Data Fields:
ทดสอบจำกัดความยาวของตัวอักษรในรายละเอียดสิ่งของ (Description) และการกรอกเบอร์โทรศัพท์ติดต่อของผู้แจ้ง เพื่อให้มั่นใจว่าระบบรองรับข้อมูลตามขอบเขตที่กำหนด
State Transition Testing (การทดสอบการเปลี่ยนสถานะ):
ทดสอบ Flow การเปลี่ยนสถานะของวัตถุจาก Lost (หาย) -> Found (เจอแล้ว) -> Claimed (รับคืนแล้ว) ว่าตัวแปรในหน่วยความจำอัปเดตค่าถูกต้อง ไม่เกิดสถานะซ้อนทับกัน
📂 Project Structure
/src: โฟลเดอร์เก็บ Source Code ภาษา Java (.java) ทั้งหมด แยกแพ็กเกจตามโมเดลและระบบควบคุมการทำงาน
/bin: โฟลเดอร์เก็บไฟล์คอมไพล์ (.class) พร้อมใช้งาน
/.vscode: ไฟล์ตั้งค่าสภาพแวดล้อมสำหรับการพัฒนาบน Visual Studio Code
