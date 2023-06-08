package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Example01Controller {

    @RequestMapping(value = "/exam01",method = RequestMethod.GET)
    public void requsetMethod(){
        System.out.println("@Controller예제입니다");
    }


}
