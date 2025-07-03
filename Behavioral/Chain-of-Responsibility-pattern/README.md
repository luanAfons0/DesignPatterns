# 🔗 Chain of Responsibility Design Pattern Reference Project

This project demonstrates the **Chain of Responsibility Design Pattern**, a behavioral design pattern that allows you to pass requests along a chain of handlers. Each handler decides whether to process the request or pass it to the next handler in the chain.

---

## 🧠 What is the Chain of Responsibility Pattern?

> The **Chain of Responsibility Pattern** decouples the sender of a request from its receiver by giving multiple objects a chance to handle the request.

It is useful when more than one object may handle a request and the handler isn't known in advance. Handlers are linked, and the request is passed along the chain until one handles it.

---

## 🚀 Use Case in This Project

We simulate a **Middlewares sequence** where a client request goes through multiple levels of validation:

- `Middleware` defines the abstract class for handling requests and setting the next handler.
- `ThrottlingMiddleware`, and `UserExistsMiddleware` are concrete handlers.
- Requests are processed or forwarded depending on their complexity.

---

## 💡 Benefits

- Reduces coupling between sender and receiver
- Makes it easy to add or remove handlers dynamically
- Flexible and promotes the Single Responsibility Principle

---

## 📦 Technologies Used

- Language: Java
- Concepts: Chain of Responsibility Pattern

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/luanAfons0/DesignPatterns.git
   cd DesignPatterns/Behavioral/Chain-of-Responsibility-pattern
   ```

2. Run the code in the project in your preferred IDE.

---

## 📚 Further Reading

- [Refactoring Guru – Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)

---

## 🙌 Contributing

Suggestions and improvements are welcome! Open an issue or submit a PR.
