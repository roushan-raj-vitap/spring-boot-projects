# Spring Core – Dependency Injection using XML Configuration

This is a simple Spring Core application created to demonstrate **Dependency Injection (DI)** using **XML-based configuration**.

The project focuses on understanding how Spring manages object creation and dependency wiring without using annotations.

---

## 🎯 Purpose of the Project

- To understand **Inversion of Control (IoC)**
- To implement **Dependency Injection using XML**
- To learn how Spring manages beans via `applicationContext.xml`
- To clearly separate object creation from business logic

---

## 🛠️ Tech Stack

- Java
- Spring Core (XML Configuration)
- Maven

---

## 📁 Project Structure

.
├── src/main/java
│ ├── com.example.service
│ │ └── ServiceInterface.java
│ ├── com.example.service.impl
│ │ └── ServiceImpl.java
│ ├── com.example.dao
│ │ └── DaoInterface.java
│ ├── com.example.dao.impl
│ │ └── DaoImpl.java
│ └── App.java
│
├── src/main/resources
│ └── applicationContext.xml
│
├── pom.xml
└── README.md

pgsql
Copy code

*(Package names may vary slightly based on your implementation)*

---

## 🔄 Dependency Injection using XML

Dependencies are defined and wired in `applicationContext.xml`:

```xml
<bean id="dao" class="com.example.dao.impl.DaoImpl" />

<bean id="service" class="com.example.service.impl.ServiceImpl">
    <property name="dao" ref="dao"/>
</bean>
Spring:

Creates objects

Injects dependencies

Manages lifecycle

▶️ How to Run
Clone the repository

bash
Copy code
git clone <repository-url>
Run the main class

bash
Copy code
App.java
Spring loads the XML configuration and injects dependencies automatically.

🧠 Key Concepts Demonstrated
Inversion of Control (IoC)

Dependency Injection

Setter Injection via XML

Bean configuration

Loose coupling

📌 Why XML DI?
Helps understand Spring internals

Important for legacy Spring projects

Builds strong foundation before annotations

📚 Learning Outcome
This project helped me clearly understand how Spring:

Creates beans

Injects dependencies

Decouples components using IoC

yaml
Copy code

---

## ✅ Git Commit Messages (IMPORTANT)

Use **clean, professional commits**.  
If this is your **first upload**:

```bash
git commit -m "Initial commit: Spring Core XML-based Dependency Injection demo"
If you already pushed code and are adding README:

bash
Copy code
git commit -m "Add README explaining XML-based dependency injection"
If you made small fixes:

bash
Copy code
git commit -m "Refactor bean configuration and improve project structure"