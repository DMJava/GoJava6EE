package com.ProjectManagmentSystem.pojo;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public class Projects {
    private int project_id;
    private String project_name;
    private int cost;
    private List<Developers> developerList;

    public Projects() {

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Developers> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developers> developerList) {
        this.developerList = developerList;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", cost=" + cost +
                ", developerList=" + developerList +
                '}';
    }
}
