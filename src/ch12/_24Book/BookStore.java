package ch12._24Book;

import java.util.List;

public class BookStore {

	private List<Book> bookList;
   
    
    public BookStore(List<Book> bookList) {
        super();
        this.bookList = bookList;
        
    }

    public void printBookStore() {
        int index = 1;
    	for (Book book : bookList) {
            System.out.println(index + ".");
            book.printInfo();
            System.out.println();  // 줄바꿈을 위해 추가
            index++;
        }
    }

    public void printBookByCategory(String category) {
    	int index = 1;
        for (Book book : bookList) {
            if (book.getCategory().equals(category)) {
                System.out.println(index + ".");
                book.printInfo();
                System.out.println();  // 줄바꿈을 위해 추가
                index++;
            }
        }
        
    }

    public void printBookByisbn(String isbn) {
    	int index = 1;
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println(index + ".");
                book.printInfo();
                System.out.println();  // 줄바꿈을 위해 추가
                index++;
            }
        }
        
    }

    public void printBookByMaxPrice(int maxPrice) {
    	int index = 1;
        for (Book book : bookList) {
            if (book.getPrice() <= maxPrice) {
                System.out.println(index + ".");
                book.printInfo();
                System.out.println();  // 줄바꿈을 위해 추가
              index++;
            }
        }
    }

    public void printBookByMinPrice(int minPrice) {
    	int index = 1;
        for (Book book : bookList) {
            if (book.getPrice() >= minPrice) {
                System.out.println(index + ".");
                book.printInfo();
                System.out.println();  // 줄바꿈을 위해 추가
                index++;
            }
        }
        
    }

    public void printBookByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
     int index = 1;
        for (Book book : bookList) {
            if (book.getPrice() >= betweenMinPrice && book.getPrice() <= betweenMaxPrice) {
                System.out.println(index + ".");
                book.printInfo();
                System.out.println();  // 줄바꿈을 위해 추가
                index++;
            }
        }
    }
}
