package ch05_3;


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
	
	public void printBooksByCategory(String category) {
	    boolean categoryExists = false;


	    for (int i = 0; i < bookArray.length; i++) {
	        if (bookArray[i].getCategory().equals(category)) {
	            categoryExists = true;

	            if (category.equals("comic")) {
	                System.out.println("분야 : 코믹");
	                bookArray[i].printCategoryInfo();
	            } else if (category.equals("travel")) { 
	                System.out.println("분야 : 여행");
	                bookArray[i].printCategoryInfo();
	            } else if (category.equals("food")) { 
	                System.out.println("분야 : 음식");
	                bookArray[i].printCategoryInfo();
	            } 
	        }
	    }
        	if (!categoryExists) {
        		System.out.println("노 데이타");
        	}
	}
	
	
	public void printBookByIsbn(String isbn) {
		boolean isbnExists = false;
		
		for (int i =0; i < bookArray.length; i++) {
			if(bookArray[i].getIsbn().equals(isbn)) {
				isbnExists = true;
				
				if (isbn.equals("979-11-90277-42-6")) {
					bookArray[i].printInfo();
				} 
				else if (isbn.equals("979-11-90277-42-7")) {
					bookArray[i].printInfo();
				}
			}
		}
		  if (!isbnExists) { 
			  System.out.println("노 데이타");
		  }
	}
	
	
	public void printBookByTitleLike(String title) {
		boolean titleExists = false;
		
		for (int i =0; i < bookArray.length; i++) {
			if(bookArray[i].getTitle().contains(title)) {
				titleExists = true;
				
				if (title.contains("뉴욕")) {
					bookArray[i].printInfo();
				} 
				else if (title.contains("열혈")) {
					bookArray[i].printInfo();
				}
			}
		}
		  if (!titleExists) { 
			  System.out.println("노 데이타");
		  }
	}
	
	
	public void printBooksByMaxPrice(int price) {
		for (int i =0; i < bookArray.length; i++) {
			if(price >= bookArray[i].getPrice()) {
				bookArray[i].printInfo();
			}

		}
		if (price < 4500) {
			System.out.println("노 데이타");
		}
	}
	
	public void printBooksByMinPrice(int price) {
		for (int i =0; i < bookArray.length; i++) {
			if(price <= bookArray[i].getPrice()) {
				bookArray[i].printInfo();
			}

		}
		if (price > 24000) {
			System.out.println("노 데이타");
		}
		
			
	}
	
	public void printBooksByBetweenPrice(int minPrice, int maxPrice) {
		for (int i =0; i < bookArray.length; i++) {
			if(minPrice <= bookArray[i].getPrice() && bookArray[i].getPrice() <= maxPrice) {
				bookArray[i].printInfo();
			}

		}
		if (minPrice > 24000 || maxPrice < 4500 ) {
			System.out.println("노 데이타");
		}
	}
	
}
