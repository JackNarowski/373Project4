Visitor Readme

This code is a basic implementation of the visitor pattern.

Visitor is an employee management system
In main, employees of different types are created and then can be visited by other methods that do different things,
In my demo the employees can be Trained or Paid
You can create as many of each different employee type and then run the designated functions on them.
Visitor pattern is good for this helping the code satisfy single responsibility principle by separating the functions

Main is the client
Employee is the main Element
PartTime and FullTime are Concrete Elements
Visitor is the Visitor
Pay and Train are Concrete Visitors