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
