# 🏦 Bank Management System

## 🌐 Live Demo
Visit the project page:  
https://rishithagajam.github.io/BankManagementSystem/

---

## 📖 Project Overview

The Bank Management System is a Java-based desktop application developed using Java Swing and MySQL.  
It simulates core banking operations such as account creation, deposits, withdrawals, balance enquiry, PIN change, and mini statement generation.

This project demonstrates real-world banking workflow implementation using Java, JDBC, and MySQL with a structured and modular approach.

---

## ✨ Key Features

- 🏦 Account Creation (Savings / Current)
- 🔐 Secure Login using PIN Authentication
- 💰 Deposit Money
- 💸 Withdraw Money
- ⚡ Fast Cash
- 📊 Balance Enquiry
- 🧾 Mini Statement (Transaction History)
- 🔄 PIN Change
- 🗂️ JDBC Database Connectivity
- 🛡️ Prepared Statements to prevent SQL Injection
- 🖥️ User-Friendly Java Swing Interface

---

## 🛠️ Technologies Used

- Programming Language: Java
- UI Framework: Java Swing
- Database: MySQL
- IDE: IntelliJ IDEA
- Version Control: Git & GitHub

---

## 📥 Installation

### Prerequisites

- Java JDK 8 or higher
- MySQL Server
- Git
- IntelliJ IDEA

---

### 1️⃣ Clone Repository

git clone https://github.com/rishithagajam/BankManagementSystem.git  
cd BankManagementSystem

---

## 🗄️ Database Setup

### 2️⃣ Create Database

Open MySQL and run:

CREATE DATABASE bankSystem;  
USE bankSystem;

---

### 3️⃣ Create Required Tables

CREATE TABLE login (
formno VARCHAR(20),
cardnumber VARCHAR(25),
pin VARCHAR(10)
);

CREATE TABLE bank (
pin VARCHAR(10),
date VARCHAR(50),
type VARCHAR(20),
amount VARCHAR(20)
);

CREATE TABLE signup (
formno VARCHAR(20),
name VARCHAR(100),
father_name VARCHAR(100),
dob VARCHAR(20),
gender VARCHAR(10),
email VARCHAR(100),
marital_status VARCHAR(20),
address VARCHAR(200),
city VARCHAR(50),
state VARCHAR(50),
pincode VARCHAR(10)
);

---

### 4️⃣ Configure Database Connection

Update your Conn.java file:

String url = "jdbc:mysql://localhost:3306/bankSystem";
String user = "root";
String password = "your_password";

---

## 💻 Usage

1. Open the project in IntelliJ IDEA
2. Add MySQL JDBC Driver
3. Run Login.java
4. Perform banking operations

---

## 📂 Project Structure

BankManagementSystem/
│
├── src/bank/management/system/
│   ├── Login.java
│   ├── Signup.java
│   ├── Deposit.java
│   ├── Withdrawl.java
│   ├── BalanceEnquiry.java
│   ├── MiniStatement.java
│   ├── PinChange.java
│   └── Conn.java
│
├── icon/
├── README.md
└── LICENSE

---

## 🗄️ Database Schema

### Login Table

CREATE TABLE login (
formno VARCHAR(20),
cardnumber VARCHAR(25),
pin VARCHAR(10)
);

### Bank Table

CREATE TABLE bank (
pin VARCHAR(10),
date VARCHAR(50),
type VARCHAR(20),
amount VARCHAR(20)
);

---

## 👤 Author

Rishitha Gajam

GitHub: https://github.com/rishithagajam  
Portfolio: https://rishithagajam.github.io/responsive/  
Project Page: https://rishithagajam.github.io/BankManagementSystem/

---

## 📧 Contact

rishithagajam003@gmail.com

---

## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!

Made with ❤️ by Rishitha Gajam