package jiho.spring.mvc.book.boookmarket.service;

import jiho.spring.mvc.book.boookmarket.model.Book;
import jiho.spring.mvc.book.boookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBookList(){
        return bookRepository.getAllBookList();
    }

    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory=bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }

    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter=bookRepository.getBookListByFilter(filter);
        return booksByFilter;
    }

    @Override
    public Book getBookById(String bookId) {
        Book bookById=bookRepository.getBookById(bookId);
        return bookById;
    }

    @Override
    public void setNewBook(Book book) {//신규도서 정보를 저장소 객체에 저장하는 메서드 이다
        bookRepository.setNewBook(book);//저장소 객체의 setNewBook()메서드를 호출한다
    }
}



