# **Object Oriented Programming in Java**
[Source](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/ "Visit Geek for geeks!")

Object Oriented Programming aims to implement real world entities 
like Inheritance, Polymorphism, Encapsulation in programming. 

The main aim is to bind together the data and the functions 
so that other parts of the code cannot access them.  

>### **OOPs Concepts**
+ [Polymorphism](#polymorphism)
    + [Overloading](#overloading)
    + [Overriding](#overriding)
+ [Encapsulation](#encapsulation)
+ [Abstraction](#abstraction)
    + [Interface](#interfaces)
    + [Abstract Classes](#abstract-classes)
+ [Inheritance](#inheritance)
    + [Single Inheritance](#single-inheritance)
    + [Multilevel Inheritance](#multilevel-inheritance)
    + [Hierarchical Inheritance](#hierarchical-inheritance)
    + [Multiple Inheritance](#multiple-inheritance)
    + [Hybrid Inheritance](#hybrid-inheritance)
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
1. [Overloading](#overloading) 
1. [Overriding](#overriding) 

## **Overloading** 

([source](https://www.geeksforgeeks.org/overloading-in-java/))

Overloading allows methods to have same name but different signatures
where the signature can differ by methods having different types of input
parameters or different number of input parameters.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overloading/Sum.java)

>### **Types of Overloading**
+ [Changing type of parameters](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overloading/TypeChange.java)
+ [Changing number of parameters](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overloading/NumberChange.java)
+ [Changing order of parameters](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overloading/OrderChange.java)

**What if the prototype does not match with arguments?**

Priority wise, compiler take these steps:
1. Type Conversion but to higher type (in terms of range) in same family.
1. Type conversion to next higher family (suppose if there 
is no long data type available for an int data type, 
then it will search for float data type).

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overloading/Display.java)

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
<br></br>

## **Overriding** 

In Object oriented programming, overriding is a feature that 
allows a subclass or a child class to provide a specific 
implementation of a method which already provided by its parent
class or super class.

The method in the subclass is said to **Override** the method in 
the superclass

The version of a method that is executed will be determined 
by the object that is used to invoke it. 

If an object of a parent class is used to invoke the method, 
then the version in the parent class will be executed, 
but if an object of the subclass is used to invoke the method, 
then the version in the child class will be executed.

In other words, it is the type of the object being referred 
to (not the type of the reference variable) that determines 
which version of an overridden method will be executed.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/Example1.java)

>### **Rules for Overriding**
1. [Overriding and access modifiers.](#overriding-and-access-modifiers)
1. [Final methods cannot be overridden.](#final-methods-cannot-be-overridden)
1. [Static methods cannot be overridden.](#static-methods-cannot-be-overridden)
1. [Private methods cannot be overridden.](#private-methods-cannot-be-overridden)
1. [The overriding method must return the same subtype.](#overriding-method-must-return-the-same-subtype)
1. [Invoking overridden methods from subclass.](#invoking-overridden-methods-from-subclass)
1. [Overriding and constructor.](#overriding-and-constructor)
1. [Overriding and Exception-Handling.](#overriding-and-exception-handling)
    1. [Rule 1.](#1-rule-1)
    1. [Rule 2.](#2-rule-2)
1. [Overriding and abstract method.](#overriding-and-abstract-method)
1. [Overriding and synchronized/strictfp method.](#overriding-and-synchronizedstrictfp-method) 

[Multi-Level method overriding](#multi-level-method-overriding)
<br><br/>
[Employee manager example](#employee-manager-example)

### **Overriding and access modifiers** 
The access modifier for an overriding method can allow more access than
its overridden method but not less access.

For example: A method with Protected instance can be provided with a 
public access modifier but not private

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/Access.java) 

### **Final methods cannot be overridden** 
If we do not want a method to be overridden, we declare it as a final.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/FinalNotOverridden.java)

### **Static methods cannot be overridden**
Static methods of the base class cannot be overridden by the child class.

So when we define a static method with the same signature as in the 
base class it is called **Method hiding**.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/StaticNotOverridden.java)

### **Private methods cannot be overridden**
Private methods cannot be overridden as they are bonded during compile 
time. We get the compiler error that the "fun() has private access in Base."

An inner class can access private members of its outer class. fun() 
of Inner accesses private data member msg which is fine by the compiler.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/OuterPrivateOverriddenInner.java)

### **Overriding method must return the same subtype**
From Java 5.0 onwards it is possible to have different return type for a 
overriding method in child class, but child’s return type should be 
sub-type of parent’s return type.

This phenomena is known as **covariant return type.**

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/OverridingMethodSubtype.java)

### **Invoking overridden methods from subclass**
We can call parent class method in overriding method using super keyword. 

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/Super.java)

### **Overriding and constructor**
We can not override constructor as parent and child class can never 
have constructor with same name(Constructor name must always be same 
as Class name).

### **Overriding and Exception-Handling.**
Below are two rules to note when overriding methods related to exception-handling. 
 
#### **1. Rule 1**
If the super-class overridden method does not throws an exception, 
subclass overriding method can only throws the unchecked exception, 
throwing checked exception will lead to compile-time error. 

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/Rule1Exception.java)

#### **2. Rule 2**
If the super-class overridden method does throws an exception, 
subclass overriding method can only throw same, subclass exception. 
Throwing parent exception in Exception hierarchy will lead to compile 
time error.Also there is no issue if subclass overridden method is not 
throwing any exception. 

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/Rule2Exception.java)

### **Overriding and abstract method.**
Abstract methods in an interface or abstract class are meant to be 
overridden in derived concrete classes otherwise a compile-time error 
will be thrown. 

### **Overriding and synchronized/strictfp method**
The presence of synchronized/strictfp modifier with method have no 
effect on the rules of overriding, i.e. it’s possible that a 
synchronized/strictfp method can override a non synchronized/strictfp 
one and vice-versa.

### **Multi-Level method overriding**
We can have multi-level method overriding

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/MultiLevelOverride.java)

### **Employee manager example**

![Picture](https://media.geeksforgeeks.org/wp-content/cdn-uploads/JavaOVerriding.jpg)

Consider an employee management software for an organization, 
let the code has a simple base class Employee, the class has methods 
like raiseSalary(), transfer(), promote(), .. etc. Different types of 
employees like Manager, Engineer, ..etc may have their implementations 
of the methods present in base class Employee. In our complete software, 
we just need to pass a list of employees everywhere and call 
appropriate methods without even knowing the type of employee.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/polymorphism/overriding/EmployeeExample.java)

# **Encapsulation**

It binds together data and code it manipulates. It is a protective shield 
that prevents the data from being accessed outside the class scope.

1. The variables of a class are hidden from other classes and can be
accessed by member functions of the class in which they are declared.
1. The data of the class are hidden so it is also called **Data-Hiding**
1. Encapsulation can be achieved by declaring all the variables private and 
creating public setter and getter methods.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/encapsulation/EncapsulationExample.java)

> ### **Advantages**

+ **Data Hiding:** The user will have no idea about the inner implementation 
of the class. It will not be visible to the user that how the class 
is storing values in the variables. 
+ **Increased Flexibility:** We can make the variables of the class 
as read-only or write-only depending on our requirement. If we wish to 
make the variables as read-only then we have to omit the setter methods 
like setName(), setAge() etc. from the above program 
+ **Re-usability:** Encapsulation also improves the re-usability and 
easy to change with new requirements.
+ **Testing code is easy:** Encapsulated code is easy to test for unit 
testing.

# **Abstraction**
Data Abstraction is the property by virtue of which only the essential 
details are displayed to the user.The trivial or the non-essentials 
units are not displayed to the user. Ex: A car is viewed as a car 
rather than its individual components.

In java, abstraction is achieved by 
+ [Interfaces](#interfaces) 
+ [Abstract Classes](#abstract-classes) 

Some important topics in abstraction
+ [Encapsulation vs Data Abstraction](#encapsulation-vs-data-abstraction)
+ [Advantages of Abstraction](#advantages-of-abstraction)
+ [Abstract class vs Interface](#abstract-class-vs-interface)

We can achieve 100% abstraction using interfaces.

## **Interfaces** 

Interfaces have methods and variables like classes, but the methods
declared in the interface are abstract by default. (only method 
signatures not body).

+ It is the blueprint of the class
+ It specifies the set of methods a class has to implement.
+ A class should implement all the methods in the interface.
+ If a class implements an interface and it does not provide all the 
methods of the interface then the class must be declared abstract.
+ Interface cannot be instantiated, but we can make reference of it 
that refers to the Object of its implementing class.
+ A class can implement more than one interface.
+ An interface can extend another interface.
+ All the methods are public and abstract in an interface.
+ All the fields are public, static and final in an interface.
+ Its used to achieve multiple inheritance.
+ Its used to achieve loose coupling.

_A comparator interface is implemented by Collection which helps to
sort the collection_

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/abstraction/interfaces/InterfaceExample.java)

## **Abstract Classes** 

A class containing its methods but not its declaration is supposed to be
an abstract class with an abstract function. An abstract may contain both
abstract and normal methods.

+ It is declared with abstract keyword.
+ An abstract method is a method that is declared without an 
implementation.
+ It may or may not have all abstract methods. Some of them 
can be concrete methods
+ A method defined abstract must always be redefined in the subclass,
thus making overriding compulsory OR either make subclass 
itself abstract.
+ Any class that contains one or more abstract methods must also be 
declared with abstract keyword.
+ There can be no object of an abstract class. That is, 
an abstract class can not be directly instantiated with the new operator.
+ An abstract class can have parametrized constructors and 
default constructor is always present in an abstract class 

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/abstraction/abstractclasses/AbstractClassExample.java)

### **Encapsulation vs Data Abstraction**

+ Encapsulation is data hiding(information hiding) 
while Abstraction is detail hiding(implementation hiding).
+ While encapsulation groups together data and methods 
that act upon the data, data abstraction deals with exposing 
the interface to the user and hiding the details of implementation.

### **Advantages of Abstraction**
+ It reduces the complexity of viewing the things.
+ Avoids code duplication and increases re-usability.
+ Helps to increase security of an application or program as only 
important details are provided to the user.

### **Abstract class vs Interface**
+ **Type of methods:** Interface can have only abstract methods. 
Abstract class can have abstract and non-abstract methods. 
+ **Final Variables:** Variables declared in a Java interface are by
default final. An abstract class may contain non-final variables.
+ **Type of variables:** Abstract class can have final, non-final, 
static and non-static variables. Interface has only static and final 
variables.
+ **Implementation:** Abstract class can provide the implementation 
of interface. Interface can’t provide the implementation of abstract class.
+ **Inheritance vs Abstraction:** A Java interface can be implemented 
using keyword “implements” and abstract class can be extended using 
keyword “extends”.
+ **Multiple implementation:** An interface can extend another 
Java interface only, an abstract class can extend another Java class 
and implement multiple Java interfaces.
+ **Accessibility of Data Members:** Members of a Java interface are 
public by default. A Java abstract class can have class members like 
private, protected, etc.

# **Inheritance**
Its the mechanism in java by which one class is allowed to inherit 
the properties of another class

+ **Super Class:** The class whose features are inherited are known
as super class, parent class or base class.
+ **Sub Class:** The class which inherits the other class is called the
sub class or derived class or extended class. The subclass can add its 
own methods and variables in addition to the inherited features of its 
parent class.
+ **Re-usability:** One class can reuse the methods and variables of its 
parent class without writing redundant code. 

_We use the keyword **extends** for inheritance_

In practise inheritance and polymorphism are used for fast performance and 
readability of code.

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/inheritance/InheritanceExample.java)

## **Types of Inheritance**
1. [Single Inheritance](#single-inheritance)
1. [Multilevel Inheritance](#multilevel-inheritance)
1. [Hierarchical Inheritance](#hierarchical-inheritance)
1. [Multiple Inheritance](#multiple-inheritance)
1. [Hybrid Inheritance](#hybrid-inheritance)

### **Single Inheritance**
In single inheritance the subclass inherits the feature of one
superclass. Class A serves as a base class for class B

![image](https://media.geeksforgeeks.org/wp-content/uploads/inheritance1.png)

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/inheritance/singleInheritance/SingleInheritance.java)

### **Multilevel Inheritance**
In multilevel inheritance a derived class will be inheriting a base class as well
as acting as the base class to another class. 
Class A serves as a base class for B which in turn serves as a base class for C

![image](https://media.geeksforgeeks.org/wp-content/uploads/inheritance3.png)

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/inheritance/multilevelInheritance/MultilevelInheritance.java)

### **Hierarchical Inheritance**
In Hierarchical Inheritance, one class serves as a superclass (base class) 
for more than one sub class. The class A serves as a base class 
for the derived class B,C and D.

![image](https://media.geeksforgeeks.org/wp-content/uploads/inheritance4.png)

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/inheritance/hierarchicalInheritance/HierarchicalInheritance.java)

### **Multiple Inheritance**
In multiple inheritance, one class is derived from more than one superclass
and inherit features from all superclasses. Java does not support multiple 
inheritance. We achieve multiple inheritance through interfaces.

![image](https://media.geeksforgeeks.org/wp-content/uploads/inheritance2-1.png)

[Example](https://github.com/debajyotibasak/StudyingOOPs/blob/master/src/com/debo/java/oops/inheritance/multipleInheritance/MultipleInheritance.java)

### **Hybrid Inheritance**
It is a mix of hierarchical and multiple inheritance. It cannot be achieved with 
classes. It can only be achieved in java through inheritance.

![image](https://media.geeksforgeeks.org/wp-content/uploads/inheritance-1.png)

### **Important facts about inheritance in Java**

+ **Default superclass:** Except Object class, which has no superclass, 
every class has one and only one direct superclass (single inheritance). 
In the absence of any other explicit superclass, every class is implicitly 
a subclass of Object class.
+ **Superclass can only be one:** A superclass can have any number of subclasses. 
But a subclass can have only one superclass. This is because Java does not 
support multiple inheritance with classes. Although with interfaces, multiple 
inheritance is supported by java.
+ **Inheriting Constructors:** A subclass inherits all the members (fields, 
methods, and nested classes) from its superclass. Constructors are not members, 
so they are not inherited by subclasses, but the constructor of the superclass 
can be invoked from the subclass.
+ **Private member inheritance:** A subclass does not inherit the private 
members of its parent class. However, if the superclass has public or protected 
methods(like getters and setters) for accessing its private fields, these can 
also be used by the subclass.

### **What all can be done in a Subclass?**

In sub-classes we can inherit members as is, replace them, hide them, or supplement them with new members:

+ The inherited fields can be used directly, just like any other fields.
+ We can declare new fields in the subclass that are not in the superclass.
+ The inherited methods can be used directly as they are.
+ We can write a new instance method in the subclass that has the same 
signature as the one in the superclass, thus overriding it (as in example above, 
toString() method is overridden).
+ We can write a new static method in the subclass that has the same signature 
as the one in the superclass, thus hiding it.
+ We can declare new methods in the subclass that are not in the superclass.
+ We can write a subclass constructor that invokes the constructor of the 
superclass, either implicitly or by using the keyword super.
 
