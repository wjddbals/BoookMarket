package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//http://localhost:3000/home/exam07


@Controller
@RequestMapping("/home")
public class Example07Controller {

    @GetMapping("/exam07")
   public ModelAndView requestMethod(ModelMap model){
       ModelAndView mav=new ModelAndView();
       mav.addObject("data","ModelAndView 예제입니다");
       mav.addObject("data2","웹 요청 URL은 /home/exam07 입니다");
       mav.setViewName("webpage05");
       return mav;
   }
    @GetMapping("/exam07")
    public String requestMethod(@RequestParam String id, Model model){
        System.out.println("도서 ID: " +id);
        model.addAttribute("data","도서 ID : " +id);
        return "webpage06";

    }

}
