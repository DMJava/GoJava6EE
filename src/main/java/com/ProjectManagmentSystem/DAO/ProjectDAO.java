package com.ProjectManagmentSystem.DAO;

import com.ProjectManagmentSystem.Project;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public interface ProjectDAO {

    //CREATE
    void add(Project project);

    //READ
    List<Project> getAll();

    Project getbyId(int project_id);

    //UPDATE
    void update(Project project);

    //DELETE
    void remove(Project project);
}
