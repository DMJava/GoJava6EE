package com.ProjectManagmentSystem.DAO;

import com.ProjectManagmentSystem.Developer;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public interface DeveloperDAO {
    //CREATE
    void add(Developer developer);

    //READ
    List<Developer> getAll();

    Developer getbyId(int developer_id);

    //UPDATE
    void update(Developer developer);

    //DELETE
    void remove(Developer developer);

}
