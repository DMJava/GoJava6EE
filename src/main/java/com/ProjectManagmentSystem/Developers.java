package com.ProjectManagmentSystem;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public class Developers {
    private int developer_id;
    private String developer_name;
    private int salary;
    private List<Skills> skillsList;

    public Developers(){

    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(int developer_id) {
        this.developer_id = developer_id;
    }

    public String getDeveloper_name() {
        return developer_name;
    }

    public void setDeveloper_name(String developer_name) {
        this.developer_name = developer_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Skills> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skills> skillsList) {
        this.skillsList = skillsList;
    }

    @Override
    public String toString() {
        return "Developers{" +
                "developer_id=" + developer_id +
                ", developer_name='" + developer_name + '\'' +
                ", salary=" + salary +
                ", skillsList=" + skillsList +
                '}';
    }
}