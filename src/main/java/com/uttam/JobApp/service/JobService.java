package com.uttam.JobApp.service;

import com.uttam.JobApp.model.JobPost;
import com.uttam.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

}
