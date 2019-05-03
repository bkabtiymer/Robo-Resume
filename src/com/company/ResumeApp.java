package com.company;

import javax.naming.Name;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class ResumeApp {

    public static void main(String[] args) {
        ArrayList<Resume> myResume = new ArrayList<Resume>();
        ArrayList<Education> myEdu = new ArrayList<Education>();
        ArrayList<Experience> myExperience = new ArrayList<Experience>();
        ArrayList<String> jobDescriptions = new ArrayList<>();
        ArrayList<Skills> skillsArrayList = new ArrayList<Skills>();

        int count=1;
        Scanner input = new Scanner(System.in);

        Resume resumeN = new Resume();
        System.out.println("Enter your name: ");
        resumeN.setName(input.nextLine());
        System.out.println("Enter your email");
        resumeN.setEmail(input.nextLine());
        myResume.add(resumeN);


        Education education = new Education();
        System.out.println("Do you want to add an education section?(y/n)");
        String check = input.nextLine();

        while (check.equalsIgnoreCase("y")) {
            System.out.println("Education");
            System.out.println("Enter your degree: ");
            education.setDegree(input.nextLine());
            System.out.println("Enter your major: ");
            education.setMajor(input.nextLine());
            System.out.println("Enter your University: ");
            education.setUniversity(input.nextLine());
            System.out.println("Enter your Grad Year: ");
            education.setGradYear(input.nextLine());
            myEdu.add(education);

            break;
        }


        Experience experience = new Experience();
        System.out.println("Do you want to add an experience section?(y/n)");
        String check2 = input.nextLine();

        while (check2.equalsIgnoreCase("y")) {
            System.out.println("Experience");
            System.out.println("Enter your previous company: ");
            experience.setCompany(input.nextLine());
            System.out.println("Enter your job title: ");
            experience.setJobTitle(input.nextLine());
            System.out.println("Enter your Start Date: ");
            experience.setStartDate(input.nextLine());
            System.out.println("Enter your End Date: ");
           experience.setEndDate(input.nextLine());
            System.out.println("Enter job description: ");
            experience.setJobDescriptions(input.nextLine());
            myExperience.add(experience);


            break;
        }
        Skills skill = new Skills();
        System.out.println("Do you want to add a skills section?(y/n)");
        String check3 = input.nextLine();

        while (check3.equalsIgnoreCase("y")) {
            System.out.println("Skills");
            System.out.println("Enter a skill name ");
            skill.setSkillName(input.nextLine());
            System.out.println("Enter your Skill Proficiency: ");
            skill.setSkillProficiency(input.nextLine());

            myExperience.add(experience);


            break;
        }

        System.out.println(resumeN.getName() + "\n" + resumeN.getEmail()+"\n");
        System.out.println(education.getDegree() + " in " + education.getMajor());
        System.out.println(education.getUniversity() + " , " + education.getGradYear());
        System.out.println("*"+experience.getJobTitle());
        System.out.println(experience.getCompany()+" , "+experience.getStartDate()+" - "+experience.getEndDate());
        System.out.println("*"+experience.getJobTitle());
        System.out.println(experience.getCompany()+" , "+experience.getStartDate()+" - "+experience.getEndDate());
}}
//

