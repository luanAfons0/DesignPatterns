# 🔒 Singleton Design Pattern Reference Project

This project demonstrates the **Singleton Design Pattern**, one of the most commonly used creational design patterns, which ensures that a class has only one instance and provides a global point of access to it.

---

## 🧠 What is the Singleton Pattern?

> The **Singleton Pattern** restricts the instantiation of a class to a single object and provides a global point of access to that instance.

It is especially useful for managing shared resources such as configuration settings, logging, or database connections.

---

## 🚀 Use Case in This Project

We simulate a **Singleton** that ensures that the log is always going to be the same.

- `Singleton` class ensures only one instance exists.
- The `getInstance()` method provides global access.

---

## 💡 Benefits

- Ensures a single instance of a class
- Provides a global access point
- Useful for logging, configuration, or caching services

---

## ⚠️ Caveats

- Can introduce global state into an application
- Makes unit testing more difficult if not implemented carefully
- Might require handling for multithreading in some languages

---

## 📦 Technologies Used

- Language: Java
- Concepts: Singleton Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Singleton-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Singleton Pattern](https://refactoring.guru/design-patterns/singleton)

---

## 🙌 Contributing

Feel free to fork the repo and submit pull requests to improve examples or add language implementations.
