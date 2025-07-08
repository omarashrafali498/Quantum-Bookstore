package Quantum_Bookstore;

public class EBook extends Book implements Purchasable {
		private String filetype ;
		
	public EBook(String isbn, String title, int yearPublished, double price,String filetype) {
		super(isbn, title, yearPublished, price);
		this.filetype = filetype ;
	}

    public void buy(int quantity, String email, String address) {
        double total = quantity * price;
        System.out.println(" Bought " + quantity + " of " + title+". Total paid:  " +total+" Sending eBook to " + email);
    }
    public String getFileType() {
        return filetype;
    }
}

