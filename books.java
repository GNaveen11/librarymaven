package Libraryhiber.maven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class books{
	@Id
	private int bookid;
	private String book_name;
	private String author_name;
	private float price;
	
	public books() {
		super();
	}

	public books(int bookid, String book_name, String author_name, float price) {
		super();
		this.bookid = bookid;
		this.book_name = book_name;
		this.author_name = author_name;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
