# 🔐 SecurePass Pro

A modern Java desktop application that generates secure random passwords with customizable options. Built using **Java Swing**, **FlatLaf**, and **Maven**, the project demonstrates the use of `StringBuilder`, `Random`, loops, and character manipulation in a real-world application.

---

## ✨ Features

* 🔑 Generate strong random passwords
* 📏 Choose custom password length
* 🔠 Include uppercase letters
* 🔢 Include numbers
* 🔣 Include special symbols
* 📋 Copy generated password to clipboard
* 🌙 Modern dark UI using FlatLaf
* ⚡ Lightweight and easy to use

---

## 🛠️ Built With

* Java
* Swing
* Maven
* FlatLaf

---

## 📂 Project Structure

```text
SecurePass-Pro/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── shvnix/
                    └── securepass/
                        ├── Main.java
                        ├── core/
                        │   └── PasswordGenerator.java
                        └── ui/
                            └── MainWindow.java
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 21 or later
* Apache Maven

Verify the installation:

```bash
java -version
mvn -v
```

---

## ▶️ Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/SecurePass-Pro.git
```

### 2. Open the project

```bash
cd SecurePass-Pro
```

### 3. Build the project

```bash
mvn clean compile
```

### 4. Run the application

```bash
mvn exec:java
```

---

## 🧠 How It Works

1. The user selects the password length.
2. The user chooses the character types to include.
3. A character pool is created using `StringBuilder`.
4. Random characters are selected using Java's `Random` class.
5. The generated password is displayed in the application.
6. The password can be copied to the clipboard.

---

## 📚 Java Concepts Used

* Object-Oriented Programming (OOP)
* Classes & Objects
* StringBuilder
* Random Class
* Loops
* Conditional Statements
* Character Manipulation
* Swing GUI
* Event Handling

---

## 📸 Screenshots

Add screenshots here after completing the UI.

Example:

```
assets/
├── home.png
├── generated-password.png
└── dark-theme.png
```

---

## 🔮 Future Improvements

* Password strength meter
* Password history
* Save passwords locally
* Password vault
* Encryption support
* Export passwords
* Custom themes

---

## 🎯 Project Objective

The objective of SecurePass Pro is to generate secure and customizable passwords using Java while demonstrating important programming concepts such as `StringBuilder`, `Random`, loops, and GUI development with Swing.

---

## 👨‍💻 Author

**Shivam**

GitHub: https://github.com/<your-username>

---

## 📄 License

This project is licensed under the MIT License.

Feel free to use, modify, and learn from this project.
