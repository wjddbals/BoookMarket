package jiho.spring.mvc.book.boookmarket.controller;

import jiho.spring.mvc.book.boookmarket.model.Book;
import jiho.spring.mvc.book.boookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Set;
//


@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String requestBookList(Model model){
        List<Book> list=bookService.getAllBookList();
        model.addAttribute("bookList",list);
        return "books";

    }


    @GetMapping("/all")
    public ModelAndView requestAllBooks(){
        ModelAndView modelAndView=new ModelAndView();
        List<Book> list =bookService.getAllBookList();
        modelAndView.addObject("bookList",list);
        modelAndView.setViewName("books");
        return modelAndView;
    }

    @GetMapping("/{category}")
    public String requestBooksByCategory(@PathVariable("category") String bookCategory,
                                         Model model) {
        List<Book> booksByCategory=bookService.getBookListByCategory(bookCategory);
        model.addAttribute("bookLIst",booksByCategory);
        return "books";
    }
    @GetMapping("/filter/{bookFilter}")
    public String requestBooksByFilter(
            @MatrixVariable(pathVar="bookFilter") Map<String,List<String>> bookFilter,
            Model model) {
        Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
        model.addAttribute("bookList", booksByFilter);
        return "books";
    }
    //getBookById메서드 추가
    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId,Model model) {
        Book bookById=bookService.getBookById(bookId);
        model.addAttribute("book",bookById);
        return "book";
    }
    @GetMapping("/add")
    public String requestAddBookForm(Book book){
        return "addBook";
    }
}
