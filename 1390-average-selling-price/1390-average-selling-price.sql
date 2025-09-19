# Write your MySQL query statement below
select 
p.product_id ,
case 
when sum(u.units*p.price) is null then 0
else round(sum(u.units * p.price) / sum(u.units),2) 
end as average_price
from Prices as p 
left join UnitsSold as u 
on p.product_id = u.product_id and u.purchase_date >= p.start_date and u.purchase_date <= p.end_date
group by p.product_id
;