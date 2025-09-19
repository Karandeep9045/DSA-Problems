# Write your MySQL query statement below
select stu.student_id, stu.student_name , sub.subject_name,count(exam.student_id) as attended_exams
from Students stu
cross join Subjects sub
left join Examinations as exam
on stu.student_id = exam.student_id and sub.subject_name = exam.subject_name
group by stu.student_id,stu.student_name,sub.subject_name
order by stu.student_id,stu.student_name,sub.subject_name;

