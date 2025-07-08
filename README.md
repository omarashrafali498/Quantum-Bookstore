# Quantum Bookstore

Quantum Bookstore is a simple Java-based system that simulates an online bookstore. It allows adding different types of books to an inventory, buying books based on their type, and removing outdated books. The design emphasizes modularity and extensibility using object-oriented principles and the Strategy pattern.

## Features

- Add books to inventory
- Buy physical books with shipping and stock check
- Buy eBooks with email delivery
- Prevent demo books from being purchased
- Remove outdated books based on year threshold
- Extendable design using interfaces

## Book Types

### Paperbook
- Purchasable
- Requires a shipping address
- Limited by stock quantity

### EBook
- Purchasable
- Delivered via email
- Includes a file type (e.g., PDF)

### DemoBook
- Not purchasable
- Displays a message when a purchase is attempted

## Design Overview

- **Strategy Pattern**: Book purchase logic is separated via the `Purchasable` interface.
- **Encapsulation**: Book-specific behavior is encapsulated in their respective classes.
- **Extensibility**: New book types can be added without modifying existing logic.

## Project Structure

