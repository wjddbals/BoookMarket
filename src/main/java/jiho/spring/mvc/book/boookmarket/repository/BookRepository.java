package jiho.spring.mvc.book.boookmarket.repository;

import jiho.spring.mvc.book.boookmarket.model.Book;

import java.util.List;


public interface BookRepository {
    List<Book> getAllBookList();
    List<Book> getBookListByCategory(String category);

}
