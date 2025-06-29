# 🏭 Factory Design Pattern Reference Project

This project demonstrates the **Factory Design Pattern**, a widely-used creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

---

## 🧠 What is the Factory Pattern?

> The **Factory Pattern** defines a method for creating objects in a superclass but lets subclasses decide which class to instantiate. It promotes loose coupling by eliminating the need to bind application-specific classes into your code.

This is especially useful when the exact type of the object is determined at runtime.

---

## 🚀 Use Case in This Project

We simulate a **Game** that creates different types of enemies based on input.

- `Enemy` is a common class.
- `RocketEnemy`, `UFOEnemy`, and `SuperRocketEnemy` are concrete implementations.
- `EnemyFactory` determines which object to create based on parameters.

---

## 💡 Benefits

- Promotes code reusability and scalability
- Reduces tight coupling between the creator and concrete classes
- Makes code easier to manage and extend

---

## 📦 Technologies Used

- Language: Java
- Concepts: Factory Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Factory-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Observer Pattern](https://refactoring.guru/design-patterns/observer)
- [Factory Design Pattern - Derek Banas](https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=6&ab_channel=DerekBanas)

---

## 📬 Contributing

Feel free to fork the repo and submit pull requests with improvements or alternative examples in other languages!
