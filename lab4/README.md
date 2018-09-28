# cmpe202

CRC cards : 

(1)  Customer
(2)  Restaurant
(3)  Table

Design pattern

My design includes the state design pattern as it defines two tables states : available and occupied. Based on the current state of the particular table, restaurant will behave accordingly. 

If the state of a table changes from occupied to available than the restaurant immediately fetches the table capacity of that table and then compares it with the number of people in group that is at the top of the waiting queue. If the number of people in the group are less than or equal to the table capacity, that table is assigned to that particular group. Also, that group is removed from the waiting queue.

In my design, ‘table’ plays the role of state and ‘restaurant’ plays the role of context.

