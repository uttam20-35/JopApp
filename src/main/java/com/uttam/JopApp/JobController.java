package com.uttam.JopApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("In home()");
        return "home";
    }
}
