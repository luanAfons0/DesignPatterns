# 🧱 Abstract Factory Design Pattern Reference Project

This project demonstrates the **Abstract Factory Design Pattern**, a powerful creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## 🧠 What is the Abstract Factory Pattern?

> The **Abstract Factory Pattern** is used to create groups of related objects without being tightly coupled to their concrete classes. It is essentially a factory of factories.

This pattern is ideal when your code needs to work with various families of related products, but you don't want it to depend on the concrete classes of those products—they might be unknown or change later.

---

## 🚀 Use Case in This Project

We simulate a **UI Toolkit** that can switch between different look-and-feel styles (e.g., **Windows**, **Linux** and **MacOS**). Each style has its own family of components:

- `Button` and `Checkbox` are part of the product family.
- `WindowsGUIFactory`, `LinuxGUIFactory` and `MacGUIFactory` are concrete factories that implement the `GUIFactory` interface.

Each factory creates products that belong together.

---

## 💡 Benefits

- Enforces consistency among products in a family
- Promotes scalability by easily switching product families
- Encapsulates object creation logic

---

## 📦 Technologies Used

- Language: Java
- Concepts: Abstract Factory Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Creational/Abstract-Factory-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)

---

## 📬 Contributing

Feel free to fork the repo and submit pull requests with improvements or alternative examples in other languages!
