package com.uttam.JobApp.model;

public class JobPost {
    private String jobTitle;
    private String company;
    private String location;
    private int salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}