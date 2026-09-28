# Write your MySQL query statement below
SELECT project_id, ROUND(AVG(e.experience_years),2) as average_years
FROM employee e JOIN project p ON e.employee_id = p.employee_id
GROUP BY project_id;

