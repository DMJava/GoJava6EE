package com.ProjectManagmentSystem;

/**
 * Created by pc on 21.06.2017.
 */
public class Projects_has_developers {

    private int projects_project_id;
    private int developers_developer_id;

    public Projects_has_developers(){

    }

    public int getProjects_project_id() {
        return projects_project_id;
    }

    public void setProjects_project_id(int projects_project_id) {
        this.projects_project_id = projects_project_id;
    }

    public int getDevelopers_developer_id() {
        return developers_developer_id;
    }

    public void setDevelopers_developer_id(int developers_developer_id) {
        this.developers_developer_id = developers_developer_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projects_has_developers that = (Projects_has_developers) o;

        if (projects_project_id != that.projects_project_id) return false;
        return developers_developer_id == that.developers_developer_id;
    }

    @Override
    public int hashCode() {
        int result = projects_project_id;
        result = 31 * result + developers_developer_id;
        return result;
    }

    @Override
    public String toString() {
        return "Projects_has_developers{" +
                "projects_project_id=" + projects_project_id +
                ", developers_developer_id=" + developers_developer_id +
                '}';
    }
}
