Project 4: Implementing Patterns 2
By: Jacob Narowski
UML : https://drive.google.com/file/d/1C7srtfj83QNOTbvJQTP7Lsoc5OapLgAy/view?usp=sharing

To run:
javaw Main.java
java Main

My Project is split into two parts (One in each file: Visitor and Builder)

Both folders have their own run Main.java file which can be used to run the code.
Each folder also has its own readme which goes into detail about each demo implementation.

As an over view:

Visitor is an employee management system
In main, employees of different types are created and then can be visited by other methods that do different things,
In my demo the employees can be Trained or Paid
Visitor pattern is good for this helping the code satisfy single responsibility principle by separating the functions

Composite is designed to track the time it takes an operation to occur.
Each step has its own time that it takes to occur.
Composites are a way to combine different steps and group them together in a logical manner.
In my demo I launch a space ship. You can see me set up each step in three different stages.
Each stage is its own composite.
And every stage is combined together into one overall composite.
