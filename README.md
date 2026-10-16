# Employee Bonus & Tax Calculator

A Java-based application that calculates employee bonuses and taxes based on employee category, position, and total workload. This project demonstrates the **Strategy Design Pattern** for flexible bonus and tax calculation algorithms.

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Design Patterns](#-design-patterns)
- [Bonus & Tax Calculation Rules](#-bonus--tax-calculation-rules)
- [How to Run](#-how-to-run)
- [Sample Output](#-sample-output)
- [Technologies Used](#-technologies-used)
- [Author](#-author)

---

## 📖 Overview

This application allows users to input employee information (ID, name, total workload, category, and position) and calculates:

- **Bonus** based on employee category and position
- **Tax** based on Chinese tax regulations (simplified)

The system supports four main employee categories:

1. **Technical Worker** — focuses on technical work
2. **Management Worker** — focuses on management
3. **Technical Management Worker** — technical background with management duties
4. **Management Technical Worker** — management background with technical duties

Each category has three position levels: **Junior**, **Middle**, and **Senior**.

---

## ✨ Features

- ✅ Input multiple employee records in a single session
- ✅ Dynamic bonus calculation based on category & position
- ✅ Simplified Chinese tax calculation (progressive brackets)
- ✅ Clean console output with formatted results
- ✅ Modular code structure with clear package organization
- ✅ Easy to extend with new bonus/tax strategies thanks to the Strategy Pattern

---

## 🗂 Project Structure
```text
Employee-Bonus-Calculator/
│
├── README.md
├── .gitignore
│
└── src/
├── main/
│ ├── BonusCalculator.java # Main application (user input/output)
│ └── Employee.java # Abstract base class for all employees
│
├── strategy/
│ ├── BonusStrategy.java # Interface for bonus calculation
│ ├── TaxStrategy.java # Interface for tax calculation
│ ├── ChineseTaxStrategy.java # Chinese tax implementation
│ ├── TechnicalBonusStrategy.java
│ ├── ManagementBonusStrategy.java
│ ├── TechnicalManagementBonusStrategy.java
│ └── ManagementTechnicalBonusStrategy.java
│
└── worker/
├── ManagerTechnologyWorker/ # Management Technical employees
├── ManagerWorker/ # Management employees
├── TechnologyManagerWorker/ # Technical Management employees
└── TechnologyWorker/ # Technical employees
```

### Package Description

| Package | Description |
|---------|-------------|
| `main` | Contains the main application (`BonusCalculator`) and abstract `Employee` class |
| `strategy` | Contains bonus and tax calculation strategies |
| `worker` | Contains employee subclasses organized by category |

---

## 🎨 Design Patterns

This project uses the **Strategy Pattern** to encapsulate interchangeable bonus and tax calculation algorithms.
```text
        ┌─────────────────┐
        │    Employee     │ (abstract)
        └────────┬────────┘
                 │ has-a
        ┌────────┴────────┐
        ▼                 ▼
┌──────────────┐  ┌──────────────┐
│ BonusStrategy│  │ TaxStrategy  │ (interfaces)
└──────┬───────┘  └──────┬───────┘
       │                 │
   ┌───┴───┐         ┌───┴───┐
   │  ...  │         │Chinese│
   └───────┘         │  Tax  │
                     └───────┘
```
---

## 💰 Bonus & Tax Calculation Rules

### Bonus Strategies

| Strategy | Applied To | Calculation |
|----------|-----------|-------------|
| `TechnicalBonusStrategy` | Technical Workers | Senior: `workload × 30`<br>Middle: `workload × 25`<br>Junior: `workload × 20` |
| `ManagementBonusStrategy` | Management Workers | Senior: `workload × 15`<br>Middle: `(workload - 50) × 10`<br>Junior: `(workload - 100) × 5` |
| `TechnicalManagementBonusStrategy` | Tech Management | Senior: `workload × 25 + 100`<br>Middle: `workload × 25 + 70`<br>Junior: `workload × 25 + 50` |
| `ManagementTechnicalBonusStrategy` | Management Tech | Senior: `workload × 20 + 80`<br>Middle: `workload × 20 + 50`<br>Junior: `workload × 20 + 30` |

### Tax Strategy

`ChineseTaxStrategy` uses progressive tax brackets:

| Bonus Range | Tax Rate |
|-------------|----------|
| ≤ 5,000 | 3% |
| 5,001 – 12,000 | 10% |
| 12,001 – 25,000 | 20% |
| 25,001 – 35,000 | 25% |
| 35,001 – 55,000 | 30% |
| 55,001 – 80,000 | 35% |
| > 80,000 | 45% |

---

## 🚀 How to Run

### Prerequisites

- **Java JDK 8** or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/marCellacung/Employee-Bonus-Calculator.git
   cd Employee-Bonus-Calculator
   ```

2. **Compile the source code**

   ```bash
   javac -d out src/main/*.java src/strategy/*.java src/worker/**/*.java
   ```

3. **Run the application**

   ```bash
   java -cp out main.BonusCalculator
   ```

### Using an IDE

1. Import the project as a Java project
2. Mark `src` as the **source root**
3. Run `main.BonusCalculator`

---

## 📸 Sample Output

### Technical Worker Example

```text
Please enter employee number: 1
Please enter employee's name: a
Please enter the total workload: 500
Please enter the employee category(technical, management, technical management, management technical): technical
Please enter the employee's position(junior, middle, senior): junior
whether to continue enter employee's information? (y/n): n

employee number: 1, name: a, position: junior technology worker, total workload: 500.00, bonus: 10000.00, tax: 650.00
```

### Management Technical Worker Example

```text
employee number: 1, name: a, position: junior manager technology worker, total workload: 500.00, bonus: 10030.00, tax: 653.00
employee number: 2, name: b, position: middle manager technology worker, total workload: 500.00, bonus: 10050.00, tax: 655.00
employee number: 3, name: c, position: senior manager technology worker, total workload: 500.00, bonus: 10080.00, tax: 658.00
```

---

## 🛠 Technologies Used

- **Java** — Core programming language
- **Object-Oriented Programming (OOP)** — Inheritance, Polymorphism, Abstraction
- **Strategy Design Pattern** — For flexible algorithm selection
- **Java Collections Framework** — `ArrayList`, `List`

---

## 👤 Author

**MARCELLA**
- Institution: Shantou University
- Major: Data Science and Big Data Technology (Class of 2023)
- Email: marcella@stu.edu.cn

---

## 📄 License

This project is created for educational purposes as part of the Java course assignment.
