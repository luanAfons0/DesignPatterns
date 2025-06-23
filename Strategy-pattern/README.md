# 🧩 Strategy Design Pattern Reference Project

This project demonstrates the **Strategy Design Pattern**, one of the most important behavioral design patterns in software engineering. It promotes flexibility and extensibility in your code by defining a family of algorithms, encapsulating each one, and making them interchangeable.

---

## 🧠 What is the Strategy Pattern?

> The **Strategy Pattern** allows you to define different algorithms for a task and switch between them at runtime without altering the client code.

It helps reduce code duplication and adheres to the **Open/Closed Principle** — software entities should be open for extension, but closed for modification.

---

## 🚀 Use Case in This Project

We simulate a **Can fly situation** which imply that many animals can or cannot can do the action:

- `Animal`
- `CantFly`
- `ItFly`

Each strategy implements a common interface, and the context class (`Flys`) delegates the behavior to the selected strategy.

---

## 💡 Benefits

- Decouples the algorithm from the host class
- Makes code more flexible and easier to extend
- Allows swapping strategies at runtime

---

## 📦 Technologies Used

- Language: Java
- Concepts: Strategy Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Strategy-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Strategy Pattern](https://refactoring.guru/design-patterns/strategy)
- [Strategy Design Pattern - Derek Banas](https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=4&ab_channel=DerekBanas)

---

## 🙌 Contributing

Suggestions or improvements are welcome! Submit a pull request or open an issue if you'd like to contribute.
