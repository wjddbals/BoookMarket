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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
    @GetMapping("/add")//@RequestMapping("/add")와 같다
    public String requestAddBookForm(@ModelAttribute("NewBook") Book book){
        return "addBook";//@ModeAttribute를 이용하여 커맨드 객체이름을 NewBook으로 수정한다
    }
    @PostMapping("/add")
    public String submitAddNewBook(@ModelAttribute("NewBook") Book book){//@ModelAttribute를 이용하여 커맨드 객체이름을 NewBook으로 수정한다
        bookService.setNewBook(book);//신규 도서 정보를 저장하려고 서빗 객체의 setNewBook()메서드를 호출한다
        return "redirect:books";//웹요청URL을 강제로/books로 이동시커 @RequestMapping("/books)에 매핑한다
    }
    //도서등록 페이지에 제목을 출력하려면 BookController클래스에 메서드 수준의 @ModelAttribute를 선언한 addAttributes()메서드를 추가해야 한다
    @ModelAttribute//메서드 수준의 @ModelAttribute를 선언
    public void addAttributes(Model model) {
        model.addAttribute("addTitle","신규 도서 등록");//모델 속성이름addTitle에 신규 도서 등록을 저장한다
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setAllowedFields("bookId","name","unitPrice","author","description",
                "publisher","category","unitsInStock","totalPages","releaseDate","condition");
    }

}
