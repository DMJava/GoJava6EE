package com.ProjectManagmentSystem.service;

import com.ProjectManagmentSystem.connectiontodb.UtilConnection;
import com.ProjectManagmentSystem.dao.DeveloperDAO;
import com.ProjectManagmentSystem.pojo.Developers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeveloperService extends UtilConnection implements DeveloperDAO {

    Connection connection = getConnection();

    @Override
    public void add(Developers developer) throws SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO developers (DEVELOPER_ID, DEVELOPER_NAME, SALARY) VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, developer.getDeveloper_id());
            ps.setString(2, developer.getDeveloper_name());
            ps.setInt(3, developer.getSalary());
            ps.executeUpdate();

        } catch (Exception e) {
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
    public List<Developers> getAll() throws SQLException {
        List<Developers> developerList = new ArrayList<>();
        String sql = "SELECT DEVELOPER_ID, DEVELOPER_NAME, SALARY FROM developers";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Developers developer = new Developers();
                developer.setDeveloper_id(rs.getInt("DEVELOPER_ID"));
                developer.setDeveloper_name(rs.getString("DEVELOPER_NAME"));
                developer.setSalary(rs.getInt("SALARY"));
                developerList.add(developer);
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
        return developerList;
    }

    @Override
    public Developers getbyId(int developer_id) throws SQLException {
        PreparedStatement ps = null;
        String sql = "SELECT DEVELOPER_ID, DEVELOPER_NAME, SALARY FROM developers WHERE DEVELOPER_ID=?";
        Developers developer = new Developers();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, developer_id);
            ResultSet rs = ps.executeQuery();
            developer.setDeveloper_id(rs.getInt("DEVELOPER_ID"));
            developer.setDeveloper_name(rs.getString("DEVELOPER_NAME"));
            developer.setSalary(rs.getInt("SALARY"));
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
        return developer;
    }

    @Override
    public void update(Developers developer) throws SQLException {
        PreparedStatement ps = null;
        String sql = "UPDATE developers SET DEVELOPER_NAME=?, SALARY=? WHERE DEVELOPER_ID=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, developer.getDeveloper_name());
            ps.setInt(2, developer.getSalary());
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
    public void remove(Developers developer) throws SQLException {
        PreparedStatement ps = null;
        String sql = "DELETE FROM developers WHERE DEVELOPER_ID=? ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, developer.getDeveloper_id());
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
