package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Example05Controller {

    @GetMapping("/exam05/{bookId}")
    public String requestMethod(
            @MatrixVariable(required = false,defaultValue = "길벗") String q,
            Model model){
        model.addAttribute("출판사 :" +q);
        model.addAttribute("data","출판사 :" +q);
        return "webpage06";
    }


}
