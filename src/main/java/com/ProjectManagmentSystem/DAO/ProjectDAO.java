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
    List<Projects> getAll() throws SQLException;

    Projects getbyId(int project_id) throws SQLException;

    //UPDATE
    void update(Projects project) throws SQLException;

    //DELETE
    void remove(Projects project) throws SQLException;
}
