package ch12._24Book;

public class Book {
	private String category;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String isbn;
	
	public Book(String category, String title, String author, String publisher, int price, String isbn) {
		this.category=category;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.isbn=isbn;
	}
	
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


	public static void printInfo() {

		System.out.println("분야=" + category);
		System.out.println("제목=" + title);
		System.out.println("저자=" + author);
		System.out.println("출판사=" + publisher);
		System.out.println("가격=" + price);
		System.out.println("isbn=" + isbn);
		
		
		
	}
}
