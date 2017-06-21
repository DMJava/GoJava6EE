package com.ProjectManagmentSystem.Service;

import com.ProjectManagmentSystem.ConnectionToDb.UtilConnection;
import com.ProjectManagmentSystem.DAO.ProjectDAO;
import com.ProjectManagmentSystem.Projects;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectService extends UtilConnection implements ProjectDAO {

    private Connection connection = getConnection();

    @Override
    public void add(Projects project) throws SQLException {
        PreparedStatement ps = null;

        String sql = "INSERT INTO PROJECT (PROJECT_ID, PROJECT_NAME, COST) VALUES (?, ?, ?) ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, project.getProject_id());
            ps.setString(2, project.getProject_name());
            ps.setInt(3, project.getCost());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public List<Projects> getAll() {
        List<Projects> projects = new ArrayList<>();
        String sql = "SELECT project_id, project_name, cost FROM projects";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return projects;
    }

    @Override
    public Projects getbyId(int project_id) {
        return null;
    }

    @Override
    public void update(Projects project) {

    }

    @Override
    public void remove(Projects project) {

    }
}
