package com.company;

import java.util.ArrayList;

public class Experience {
    private ArrayList<String> company=new ArrayList<String>();
    private ArrayList<String> jobTitle=new ArrayList<String>();
    private ArrayList<String> startDate=new ArrayList<String>();
    private ArrayList<String> endDate=new ArrayList<String>();

    public ArrayList<String> getCompany() {
        return company;
    }

    public void setCompany(ArrayList<String> company) {
        this.company = company;
    }

    public ArrayList<String> getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(ArrayList<String> jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ArrayList<String> getStartDate() {
        return startDate;
    }

    public void setStartDate(ArrayList<String> startDate) {
        this.startDate = startDate;
    }

    public ArrayList<String> getEndDate() {
        return endDate;
    }

    public void setEndDate(ArrayList<String> endDate) {
        this.endDate = endDate;
    }
//    public String getJobDescriptions() {
//        return jobDescriptions;
//    }
//
//    public void setJobDescriptions(String jobDescriptions) {
//        this.jobDescriptions = jobDescriptions;
//    }
//
//    private String jobDescriptions;
//
//    public Experience() {
//    }

//    public Experience(String company, String jobTitle, String startDate, String endDate) {
//        this.company = company;
//        this.jobTitle = jobTitle;
//        this.startDate = startDate;
//        this.endDate = endDate;

    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public void setJobTitle(String jobTitle) {
//        this.jobTitle = jobTitle;
//    }
//
//    public String getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
//    public void listExperience(){
//        System.out.println("*"+getJobTitle());
//        System.out.println(getCompany()+" , "+getStartDate()+" - "+getEndDate());
//    }
//}