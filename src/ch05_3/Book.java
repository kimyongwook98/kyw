package ch05_3;

public class Book {
	String category; //분야
	String title; //제목
	String author; //저자
	String publisher; //출판사
	int price; //가격
	String isbn; //isbn
	Book[] bookArray;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book[] getBookArray() {
		return bookArray;
	}
	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}
	
	public Book(String category, String title, String author,
	String publisher, int price, String isbn) {
		this.category = category;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
	}
	
	public void printInfo( ) {
		System.out.println("분야: " + category + "제목: " + "저자: " + author + "\n출판사: " + publisher + "\n가격: " + price + "\nisbn: " + isbn);
	}
	
	public void printCategoryInfo( ) {
		System.out.println("제목: " + title + " 저자: " + author + " 출판사: " + publisher + " 가격: " + price + " isbn: " + isbn);
	}
	
}
