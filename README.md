# OOPs Concepts in Java with Examples:

**Class Example:** class Car { String color; void accelerate() { ... } }

**Object Example:** Car myCar = new Car();

**Inheritance Example:** class ElectricCar extends Car { ... }

**Polymorphism Example:** Method overloading and overriding.

**Abstraction Example:** Abstract classes and interfaces.

**Encapsulation Example:** Private fields with public getters and setters.

 `Application`
'Advanced OOP Concepts`

# What is Abstraction?

Abstraction is a process which displays only the information needed and hides the unnecessary information. We can say that the main purpose of abstraction is data hiding. Abstraction means selecting data from a large number of data to show the information needed, which helps in reducing programming complexity and efforts.  

There are also abstract classes and abstract methods. An abstract class is a type of class that declares one or more abstract methods. An abstract method is a method that has a method definition but not implementation. Once we have modelled our object using data abstraction, the same sets of data can also be used in different applications—abstract classes, generic types of behaviours and object-oriented programming hierarchy. Abstract methods are used when two or more subclasses do the same task in different ways and through different implementations. An abstract class can have both methods, i.e., abstract methods and regular methods.

Now let us see an example related to abstraction.

Suppose we want to create a student application and ask to collect information about the student.

We collect the following information.  

Name 
Class
Address
Dob
Fathers name
Mothers’ names and so on. 
We may not require every information that we have collected to fill out the application. So, we select the data that is required to fill out the application. Hence, we have fetched, removed, and selected the data, the student information from large data. This process is known as abstraction in the oops concept.
