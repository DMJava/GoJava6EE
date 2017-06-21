package com.ProjectManagmentSystem.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 21.06.2017.
 */
public interface Projects_has_developersDAO {

    //CREATE
    void add(Projects_has_developersDAO projects_has_developersDAO);

    //READ
    List<Projects_has_developersDAO> getAll();

    Projects_has_developersDAO getById(int projects_project_id, int developers_developer_id) throws SQLException;

    //UPDATE
    void update(Projects_has_developersDAO projects_has_developersDAO) throws SQLException;

    //DELETE
    void remove(Projects_has_developersDAO projects_has_developersDAO);
}
