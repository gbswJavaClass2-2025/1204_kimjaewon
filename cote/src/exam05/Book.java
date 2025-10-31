package exam05;

public class Book {
	private String title;
	private String author;
	private int price;
	private int isbn;
	
	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public Book(String title, String author, int price, int isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	
	String getTitle(String title) {
		return title;
	}
	
	String getAuthor(String author) {
		return author;
	}
	
	int getPrice(int price) {
		return price;
	}

	int getIsbn(int isbn) {
		return isbn;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	void setPrice(int price) {
		this.price = price;
	}

	void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
}
