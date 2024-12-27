package com.uttam.JobApp.repo;

import com.uttam.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs =new ArrayList<>(Arrays.asList(
            new JobPost("Soft Eng","infosys","mumbai",50000),
            new JobPost("Soft dev","accenture","benguluru",60000),
            new JobPost("Data analyst","tcs","navi mumbai",10000),
            new JobPost("HR","google","thane",180000)
    )
    );

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }
}
