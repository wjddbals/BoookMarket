package jiho.spring.mvc.book.boookmarket.service;

import jiho.spring.mvc.book.boookmarket.model.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookService {
    List<Book> getAllBookList();
    List<Book> getBookListByCategory(String category);//p154
    Set<Book> getBookListByFilter(Map<String,List<String>> filter);

}
