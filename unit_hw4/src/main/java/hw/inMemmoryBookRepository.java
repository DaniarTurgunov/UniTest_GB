package hw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inMemmoryBookRepository implements BookRepository {
    private final Map<String, Book> books;

    public inMemmoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));
    }

    @Override
    public Book findById(String id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
