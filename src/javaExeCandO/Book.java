package javaExeCandO;

public class Book {
	
	String title;
	String author;
	int pages;
	String language;
	
	public Book(String title, String author, int pages, String language) {
		this.title = title;   // by using this.title we are referring to the UPPER title, and by using next title we are reffering to 
		this.author = author;  // title inside (). So basically we are making those two Strings equall to each other.
		this.pages = pages;
		this.language = language;
	}
	
}
