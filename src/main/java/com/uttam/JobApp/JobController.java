package com.uttam.JobApp;

import com.uttam.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping({"/","home"})
    public String home(){
        System.out.println("In home()");
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        System.out.println("In addJob()");
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        System.out.println("In handleForm()"+jobPost);
        return "success";
    }

}
