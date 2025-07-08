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
## code example
```java
package Quantum_Bookstore;

public class Main {

	public static void main(String[] args) {
        inventory inventory = new inventory();

        // Add books
        Book paperBook = new Paperbook("1", "Java", 2017, 300, 5);
        Book ebook = new EBook("2", "Data Structures", 2023, 500, "PDF");
        Book demoBook = new Demobook("3", "Preview of AI", 2021, 0.0);

        inventory.addBook(paperBook);
        inventory.addBook(ebook);
        inventory.addBook(demoBook);

        // Buy paper book
        inventory.buyBook("1", 2, "omar@gmail.com", "12 El Haram Street, Giza, Cairo, Egypt");
        inventory.buyBook("2",1, "moahmed@gmail.com", "");
        inventory.buyBook("3", 1, "ahmed@gmail.com", "");
       
        // Remove outdated book
        inventory.removeOutdatedBook(2025, 5);
    }
}
```  

  
## Output example
![image alt](https://github.com/omarashrafali498/Quantum-Bookstore/blob/c3c36ab36ad19e032614ece997f14096b8ff1250/src/Output.png)


