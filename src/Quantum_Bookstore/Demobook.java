package Quantum_Bookstore;

public class Demobook extends Book implements Purchasable {

	public Demobook(String isbn, String title, int yearPublished, double price) {
		super(isbn, title, yearPublished, price);

	}

	@Override
	 public void buy(int quantity, String email, String address) {
		System.out.println(" This demo book is not for sale");
    }


}
