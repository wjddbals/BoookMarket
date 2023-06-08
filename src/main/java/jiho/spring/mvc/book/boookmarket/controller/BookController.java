package jiho.spring.mvc.book.boookmarket.controller;

import jiho.spring.mvc.book.boookmarket.model.Book;
import jiho.spring.mvc.book.boookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//


@Controller

public class BookController {
    @Autowired
    private BookService bookService;

  @RequestMapping(value = "/books",method = RequestMethod.GET)
    public String requestBookList(Model model){
        List<Book> list=bookService.getAllBookList();
        model.addAttribute("bookList",list);
        return "books";

    }


}
