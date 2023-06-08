package jiho.spring.mvc.book.boookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController { //http://localhost:3000/home

  @GetMapping(value = "/home")
    public  String welcome(Model model) {
        model.addAttribute("greeting","welcome to BookMarket");
        model.addAttribute("strapline","welcome to Web Shopping Mall");
        return "welcome";


    }



}
