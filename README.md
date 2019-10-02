# **Object Oriented Programming in Java**
[Source](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/ "Visit Geek for geeks!")

Object Oriented Programming aims to implement real world entities 
like Inheritance, Polymorphism, Encapsulation in programming. 

The main aim is to bind together the data and the functions 
so that other parts of the code cannot access them.  

>### **OOPs Concepts**
+ [Polymorphism](#polymorphism)
    + [Overloading](#overloading)
+ Inheritance
+ Encapsulation
+ Abstraction
+ Class
+ Object
+ Method
+ Message Passing

# **Polymorphism**

The word polymorphism means having many forms. In simple words, 
we can define polymorphism as the ability of a message to be 
displayed in more than one form.
 
**Real Life Example:** A Person at the same time can have different 
characteristics. A man can be a father, a brother, a son, a friend 
in different situations.

Polymorphism is the ability of OOPs programming languages to differentiate
between entities of the same name. Its done in Java with the help of 
signature and declaration of the entities 

Polymorphism is of 2 types:  
1. Overloading 
1. Overriding 

## **Overloading** 

([source](https://www.geeksforgeeks.org/overloading-in-java/))

Overloading allows methods to have same name but different signatures
where the signature can differ by methods having different types of input
parameters or different number of input parameters.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/Sum.java)

>####**Types of Overloading**
+ Changing type of parameters
+ Changing number of parameters
+ Changing order of parameters

<br></br>

**What if the prototype does not match with arguments?**

Priority wise, compiler take these steps:
1. Type Conversion but to higher type (in terms of range) in same family.
1. Type conversion to next higher family (suppose if there 
is no long data type available for an int data type, 
then it will search for float data type).

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/Display.java)

**Advantage**

We don't have to create redundant method names for similar kind of tasks.

**Can we overload static methods?**

Yes. We can have two ore more static methods with same name, 
but differences in input parameters. 

**Can we overload methods that differ only by static keyword?**

We cannot overload two methods in Java if they differ only 
by static keyword. ([Source](https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/))

**Can we overload main() in Java?**

Like other static methods, we can overload main() in Java.

**What is the difference between Overloading and Overriding?**
+ Overloading is about same function have different signatures. 
Overriding is about same function, same signature but different 
classes connected through inheritance.
+ Overloading is an example of compiler time polymorphism and 
overriding is an example of run time polymorphism.

<br></br>
![Overloading vs Overriding](https://media.geeksforgeeks.org/wp-content/uploads/OverridingVsOverloading.png)
<br></br>

[Method overloading and null error in Java](https://www.geeksforgeeks.org/method-overloading-null-error-java/)