package com.ProjectManagmentSystem;

import com.ProjectManagmentSystem.ConnectionToDb.UtilConnection;

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
        UtilConnection u = new UtilConnection();
        u.getConnection();
    }
}
