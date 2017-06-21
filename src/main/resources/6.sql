SELECT * FROM homework_db.developers;
#6. Вычислить, среднюю ЗП программистов в проекте, который приносит наименьшую прибыль.
select projects.project_id, projects.project_name, AVG(developers.salary) AVGSALARY from developers inner join projects_has_developers on
developers.developer_id = projects_has_developers.developers_developer_id inner join projects on projects_has_developers.projects_project_id = 
projects.project_id group by projects.project_id order by projects.cost
