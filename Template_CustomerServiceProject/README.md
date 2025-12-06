# Template Customer Service Project

This is a Spring Core project that demonstrates a basic Customer Service workflow using different departments such as Sales, Payment, and Query.  
It is a simple learning-oriented project that helps understand the fundamentals of Spring’s IoC (Inversion of Control) and Dependency Injection.

---

## 🚀 Project Overview
This project simulates how a customer service system works in a company.  
Each department (Sales, Payment, Query) is created as a Spring bean inside an XML configuration file, and the main application loads and interacts with them.

---

## 📌 Features
- XML-based Spring Bean Configuration (`ApplicationContext.xml`)
- Demonstrates **Dependency Injection**
- Uses **Multiple Department Beans**
- Shows how **ApplicationContext** loads beans dynamically
- Clean and simple structure for beginners

---

## 🧱 Technologies Used
- **Java**
- **Spring Core (XML Configuration)**
- **Maven**

---

## 📂 Project Structure

Template_CustomerServiceProject/
│
├── src/main/java/com/example/ # Java source code
│ ├── CustomerServicedemoApplication.java
│ └── Customers/
│ ├── CustomerCare.java
│ ├── PaymentDepartment.java
│ ├── QueryDepartment.java
│ └── SalesDepartment.java
│
├── src/main/resources/
│ ├── ApplicationContext.xml # Spring XML configuration
│ └── application.properties
│
├── pom.xml # Maven dependencies
└── README.md # Documentation

yaml
Copy code

---

## ▶️ How to Run This Project

1. Clone the repository or download the project.
2. Open it in any IDE (IntelliJ IDEA, Eclipse, VS Code).
3. Run the main class:

CustomerServicedemoApplication.java

yaml
Copy code

4. The Spring container will load all beans defined in `ApplicationContext.xml`.
5. Output will show how different departments serve the customer request.

---

## 🎯 Learning Outcomes
By completing this project, you understand:

- How Spring manages beans using **IoC Container**
- How XML Configuration works
- How to load beans using:
  
  ```java
  ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
How to call methods on beans loaded from the Spring container

📘 Purpose of This Project
This project is part of your backend learning journey and serves as a template project to understand:

Spring fundamentals

Bean wiring

Real-world style modular design

Ideal for beginners practicing Spring Core before moving to Spring Boot.

🧑‍💻 Author
Roushan Raj
Backend Developer | Spring & Java Enthusiast
