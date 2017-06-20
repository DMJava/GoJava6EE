package com.ProjectManagmentSystem;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public class Project {
    private int project_id;
    private String project_name;
    private List<Developer> developerList;

    public Project() {

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

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", developerList=" + developerList +
                '}';
    }
}
