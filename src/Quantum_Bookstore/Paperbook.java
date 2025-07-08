package Quantum_Bookstore;

public class Paperbook extends Book implements Purchasable{
    private int stock;

	

	public Paperbook(String isbn, String title, int yearPublished, double price, int stock) {
		super(isbn, title, yearPublished, price);
		this.stock = stock ;
	}

	  public void buy(int quantity, String email, String address) {
	        if (quantity > stock) {
	            throw new IllegalArgumentException("Quantum book store: Not enough stock");
	        }
	        stock -= quantity;
	        double total = quantity * price;
	        System.out.println(" Bought " + quantity + " of " + title + " Total paid: " + total + " Shipping to " + address);
	    }

	    public int getStock() {
	        return stock;
	    }

}
