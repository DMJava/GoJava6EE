package com.ProjectManagmentSystem.Service;

import com.ProjectManagmentSystem.ConnectionToDb.UtilConnection;
import com.ProjectManagmentSystem.DAO.DeveloperDAO;
import com.ProjectManagmentSystem.Developer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public class DeveloperService extends UtilConnection implements DeveloperDAO {

    Connection connection = getConnection();

    @Override
    public void add(Developer developer) {
        PreparedStatement ps = null;

    }

    @Override
    public List<Developer> getAll() {
        return null;
    }

    @Override
    public Developer getbyId(int developer_id) {
        return null;
    }

    @Override
    public void update(Developer developer) {

    }

    @Override
    public void remove(Developer developer) {

    }
}
