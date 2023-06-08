package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Example04Controller {

    @GetMapping("/exam04")
    public void requestMethod(){
        System.out.println("@ReqistMapping예제입니다");
        System.out.println("웹 요청 URL은/home /exam04입니다");

    }

}
