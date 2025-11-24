# Write your MySQL query statement below
WITH cte AS (
    SELECT num,
    lead(num,1) OVER() num1,
    lead(num,2) OVER() num2
    FROM Logs
)

SELECT DISTINCT num AS ConsecutiveNums
FROM cte
WHERE (num=num1)
    AND (num=num2)