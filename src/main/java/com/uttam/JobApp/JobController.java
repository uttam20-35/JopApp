package com.uttam.JobApp;

import com.uttam.JobApp.model.JobPost;
import com.uttam.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

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
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model){
        System.out.println("Model Before In view all jobs :-"+model);
        List<JobPost> jobs=jobService.getAllJobs();
        model.addAttribute("jobs",jobs);
        System.out.println("Model After In view all jobs :-"+model);
        return "viewalljobs";
    }
}