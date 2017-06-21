package com.ProjectManagmentSystem.DAO;

import com.ProjectManagmentSystem.Projects;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public interface ProjectDAO {

    //CREATE
    void add(Projects project) throws SQLException;

    //READ
    List<Projects> getAll();

    Projects getbyId(int project_id);

    //UPDATE
    void update(Projects project);

    //DELETE
    void remove(Projects project);
}
