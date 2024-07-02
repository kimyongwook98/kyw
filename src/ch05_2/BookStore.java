package ch05_2;


public class BookStore {
	private Book[] bookArray;
	
	
	public Book[] getBookArray() {
		return bookArray;
	}
	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}
	
	public BookStore (Book[] bookArray) {
		this.bookArray = bookArray;
	}
	

	
	public void printBookStore() {
			
			for (int i = 0; i < bookArray.length; i++) { 
				System.out.println(i + 1 + ".");
				bookArray[i].printInfo();
			}
		}
}
