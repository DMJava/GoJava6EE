SELECT * FROM homework_db.customers;
#5. Найти клиента (customer), которая приносит меньше всего прибыли компании (company) для каждой из компаний .
select customers.customer_id, customers.customer_name, sum(projects.cost) MINIM
from customers_has_projects inner join projects on 
customers_has_projects.projects_project_id = projects.project_id inner join customers on customers_has_projects.customers_customer_id = 
customers.customer_id group by customers.customer_id order by MINIM asc limit 1;