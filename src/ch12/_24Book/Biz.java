package ch12._24Book;
import java.util.ArrayList;
import java.util.List;

public class Biz {

    public List<Book> convert(String[] contents) {
        List<Book> bookList = new ArrayList<>();

        for (String content : contents) {
            String[] parts = content.split("/");
            if (parts.length == 6) {
                String category = parts[0];
                String title = parts[1];
                String author = parts[2];
                String publisher = parts[3];
                int price = Integer.parseInt(parts[4]);
                String isbn = parts[5];

                Book book = new Book(category, title, author, publisher, price, isbn);
                bookList.add(book);
            }
        }

        return bookList;
    }
}
