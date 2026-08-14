# Java Interview Prep #1a: OOP Basics — Paradigms, Class, Object, Method

## What Is a Programming Paradigm?

It is a way or style of programming based on certain principles and techniques which defines how code is written, structured and execute. There are some main programming paradigms:

- **Procedural**: step by step execution using functions and procedures. Ex: C, Pascal
- **OOP (Object Oriented Programming)**: It uses objects and classes to structure code for reusability. Ex: Java, C++, Python
- **Functional**: It's focuses on pure functions, immutability and avoiding state changes. Ex: JavaScript
- **Declarative**: It describes what to do rather than how to do it. Ex: HTML, SQL

---

## What Is OOP?

- OOP stands for **Object-Oriented Programming**
- In Java it is a programming paradigm or approach that organizes code using objects and classes to improve reusability, modularity and maintainability.
- There are 6 main pillars of OOP i.e. Class, Object, Inheritance, Polymorphism, Abstraction, Encapsulation.

---

## Is Java a 100% OOP Language?

Java is a strongly OOP language but not purely OOP because it has primitive data types and static concepts which are not related to Objects. Ex: Ruby or Scala are purely OOP languages.

---

## What Is a Class?

Class is a blueprint or prototype or template for creating objects in Java. It is not a real-world entity, meaning it does not exist physically or occupy space or memory. For example, `Animal` is a class — here `Animal` is not a real world entity, it does not occupy memory.

**In simple words:** Think of a class like a house *plan* on paper (drawn by an architect). The plan itself is not a house — you can't live in it. It just describes what the house will look like.

**Syntax:**
```java
access-modifiers class ClassName {
    Fields (Instance variables) - store object data
    Constructors - Initialize objects
    Methods - Define Object behavior
    Nested Classes - Class inside another class
    Blocks - static and instance blocks for initialization
}
```

**Example:**
```java
public class Animal {
    int eyes;
    String color;
    void eat() { //body }
}
```

---

## If a Class Doesn't Occupy Space, Then Where Are Its Variables and Methods Stored?

Class metadata such as variables, variable names, method names, constructors is stored in the **Method Area**.

---

## What Is a Method in Java?

It is a block of code that performs a specific task and can be reused multiple times. In the method block we can write computations, data processing, input output operations, object manipulations, conditional logic statements etc.

**Syntax:**
```java
access-modifiers return-type methodName(List of Parameters) { //body }
```

**Example:**
```java
public void eat(String name) {
    System.out.println(name + " is eating");
}
```

---

## What Is an Object in Java?

Object is an instance of a class and it is a real-world entity which occupies space or memory. For example, `Animal` is a class and `Dog`, `Cat`, `Tiger` are objects which occupy space. We can access the methods and variables using these objects for that particular class.

**In simple words:** If the class is the house *plan*, the object is the actual *house built* from that plan. You can build many houses (objects) from one plan (class), and each house is real and takes up space.

**Syntax:**
```java
ClassName objectName = new ClassName();
objectName.methodName();
objectName.variableName;
```

**Example:**
```java
// Define a class named Animal
class Animal 
{
    // Method to display a running message which is common for all animal
    void run() 
    {
        System.out.println("I'm running");
    }
}

// Define a class named Birds
class Bird
{
    // Method to display a flying message
    void fly() 
    {
        System.out.println("I'm flying");
    }
}

// Define the main class
public class Main
{
    // Main method - program entry point
    public static void main(String[] args) 
    {
        // Create an object 'buzo' of Animal and call the run method
        Animal buzo = new Animal();
        buzo.run();

        // Create an object 'sparrow' of Birds and call the fly method
        Birds sparrow = new Birds();
        sparrow.fly();
    }
}
```

**Output:**
```
I'm running
I'm flying
```

---


---

## Follow-up Interview Questions for This Topic

### "Can you override a constructor the same way you override a method?"

No — and this trips people up. Constructors aren't inherited by the child class at all, so there's nothing to "override." What you *can* do is call the parent's constructor from inside the child's constructor using `super()`.

### "Why is the main method declared static in Java?"

So the JVM can call it directly using the class name — `ClassName.main()` — without needing to create an object first. If `main` weren't static, the JVM would need an object to invoke it on, but you need `main` to run *before* any object in your program exists. Making it static avoids that chicken-and-egg problem.
