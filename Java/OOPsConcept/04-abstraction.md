# Java Interview Prep #1d: Abstraction

## What Is Abstraction in Java?

Abstraction is hiding internal implementation details and showing only the essential features to the user. For ex., in real world: when you drive a car, you only need to know how to operate the steering wheel, pedals and gear shift. You don't need to understand how the engine works or how the brakes are designed.

**In simple words:** Show *what* something does, hide *how* it does it. Like an ATM — you press buttons to withdraw money, but you never see the internal wiring or bank logic that actually moves the money.

### How Can We Achieve Abstraction?

We can achieve abstraction in two ways: using Abstract Classes and using Interfaces.

### What Is an Abstract Class?

It is a class that is declared using the `abstract` keyword, and it can contain a mix of abstract methods (without a body) and concrete methods (with a body). You cannot create objects of an abstract class. Subclasses must override all abstract methods or be declared abstract themselves. An abstract class can have constructors, static and final methods, and it can extend another class and implement interfaces.

**Syntax:**
```java
abstract class ClassName
{
    // abstract method
    abstract void makeSound();

    // concrete method
    void sleep()
    {
        System.out.println("Sleeping...");
    }
}
```

**Example:**
```java
abstract class Car
{
    // Abstract method (must be implemented by subclasses)
    abstract void startEngine();

    // Concrete method
    void fuelType()
    {
        System.out.println("This car uses petrol or diesel.");
    }
}
class Sedan extends Car
{
    @Override
    void startEngine()
    {
        System.out.println("Sedan engine started with key ignition.");
    }
}
```

### What Is an Abstract Method?

- An abstract method is a method that is declared without an implementation, with no method body. It only provides the method signature and forces subclasses to provide the actual implementation. It's declared using the `abstract` keyword.
- It must be declared inside an abstract class or interface. It must be overridden by subclasses, unless the subclass is also abstract.
- Cannot be private, static or final — because it must be overridden.

**Syntax:**
```java
abstract returnType methodName(parameters);
```
Ex: `abstract void makeSound();`

### What Are the Disadvantages of Not Using Abstraction?

1. **No polymorphism**: Can't use a common parent reference to refer to multiple types
2. **Code duplication**: common logic is repeated in every class
3. **No method enforcement**: There is no guarantee that all vehicle-related classes will implement essential methods. A developer might forget to add a critical method in a new class which is important
4. **Poor scalability**: maintaining consistency becomes harder, and any change in shared logic needs to be updated in every individual class, increasing maintenance overhead.
5. There is no standard structure — this leads to inconsistent design and makes collaboration or team development harder

### What Does a Program Look Like Without Abstraction?

```java
class Car
{
    int no_of_tyres = 4;

    void displayTyres()
    {
        System.out.println("Car has " + no_of_tyres + " tyres.");
    }

    void start()
    {
        System.out.println("Car starts with a key ignition.");
    }
}

// Scooter class without abstraction
class Scooter
{
    int no_of_tyres = 2;

    void displayTyres()
    {
        System.out.println("Scooter has " + no_of_tyres + " tyres.");
    }

    void start()
    {
        System.out.println("Scooter starts with a kick or self-start.");
    }
}

// Main class to run the program
public class MainApp
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.displayTyres();
        myCar.start();

        System.out.println();

        Scooter myScooter = new Scooter();
        myScooter.displayTyres();
        myScooter.start();
    }
}
```

**Output:**
```
Car has 4 tyres.
Car starts with a key ignition.

Scooter has 2 tyres.
Scooter starts with a kick or self-start.
```

### What Does the Same Program Look Like Using Abstraction?

```java
// Abstract class used to remove code duplication and enforce method structure
abstract class Vehicle
{
    int no_of_tyres;

    // Common method to avoid duplication (removes disadvantage #2)
    void displayTyres()
    {
        System.out.println("This vehicle has " + no_of_tyres + " tyres.");
    }

    // Abstract method to enforce implementation in all subclasses (removes disadvantage #3)
    abstract void start();
}

// Car class extends abstract class and provides its own implementation
class Car extends Vehicle
{
    Car()
    {
        no_of_tyres = 4;
    }

    // Required by abstract class - enforces structure (removes disadvantage #3)
    @Override
    void start()
    {
        System.out.println("Car starts with key ignition.");
    }
}

// Scooter class also extends abstract class
class Scooter extends Vehicle
{
    Scooter()
    {
        no_of_tyres = 2;
    }

    @Override
    void start()
    {
        System.out.println("Scooter starts with kick or self-start.");
    }
}

// Main class to test polymorphism and abstraction
public class Main
{
    public static void main(String[] args)
    {
        // Using polymorphism (removes disadvantage #1)
        Vehicle myVehicle1 = new Car();
        myVehicle1.displayTyres();
        myVehicle1.start();

        System.out.println();

        Vehicle myVehicle2 = new Scooter();
        myVehicle2.displayTyres();
        myVehicle2.start();

        // Easier to scale and add new vehicle types consistently (removes disadvantage #4)
    }
}
```

**Output:**
```
This vehicle has 4 tyres.
Car starts with key ignition.

This vehicle has 2 tyres.
Scooter starts with kick or self-start.
```

---


---

## Follow-up Interview Questions for This Topic

### "When would you use an abstract class over an interface, and vice versa?"

Think about what the two things actually are:
- An **abstract class** can hold both abstract methods *and* fully implemented (concrete) methods, can have instance variables of any type, can have constructors, and a class can extend only one abstract class.
- An **interface** was traditionally just a contract of method signatures with no body (Java 8+ allows `default`/`static` methods too), can only hold `public static final` constants as fields, cannot have constructors, and a class can implement *multiple* interfaces.

Use an abstract class when a group of related classes share common code or state and you want to give them a head start. Use an interface when unrelated classes just need to promise the same behavior — a pure "contract" — without inheriting any implementation baggage.

**In simple words:** Abstract class is for "is-a" relationships with some shared code. Interface is for "can-do" relationships — a pure contract/promise with no shared implementation baggage.

### "Can an interface have a constructor? Why or why not?"

No. Interfaces cannot be instantiated on their own — you never write `new SomeInterface()` — and they have no instance state to initialize (only constants), so a constructor would have no purpose.

### "What's a marker interface? Can you name one?"

An interface with **no methods or fields at all** — its only job is to "tag" a class so the JVM or a framework treats it specially at runtime. Classic examples are `Serializable` and `Cloneable`. A class implementing `Serializable` doesn't have to implement any new method — implementing it is just a signal to the JVM: "this class is allowed to be converted into a byte stream."
