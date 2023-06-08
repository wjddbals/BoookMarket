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

    @GetMapping("/exam06")
 public String requestMethod(Model model){
     model.addAttribute("data","ModelMap 예제입니다");
     model.addAttribute("data2","웹 요청 URL은 /home/exam06입니다");
     return "webpage05";

 }


}
