package com.ProjectManagmentSystem.Service;

import com.ProjectManagmentSystem.ConnectionToDb.UtilConnection;
import com.ProjectManagmentSystem.DAO.Projects_has_developersDAO;
import com.ProjectManagmentSystem.Projects_has_developers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Projects_has_developersService extends UtilConnection implements Projects_has_developersDAO {

    private Connection connection = getConnection();

    @Override
    public void add(Projects_has_developers projects_has_developers) {

    }

    @Override
    public List<Projects_has_developers> getAll() {
        return null;
    }

    @Override
    public Projects_has_developers getById(int projects_project_id, int developers_developer_id) throws SQLException {
        PreparedStatement ps = null;
        String sql = "SELECT DEVELOPER_ID, PROJECT_ID FROM Projects_has_developers WHERE DEVELOPER_ID=? AND PROJECT_ID=?";
        Projects_has_developers pHd = new Projects_has_developers();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, projects_project_id);
            ps.setInt(2, developers_developer_id);

            ResultSet rs = ps.executeQuery();
            pHd.setProjects_project_id(rs.getInt("PROJECT_ID"));
            pHd.setDevelopers_developer_id(rs.getInt("DEVELOPER_ID"));
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
        return pHd;
    }

    @Override
    public void update(Projects_has_developers projects_has_developers) throws SQLException {
        PreparedStatement ps = null;
        String sql = "UPDATE Projects_has_developers SET DEVELOPER_ID=?, PROJECT_ID=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, projects_has_developers.getDevelopers_developer_id());
            ps.setInt(2, projects_has_developers.getProjects_project_id());
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
    public void remove(Projects_has_developers projects_has_developers) throws SQLException {
        PreparedStatement ps = null;
        String sql = "DELETE FROM Projects_has_developers WHERE PROJECT_ID =?, DEVELOPER_ID=? ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, projects_has_developers.getProjects_project_id());
            ps.setInt(2, projects_has_developers.getDevelopers_developer_id());
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
