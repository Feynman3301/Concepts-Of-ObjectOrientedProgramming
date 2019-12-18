# Concepts-Of-ObjectOrientedProgramming
## *Polymorphism*

Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.The word ‘polymorphism’ literally means ‘the capacity to take on different forms’. When applied to Java, it describes the language’s ability to process objects of various types and classes through a single, uniform interface.
Polymorphism in Java has two types: Compile time polymorphism (static binding) and Runtime polymorphism (dynamic binding). Method overloading is an example of static polymorphism, while method overriding is an example of dynamic polymorphism.
An important example of polymorphism is how a parent class refers to a child class object.
Static polymorphism in Java is achieved by method overloading.
Dynamic polymorphism in Java is achieved by method overriding

### DISADVANTAGES

     It can lead to the performance issue as machine needs to decide which method or variable to invoke so it basically degrades the performances as decisions are taken at run time.

### ADVANTAGES

     It helps reuse the code and classes once written, tested and implemented. They can be reused in many ways. Single variable name can be used to store variables of multiple data types(Float, double, Long, Int etc).

## *EnCAPsulation*

Encapsulation simply means binding object state(fields) and behaviour(methods) together.Creation of class is encapsulation. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class.Same goes for other keywords like protected and public.

### DISADVANTAGES

     It increases the length of the code and slow shutdown execution.  

### ADVANTAGES
            
     It can provide the programmer to hide the inner classes and the user to give access only to the desired codes. It allows the programmer to not allow the user to know how variables and data store.

## *Inheritance*

Inheritance is the ability of one class(subclass) to deive the properties of others(superclass).It is mainly of three types namely:Single Inheritance ,Multiple inheritance and Heirchial Inheritance.
Java supports multiple inheritance through interfaces only. A class can implement any number of interfaces but can extend only one class.

### DISADVANTAGES

      The main disadvantage of the inheritance is that the two classes(base class and super class) are tightly coupled that is the classes are dependent on each other. If the functionality of the base class is changed then the changes have to be done on the child classes also.




### ADVANTAGES

     One of the key benefits of inheritance is to minimize the amount of duplicate code in an application by sharing common code amongst several subclasses.
    Inheritance can also make application code more flexible to change because classes that inherit from a common superclass can be used interchangeably.

Thus, OOP improves *maintainability ,flexibility and re-usability.*
