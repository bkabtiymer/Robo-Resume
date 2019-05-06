package com.company;

import javax.naming.Name;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Resume> myResumes = new ArrayList<Resume>();
        ArrayList<Education> myEdu = new ArrayList<Education>();
        ArrayList<Experience> myExperience = new ArrayList<Experience>();
        ArrayList<String> jobDescriptions = new ArrayList<>();
        ArrayList<Skills> skillsArrayList = new ArrayList<Skills>();
        boolean done=true;
        int count=0;
        Scanner input = new Scanner(System.in);

    while(done) {
        myResumes.add(new Resume());
        System.out.println("Enter your name: ");
        myResumes.get(count).setName(input.nextLine());
        System.out.println("Enter your email");
        myResumes.get(count).setEmail(input.nextLine());

        System.out.println("Enter your phone number");
        myResumes.get(count).setPhoneNumber(input.nextLine());
        Education education = new Education();
        int eduCounter=0;
        while (done == true)
        {
            System.out.println("Education");
            System.out.println("Enter your degree: ");
            String degree = (input.nextLine());
            System.out.println("Enter your major: ");
            String major = (input.nextLine());
            System.out.println("Enter your University: ");
            String university = (input.nextLine());
            System.out.println("Enter your Grad Year: ");
            String gradYear = (input.nextLine());
            myResumes.get(count).setEducationList(degree+" in "+ major+", \n" + university +" , " + gradYear+"\n");
            System.out.println("Would you like to add another education? (y/n)");
            String test = input.nextLine();
            if (test.equalsIgnoreCase("n")){
                break;}
                eduCounter++;
        }


        Experience experience = new Experience();
        int expCounter=0;
        while (done == true) {
            System.out.println("Experience");
            System.out.println("Enter your previous company: ");
            String company = (input.nextLine());
            System.out.println("Enter your job title: ");
            String jobTitle = (input.nextLine());
            System.out.println("Enter your Start Date: ");
            String startDate = (input.nextLine());
            System.out.println("Enter your End Date: ");
            String endDate = (input.nextLine());
            System.out.println("Enter job description: ");
            String jobDescription = (input.nextLine());
            myResumes.get(count).setExperience(jobTitle+"\n"+company+" , "+startDate+" - "+endDate+"\n"+jobDescription);
            System.out.println("Would you like add another job experience? (y/n) ");
            String check3 = input.nextLine();
            if (check3.equalsIgnoreCase("n")){
                break;}
                expCounter++;
        }


        int skillCounter=0;
        while (done == true) {
            System.out.println("Skills");
            System.out.println("Enter a skill name ");
            String setSkillName = (input.nextLine());
            System.out.println("Enter your Skill Proficiency: ");
            String setSkillProficiency = (input.nextLine());
            myResumes.get(count).setSkillSet(setSkillName+" , "+setSkillProficiency);
            System.out.println("Would you like to add another skill? (y/n");
            String check5 = input.nextLine();
            if (check5.equalsIgnoreCase("n")){
                break;}
                skillCounter++;
        }
        System.out.println("Would you like to add another resume? (y/n)");
        String check7= input.nextLine();
        if(check7.equalsIgnoreCase("N"));
        break;
    }
//        myResumes.add(new Resume());
//        myResumes.get(count).setName(input.nextLine());
        for(int i=0;i<myResumes.size();i++){
        System.out.println(myResumes.get(i));
            for (int j=0;j<myEdu.size();j++){
                System.out.println(myResumes.get(j).educationList);
            }
            for(int k=0;k<myExperience.size();k++){
                System.out.println(myResumes.get(k).experience);
            }
            for (int p=0;p<skillsArrayList.size();p++){
                System.out.println(myResumes.get(p).skillSet);
            }

        }
    }
}
//

