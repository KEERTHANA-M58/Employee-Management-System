# 🧑‍💼 Employee Management System

A **Spring Boot** based full-stack web application that performs **CRUD (Create, Read, Update, Delete)** operations on employee records using **MySQL** as the database. This project demonstrates the integration of RESTful APIs, database connectivity, and backend logic using Spring Boot.

---

## 🚀 Features

- Add a new employee
- View all employees
- Update employee details
- Delete employee record
- REST API endpoints
- Database integration with MySQL
- Tested using Postman

---

## 🛠️ Technologies Used

| Backend | Database | Testing | Tools |
|--------|----------|---------|-------|
| Java (Spring Boot) | MySQL | Postman | Maven |
| Spring Data JPA | | | IntelliJ / Eclipse |

---

## 📂 Project Structure

Employee-Management-System/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/ems/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ └── service/
│ │ └── resources/
│ │ ├── application.properties
│ │ └── data.sql
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## 🧑‍💻 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/employees` | Get all employees |
| GET | `/api/employees/{id}` | Get employee by ID |
| POST | `/api/employees` | Add a new employee |
| PUT | `/api/employees/{id}` | Update employee |
| DELETE | `/api/employees/{id}` | Delete employee |

---

## 💾 Database Configuration (application.properties)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

<img width="1736" height="871" alt="image" src="https://github.com/user-attachments/assets/af1b3367-91b3-4485-a836-369c91bed741" />
<img width="859" height="615" alt="image" src="https://github.com/user-attachments/assets/640a50c0-e3ac-4b81-b2bc-8a9b95372ba4" />
<img width="623" height="597" alt="image" src="https://github.com/user-attachments/assets/12e74129-8b11-4127-8f6c-ef8e002a6ccb" />




