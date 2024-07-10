package ch12._24Book;

import java.text.NumberFormat;
import java.util.Locale;

public class Book {
    private String category;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private String isbn;
 

    public Book(String category, String title, String author, String publisher, int price, String isbn) {
        this.category = category;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.isbn = isbn;
 
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

    public String getFormattedPrice() {
        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.KOREA);
        return formatter.format(price);
    }

    public void printInfo() {
        System.out.println("분야=" + getCategory());
        System.out.println("제목=" + getTitle());
        System.out.println("출판사=" + getPublisher());
        System.out.println("가격=" + getFormattedPrice());
        System.out.println("isbn=" + getIsbn());
    }
}
