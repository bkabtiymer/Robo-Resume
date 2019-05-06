package com.company;

import com.company.Education;
import com.company.Experience;
import com.company.Skills;

import java.sql.Array;
import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    ArrayList<String> educationList= new ArrayList<String>();
    ArrayList<String> experience= new ArrayList<String>();
    ArrayList<String> skillSet= new ArrayList<String>();


    public Resume() {
        this.name = name;
        this.email = email;}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getEducationList(int i) {
        return educationList.get(i);
    }

    public void setEducationList(String edu) {
        this.educationList.add(edu);
    }

    public String getExperience(int k) {
        return experience.get(k);
    }

    public void setExperience(String exp) {
        this.experience.add(exp);
    }

    public String getSkillSet(int i) {
        return skillSet.get(i);
    }

    public void setSkillSet(String skill) {
        this.skillSet.add(skill);
    }
}