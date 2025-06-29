# 👁️ Observer Design Pattern Reference Project

This project demonstrates the **Observer Design Pattern**, a fundamental behavioral design pattern used to establish a one-to-many dependency between objects.

---

## 🧠 What is the Observer Pattern?

> The **Observer Pattern** defines a subscription mechanism to allow multiple objects (observers) to listen and react to events or changes in another object (the subject).

It's useful for implementing event-driven systems, GUIs, data-binding, and messaging systems.

---

## 🚀 Use Case in This Project

We simulate a **Store** that notifies branch's (observers) whenever a price is updated.

- `StoreSubject` acts as the **Subject**.
- `StoreObserver` act as **Observers**.
- Observers can subscribe or unsubscribe at any time, and all get notified of new updates.

---

## 💡 Benefits

- Promotes a loose coupling between components
- Easily allows dynamic subscription to events
- Scales well for broadcasting messages to many listeners

---

## 📦 Technologies Used

- Language: Java
- Concepts: Observer Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Behavioral/Observer-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Observer Pattern](https://refactoring.guru/design-patterns/observer)
- [Observer Design Pattern - Derek Banas](https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4&ab_channel=DerekBanas)

---

## 📬 Contributing

Feel free to fork the repo and submit pull requests with improvements or alternative examples in other languages!
