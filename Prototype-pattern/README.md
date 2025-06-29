# 🧬 Prototype Design Pattern Reference Project

This project demonstrates the **Prototype Design Pattern**, a creational design pattern that allows you to create new objects by copying existing ones (prototypes), rather than instantiating new objects directly.

---

## 🧠 What is the Prototype Pattern?

> The **Prototype Pattern** is used to create duplicate objects while keeping performance in mind. It allows cloning of existing objects without depending on their classes.

This is especially useful when object creation is expensive (e.g., involves a lot of computation or database access) and you need similar objects frequently.

---

## 🚀 Use Case in This Project

We simulate a **Shapes UI** where users can clone existing shapes (like circles and rectangles) instead of creating new ones from scratch.

- `Shape` is an abstract prototype with a `clone()` method.
- `Circle` and `Rectangle` are concrete prototypes.

---

## 💡 Benefits

- Avoids costly creation of new instances
- Reduces code duplication
- Encourages use of existing object templates

---

## ⚠️ Caveats

- Requires careful implementation of deep vs shallow copy
- Cloning complex objects with nested references can be tricky

---

## 📦 Technologies Used

- Language: Java
- Concepts: Prototype Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Prototype-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Prototype Pattern](https://refactoring.guru/design-patterns/prototype)

---

## 🙌 Contributing

Suggestions and contributions are welcome! Feel free to submit pull requests with improvements.
