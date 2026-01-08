# Java Mortgage Calculator

A simple **terminal-based Java application** that calculates a monthly mortgage payment based on user input.

This project was built as a first Java program while learning core Java fundamentals, following a beginner challenge from **Mosh Hamedani’s Java course**.

![Java IDE IntelliJ IDEA Screenshot of Application](https://i.imgur.com/jNxpH6a.png)

---

## 📌 Features

- Command-line interface (CLI)
- User input via `Scanner`
- Input validation using `try/catch`
- Mortgage payment calculation using standard financial formulas
- Currency-formatted output

---

## 🧮 How the Calculation Works

The program calculates the monthly mortgage payment using the standard formula:

\[
M = P \times \frac{r(1 + r)^n}{(1 + r)^n - 1}
\]

Where:
- **P** = principal loan amount  
- **r** = monthly interest rate  
- **n** = total number of monthly payments  

---

## 🛠 Technologies Used

- Java (JDK 17+ recommended)
- IntelliJ IDEA (or any Java IDE)
- Standard Java libraries:
  - `java.util.Scanner`
  - `java.text.NumberFormat`

---

## ▶️ How to Run the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/hereisphil/java-mortgage-calculator.git
   ```

2. Navigate into the project:
   ```bash
   cd java-mortgage-calculator
   ```

3. Compile and run:
   ```bash
   javac src/Main.java
   java src.Main
   ```

   *(Alternatively, open the project in IntelliJ IDEA and run `Main.java`.)*

---

## 🧪 Sample Input

```
Principal: 300000
Down payment: 20000
Annual Interest Rate: 3.95
Period (Years): 30
```

## ✅ Sample Output

```
Monthly Mortgage: $1,334.42
```

---

## 📚 Learning Goals

This project focuses on practicing:

- Java syntax and structure
- Variables and data types
- Exception handling (`InputMismatchException`)
- Loops and program flow control
- Mathematical operations
- Clean console output

---

## 🚀 Future Improvements (Optional)

- Loop until valid input is entered per field
- Extract logic into reusable methods
- Add unit tests
- Support different compounding periods

---

## 📎 Reference

Challenge inspired by Mosh Hamedani’s beginner Java course:  
https://www.youtube.com/watch?v=eIrMbAQSU34

---

## 👋 Author

Hi! I’m Phillip Cantu, a current [Full Sail University](https://www.fullsail.edu/) web development student, _expected graduation February 2027_, and a [4Geeks Academy Full Stack](https://www.phillipcantu.com/certificate.pdf) bootcamp graduate.

-   **GitHub:** [hereisphil](https://github.com/hereisphil)
-   **LinkedIn:** [phillipcantu](https://www.linkedin.com/in/phillipcantu/)
-   **Email:** [thereisphil@gmail.com](mailto:thereisphil@gmail.com)
