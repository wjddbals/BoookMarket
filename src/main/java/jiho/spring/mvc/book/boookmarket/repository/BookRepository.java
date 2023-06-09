package jiho.spring.mvc.book.boookmarket.repository;

import jiho.spring.mvc.book.boookmarket.model.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;


public interface BookRepository {
    List<Book> getAllBookList();
    List<Book> getBookListByCategory(String category);
    Set<Book> getBookListByFilter(Map<String,List<String>> filter);
}
