# Library Management System

## Description
The **Library Management System** is a Java-based application developed using JFrame in NetBeans with MySQL as the database backend. This project aims to simplify library operations such as adding students, managing books, issuing and returning books, and tracking issued/returned book statistics. 

![image alt](https://github.com/PahanSanajana/Library-Management-System/blob/16c98340b7b4ade8bcedd863d8bf92ccf4f5ccd2/Library%20Management%20System.png)

---

## Features

1. **Login Page**  
   - Validates user credentials.
   - Displays an error popup for incorrect username/password.
   - Allows exiting the application.

2. **Home Page**  
   - The main dashboard with six functional buttons:
     - Add New Student
     - Add New Book
     - Issue Book
     - Return Book
     - View Statistics
     - Exit Application

3. **New Student Page**  
   - Add new student details to the database.
   - Includes Save and Close buttons.

4. **New Book Page**  
   - Add new book details to the database.
   - Includes Save and Close buttons.

5. **Issue Book Page**  
   - Record the issue of a book to a student.
   - Enter Student ID, Book ID, Issue Date, and Return Date.
   - Validate Student ID and Book ID for successful book issue.
   - Displays error message for invalid IDs.

6. **Return Book Page**  
   - Record the return of a book.
   - Search by Student ID and Book ID to display issue/return dates.
   - Save return record.
   - Displays error message for invalid IDs.

7. **Statistics Page**  
   - Displays details of issued and returned books.
   - Includes a button to close the application.

---

## Requirements
- **Java JDK** (version 8 or later)
- **NetBeans IDE** (or any Java IDE supporting JFrame)
- **MySQL Database**
- MySQL Connector JAR file for Java

---
