# 🧱 Builder Design Pattern Reference Project

This project demonstrates the **Builder Design Pattern**, a creational design pattern that allows you to construct complex objects step by step. It separates the construction of a complex object from its representation.

---

## 🧠 What is the Builder Pattern?

> The **Builder Pattern** allows you to construct different representations of a complex object using the same construction process.

It is useful when creating objects that require multiple steps or configurations, especially when constructors become unwieldy with many parameters.

---

## 🚀 Use Case in This Project

We simulate a **House Builder** that assembles different types of components (e.g., walls, roofs, windows etc...) with different types.

- `House` is the complex object.
- `ModernHouseBuilder` defines the steps to build a modern house.
- `WoodHouseBuilder` defines the steps to build a wood house.
- `StoneHouseBuilder` defines the steps to build a stone house.
- `WoodHouseBuild`, `WoodHouseBuilder` and `StoneHouseBuilder` are concrete builders.
- `HouseDirector` controls the construction process.

---

## 💡 Benefits

- Provides control over the construction process
- Separates construction code from representation
- Makes the code more readable and manageable

---

## 📦 Technologies Used

- Language: Java
- Concepts: Builder Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Builder-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Builder Pattern](https://refactoring.guru/design-patterns/builder)

---

## 🙌 Contributing

Improvements, language adaptations, and alternative examples are welcome!
