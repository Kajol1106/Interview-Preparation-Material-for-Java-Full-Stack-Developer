# Java Interview Prep #1b: Inheritance

## What Is Inheritance?

- Inheritance means acquiring the properties and behaviors of a parent class in a child class. It promotes code reuse and method overriding. It is an **is-A relationship**, also known as parent-child relationship. For ex: Dog is a Animal
- By using the `extends` keyword for class inheritance and `implements` keyword for interface inheritance we can achieve this.

**In simple words:** Think of a father-son relationship. A son naturally gets some things from his father (surname, some habits) without doing anything extra, and he can also have his own new things. Same way, a child class gets the parent class's code for free, and can add its own on top.

**Example for Class (using `extends` keyword):**
```java
class Vehicle
{
    void start()
    {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Car drives.");
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        Car myCar = new Car();

        myCar.start(); // inherited from Vehicle
        myCar.drive(); // specific to Car
    }
}
```

**Example for Interface (using `implements` keyword):**
```java
interface Animal
{
    void eat();
}
class Dog implements Animal
{
    public void eat()
    {
        System.out.println("Dog eats.");
    }
}
public class MainApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.eat(); // inherited from Animal

        //Animal myAnimal = new Animal();   // error because we cannot create an object of an interface
    }
}
```

### What Are the Advantages and Disadvantages of Inheritance?

**Advantages:**
1. We can reuse the code, for ex., using parent class data in child class
2. If we do any changes in parent class it will automatically get changed in child class also, so it's easy for maintenance.
3. It enables method overriding which allows a child class to provide a specific implementation of a method which is already defined in its parent class
4. It supports runtime polymorphism using method overriding

**Disadvantages:**
1. It creates a tight coupling between parent and child classes; if we change the parent class it may affect all child classes.
2. It increases complexity which leads to complex class hierarchies making the code harder to understand and maintain

### What Are the Types of Inheritance?

There are 5 types of inheritance in Java:
1. **Single Inheritance**: one class inherits the properties and behaviors of one parent class.
2. **Multilevel Inheritance**: one class inherits the properties and behaviors of a parent class and that class is inherited by another class.
3. **Hierarchical Inheritance**: Multiple classes inherit the properties and behaviors of a single parent class.
4. **Multiple Inheritance**: One class inherits the properties and behaviors of multiple classes. (Not supported in Java directly, but can be achieved using interfaces.)
5. **Hybrid Inheritance**: A combination of two or more types of inheritance. (Not supported in Java directly, but can be achieved using interfaces.)

### What Are Some Important Points to Remember About Inheritance in Java?

1. Inheritance should be used carefully. It is not always the best solution for code reuse. In some cases, composition (using objects of other classes) may be a better approach.
2. Java does not support multiple and hybrid inheritance with classes to avoid ambiguity, such as the diamond problem.
3. A class can extend only one class, which is known as single inheritance. Constructors and private members of the parent class are not inherited by the child class.
4. A class can implement multiple interfaces, which is Java's way of achieving multiple inheritance.
5. The `super` keyword is used to refer to the parent class, such as accessing parent class methods or constructors.
6. The `this` keyword is used to refer to the current class instance, commonly used to differentiate between instance variables and parameters.

---


---

## Follow-up Interview Questions for This Topic

### "Why doesn't Java allow a class to extend two classes at once?"

To avoid what's called the **Diamond Problem**. Imagine class B and class C both extend class A, and both override the same method differently. Now if class D extends both B and C, the compiler has no way to know which version of that method D should inherit — B's or C's. Java sidesteps this entire ambiguity by only allowing a class to `extends` one other class. If you genuinely need behavior from multiple sources, Java lets you do it safely through **interfaces** using `implements` — and even with Java 8's default methods, if two interfaces provide the same default method, Java forces you to explicitly resolve the conflict yourself rather than guessing.

### "What's the difference between `this` and `super`? When would you use each?"

- **`this`** refers to the current class's own instance. You use it to access the current class's fields/methods (especially when a parameter name shadows a field name), or to call another constructor in the same class.
- **`super`** refers to the immediate parent class's instance. You use it to access a parent class's fields/methods, or to explicitly call the parent class's constructor.

Example: `this.name = name;` sets the current object's field. `super();` calls the parent's constructor.
