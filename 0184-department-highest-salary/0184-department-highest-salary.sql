# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary FROM Employee e
JOIN Department d ON d.id=e.departmentId WHERE (e.departmentId,e.salary) IN(
    SELECT departmentId,MAX(Salary) FROM Employee GROUP BY departmentId
);