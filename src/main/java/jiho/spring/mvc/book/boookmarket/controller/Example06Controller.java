package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:3000/home/exam06








@Controller
@RequestMapping("/home")
public class Example06Controller {

    @GetMapping("/exam06/{bookId}/category/{category}")
    public String requestMethod(
            @MatrixVariable MultiValueMap<String,String> matrixVars,
            @MatrixVariable(pathVar = "category" ) MultiValueMap<String,String> matrixVars2,
            Model model){
        System.out.println(matrixVars);
        System.out.println(matrixVars2);

        model.addAttribute("data",matrixVars +"<br>" + matrixVars2);

        return "webpage06";

    }


}
