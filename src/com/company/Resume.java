package com.company;

import com.company.Education;
import com.company.Experience;
import com.company.Skills;

import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private ArrayList<Education> educationList = new ArrayList<>();
    private ArrayList<Experience> experience= new ArrayList<>();
    private ArrayList<Skills> skills = new ArrayList<>();

    public Resume() {
        this.name = name;
        this.email = email;}

   public void showResume() {

       System.out.println("EDUCATION: ");
       for (Education edu : educationList) {
           edu.listEducation();
       }
       System.out.println("EXPERIENCE: ");
       for (Experience exper : experience) {
           exper.listExperience();
       }
       System.out.println("SKILLS: ");
       for (Skills skill : skills) {
           skill.listSkills();
       }
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEducation(Education educate){
            educationList.add(educate);
      }
       public Education getEducation(int i) {
           return educationList.get(i);
       }
    public void addExperience(Experience experie){
        experience.add(experie);
    }
        public Experience getExperience(int i) {
        return experience.get(i);
    }
    public void addSkills(Skills skills2) {
        skills.add(skills2);
    }
    public Skills getSkills(int i) {
        return skills.get(i);
    }

}