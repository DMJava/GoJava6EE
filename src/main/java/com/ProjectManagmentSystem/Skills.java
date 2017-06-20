package com.ProjectManagmentSystem;

/**
 * Created by pc on 20.06.2017.
 */
public class Skills {
    private int skill_id;
    private String skill_name;

    public Skills() {

    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skill_id=" + skill_id +
                ", skill_name='" + skill_name + '\'' +
                '}';
    }
}
