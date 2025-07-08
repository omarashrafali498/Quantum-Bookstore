package Quantum_Bookstore;

//Book.java
public  class Book {
 protected String isbn;
 protected String title;
 protected int yearPublished;
 protected double price;
 protected String author;

 public Book(String isbn, String title, int yearPublished, double price) {
     this.isbn = isbn;
     this.title = title;
     this.yearPublished = yearPublished;
     this.price = price;
 }

 public String getIsbn() { 
	 return isbn; 
	 }
 public int getYearPublished() {
	 return yearPublished;
	 }
 public double getPrice() { 
	 return price;
	 }


}

