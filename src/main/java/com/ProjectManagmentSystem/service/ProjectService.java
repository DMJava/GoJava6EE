package com.ProjectManagmentSystem.service;

import com.ProjectManagmentSystem.connectiontodb.UtilConnection;
import com.ProjectManagmentSystem.dao.ProjectDAO;
import com.ProjectManagmentSystem.pojo.Projects;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectService extends UtilConnection implements ProjectDAO {

    private Connection connection = getConnection();

    @Override
    public void add(Projects project) throws SQLException {
        PreparedStatement ps = null;

        String sql = "INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, COST) VALUES (?, ?, ?) ";
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
    public List<Projects> getAll() throws SQLException {
        List<Projects> projects = new ArrayList<>();
        String sql = "SELECT project_id, project_name, cost FROM projects";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Projects projects1 = new Projects();
                projects1.setProject_id(rs.getInt("PROJECT_ID"));
                projects1.setProject_name(rs.getString("PROJECT_NAME"));
                projects1.setCost(rs.getInt("COST"));
                projects.add(projects1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return projects;
    }

    @Override
    public Projects getbyId(int project_id) throws SQLException {
        PreparedStatement ps = null;
        String sql = "SELECT PROJECT_ID, PROJECT_NAME, COST FROM projects WHERE PROJECT_ID=? ";
        Projects projects = new Projects();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, project_id);
            ResultSet rs = ps.executeQuery();
            projects.setProject_id(rs.getInt("PROJECT_ID"));
            projects.setProject_name(rs.getString("PROJECT_NAME"));
            projects.setCost(rs.getInt("COST"));
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
        return projects;
    }

    @Override
    public void update(Projects project) throws SQLException {
        PreparedStatement ps = null;
        String sql = "UPDATE projects SET PROJECT_NAME=?, COST=? WHERE PROJECT_ID=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, project.getProject_name());
            ps.setInt(2, project.getCost());
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
    public void remove(Projects project) throws SQLException {
        PreparedStatement ps = null;
        String sql = "DELETE FROM projects WHERE PROJECT_ID=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, project.getProject_id());
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
}
