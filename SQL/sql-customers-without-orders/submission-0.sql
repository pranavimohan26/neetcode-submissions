-- Write your query below
select name 
from customers 
Left Join orders 
on customers.id = orders.customer_id 
where orders.customer_id IS NULL;