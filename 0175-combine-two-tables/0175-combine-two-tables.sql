# Write your MySQL query statement below
SELECT p.firstName ,p.lastName, s.city, s.state
FROM Person p
left join Address s
on p.personId=s.personId;