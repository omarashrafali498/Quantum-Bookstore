package Quantum_Bookstore;
import java.util.LinkedList;
public class inventory {
    private LinkedList<Book> books = new LinkedList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Added book " + book.title);
    }
    public Book removeOutdatedBook(int currentYear, int threshold) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (currentYear - b.getYearPublished() > threshold) {
                books.remove(i);
                System.out.println(" Removed outdated book " + b.title);
                return b;
            }
        }
        return null;
    }
    public void buyBook(String isbn, int quantity, String email, String address) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                ((Purchasable) book).buy(quantity, email, address);
                return;
            }
        }
        throw new IllegalArgumentException(" Book with ISBN " + isbn + " not found");
    }


}

