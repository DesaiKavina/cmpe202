# cmpe202

CRC cards : 

(1)  Customer
         - this class represents all customers registered to be served in
           the restaurant
(2)  Restaurant
	   - this class contains the customer objects which acts as 
           concrete handlers
(3)  Manager
	   - this class acts as an observer class which will get notified   	     on the state change of table
(4)  Table
	   - this class acts as a subject which will notify the observer 	     upon a state change

Design patterns

(1) Observer pattern

In my design, observer pattern is implemented as one object has to notify another object when the state changes. Here, the ‘table’ acts as the subject and the ‘manager’ acts as the observer.

Whenever the state of the table changes from occupied to available, it is the task of the table (subject) to send a message to the manager (observer) that the state of the table is now available and a new customer can be allocated to that table. 

After the table is allocated to a customer, again the state of the table becomes occupied.

(2) Chain of Responsibility

In my design, chain of responsibility is implemented where a set of objects (customers) handle a request initiated by the client (manager). Thus all the customer object acts as concrete handlers and the manager class acts as a client. 

If the customer on the top of the queue cannot handle the request (i.e. the condition of number of people in the party less than or equal to available table capacity is not satisfied), it forwards the request to its successor (other customers in the queue). 

When a particular handler (customer) handles a request or is able to satisfy the condition, then a notification message is sent to that customer that they are at the top of the queue and a table is available for them. 

If a customer replies “Confirm”, then that particular table is allocated to that customer and that customer is deleted from the waiting queue. Consequently, if a customer replies “Leave”, that customer is deleted from the queue and the chain of responsibility is run again to find the next appropriate customer fit for the available table size.

