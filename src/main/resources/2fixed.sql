SELECT * FROM homework_db.projects;

select projects.project_id , projects.project_name , sum(developers.salary) TOTAL from projects_has_developers inner join developers 
on projects_has_developers.developers_developer_id = developers.developer_id inner join projects on projects_has_developers.projects_project_id =
projects.project_id group by projects.project_id order by TOTAL desc limit 1;
#2. Найти самый дорогой проект (исходя из ЗП разработчиков). 
