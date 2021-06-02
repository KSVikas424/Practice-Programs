package files;

import java.io.*;

public class Book implements Serializable{
	String title;
	String author;
	int edition;
	int price;
	public Book(String title, String author, int edition, int price) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.price = price;
}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", edition=" + edition + ", price=" + price + "]";
	}
	
}
