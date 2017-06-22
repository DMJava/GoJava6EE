package com.ProjectManagmentSystem.DAO;

import com.ProjectManagmentSystem.Projects_has_developers;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 21.06.2017.
 */
public interface Projects_has_developersDAO {

    //CREATE
    void add(Projects_has_developers projects_has_developers);

    //READ
    List<Projects_has_developers> getAll();

    Projects_has_developers getById(int projects_project_id, int developers_developer_id) throws SQLException;

    //UPDATE
    void update(Projects_has_developers projects_has_developers) throws SQLException;

    //DELETE
    void remove(Projects_has_developers projects_has_developers) throws SQLException;
}
