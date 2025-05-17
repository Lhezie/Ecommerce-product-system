# E-commerce Product Management System

This is a Java-based console application that simulates an e-commerce platform. It allows administrators to manage products, categories, and view sales reports, while customers can browse items, manage a shopping cart, and place orders.

## Features

### Admin Functions
- Add, update, or remove products
- Create and view product categories
- Generate sales reports

### Customer Functions
- Browse products by category
- Search products by name
- Add items to cart with size selection for clothing
- View cart and checkout with order summary

## Object-Oriented Design

This system was built using core **Object-Oriented Programming (OOP)** principles:
- **Encapsulation**: All class attributes are private with controlled access through getters/setters.
- **Inheritance**: `User` is the superclass for `Admin` and `Customer`; `Product` is extended by product types.
- **Abstraction**: Abstract classes (`Product`, `User`) define common structures.
- **Polymorphism**: Method overriding used for customized output (e.g., `toString()` in product classes).

## System Architecture

- `Product` (abstract) → `Electronics`, `Clothing`, `Books`, `BodyCare`, `KitchenUtensils`
- `User` (abstract) → `Admin`, `Customer`
- `ShoppingCart` → holds multiple `CartItems`
- `Order` → stores cart snapshot, date, and total
- `EcommerceStore` → main logic and system controller
- `Ecommerce` → entry point with terminal-based UI

## Technologies Used

- Java (JDK 17+)
- NetBeans
- UML (Class Diagram)
- Exception handling (e.g., `IllegalArgumentException`)
- Terminal input via `Scanner`

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Lhezie/Ecommerce-product-system.git
