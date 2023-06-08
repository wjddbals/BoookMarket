package jiho.spring.mvc.book.boookmarket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/exam02",method = RequestMethod.GET)
public class Example02Controller {

    @RequestMapping
    public void requsetMethod(){

        System.out.println("@Controller예제입니다");
        System.out.println("웹 요청 URL은 /exam02입니다");
    }


}
