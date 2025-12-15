# Spring Core – Dependency Injection using XML

This project is a simple **Spring Core application** created to demonstrate **Dependency Injection (DI)** using **XML-based configuration**.

The main goal of this project is to understand how Spring implements **Inversion of Control (IoC)** and manages object creation and dependency wiring through XML, without using annotations.

---

## 🎯 Objective

- Understand **Inversion of Control (IoC)**
- Learn **Dependency Injection using XML**
- Configure and wire beans using `applicationContext.xml`
- Achieve **loose coupling** between components

---

## 🛠️ Technologies Used

- Java
- Spring Core (XML configuration)
- Maven

---

## 📁 Project Structure

src/
├── main/
│ ├── java/
│ │ └── (application packages)
│ │ ├── interfaces
│ │ ├── implementations
│ │ └── main class
│ └── resources/
│ └── applicationContext.xml
└── pom.xml


*(Exact package names may vary based on implementation)*

---

## 🔄 Dependency Injection with XML

All bean definitions and dependencies are configured inside **`applicationContext.xml`**.

Example:

```xml
<bean id="dao" class="com.example.dao.DaoImpl" />

<bean id="service" class="com.example.service.ServiceImpl">
    <property name="dao" ref="dao"/>
</bean>
Spring creates the objects

Injects dependencies automatically

Manages the bean lifecycle

▶️ How to Run the Application

Clone the repository

git clone <repository-url>


Open the project in IDE (IntelliJ / Eclipse)

Run the main class
Spring will load the XML configuration and inject dependencies.

🧠 Key Concepts Demonstrated

Inversion of Control (IoC)

Dependency Injection (DI)

Setter Injection

Bean configuration using XML

Loose coupling

📌 Why XML Configuration?

Helps understand Spring internals

Common in legacy Spring applications

Builds strong foundation before annotation-based configuration