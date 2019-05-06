package com.company;

import java.util.ArrayList;

public class Skills {
    private String skillName;
    private String skillProficiency;

    public Skills() {
    }

    private String skills;
    private ArrayList<String> skillSet = new ArrayList<String>();

    public ArrayList<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(ArrayList<String> skillSet) {
        for (int i = 0; i < skillSet.size(); i++)
            this.skillSet.add(skillSet.get(i));
    }
}


//
//    }
//
//    public String getSkillName() {
//        return skillName;
//    }
//
//    public void setSkillName(String skillName) {
//        this.skillName = skillName;
//    }
//
//    public String getSkillProficiency() {
//        return skillProficiency;
//    }
//
//    public void setSkillProficiency(String skillProficiency) {
//        this.skillProficiency = skillProficiency;
//    }
//
//
//    public void listSkills(){
//        System.out.println("*"+getSkillName()+" , "+getSkillProficiency());
//    }
//}
