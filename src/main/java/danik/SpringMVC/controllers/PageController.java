package danik.SpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/firstPage")
    public String hello(){
        return "otherPage/firstPage";
    }
    @GetMapping("/registration")
    public String registration(){
        return "otherPage/registration";
    }
    @GetMapping("/singIn")
    public String singIn(){
        return "otherPage/singIn";
    }
}
