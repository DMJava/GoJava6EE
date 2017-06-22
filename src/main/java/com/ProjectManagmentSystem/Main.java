package com.ProjectManagmentSystem;

import com.ProjectManagmentSystem.Service.DeveloperService;
import com.ProjectManagmentSystem.Service.ProjectService;
import com.ProjectManagmentSystem.Service.Projects_has_developersService;

import java.sql.SQLException;

/**
 использует БД, созданную в домашнем задании для пункта 1.2
 позволяет выполнять CRUD (CREATE, READ, UPDATE, DELETE) операции для таблиц:
 developers
 skills
 companies
 customers
 projects
 Создать разработчика, добавить ему навыки.
 Создать проект, и добавить в данный проект разработчиков.
 */
public class Main {
    public static void main(String[] args) {
        DeveloperService developerService = new DeveloperService();
        ProjectService projectService = new ProjectService();
        Projects_has_developersService pHdS = new Projects_has_developersService();

        Developers developers = new Developers();
        developers.setDeveloper_id(9);
        developers.setDeveloper_name("9999");
        developers.setSalary(5000);

        Projects projects = new Projects();
        projects.setProject_id(7);
        projects.setProject_name("Proj7");
        projects.setCost(6800);

        Projects_has_developers pHd = new Projects_has_developers();
        pHd.setProjects_project_id(projects.getProject_id());
        pHd.setDevelopers_developer_id(developers.getDeveloper_id());

        try {
            developerService.add(developers);
            projectService.add(projects);
            pHdS.add(pHd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
