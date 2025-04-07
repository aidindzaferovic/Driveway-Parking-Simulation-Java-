# Driveway Parking Simulation

- Java | December 2023 | CUS 1126 – Data Structures 
- Developer: Aidin Dzaferovic

## 📌 Overview

This Java-based simulation models a **driveway parking system** using a **stack** data structure. It mimics real-world parking behavior where the last car to enter must be the first to leave — a classic **LIFO (Last-In, First-Out)** scenario.

## 💡 Key Features

- **Stack-Based Parking**  
  Cars enter and exit based on stack operations, maintaining LIFO order.

- **Car Addition & Removal**  
  Supports efficient addition (`O(1)`) and simulated removal (`O(n)` if cars are blocked).

- **State Display**  
  A custom `print()` method shows the current status of the driveway and street clearly.

## 🧠 Algorithmic Complexity

| Method     | Time Complexity |
|------------|-----------------|
| `add()`    | O(1)            |
| `remove()` | O(n)            |
| `print()`  | O(n)            |

## 🧰 Technologies

- Java  
- Stack

