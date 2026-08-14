# Java Interview Prep #1g: Relationships Between Classes

## What Are the Relationships Between Classes in Java?

- It describes how multiple classes interact with or depend on each other.
- These relationships help structure and organize code in a logical and maintainable way.
- Types of relationships between classes in Java:
  1. Association (HAS-A relationship)
  2. Dependency (USES-A relationship)
  3. Inheritance (IS-A relationship)

### What Is Association (HAS-A Relationship)?

It is a relationship where one class interacts with another class by holding a reference to it. It represents a HAS-A relationship in OOP. Ex: Student HAS-A Address.

It is achieved by declaring object references as instance variables inside a class. We can inject dependent objects using:
1. **Direct Reference Variables**: Creating the object directly inside the class
2. **Constructor Injection**: passing the dependent object through the constructor
3. **Setter Injection**: Injecting the dependent object using a public setter method

**In simple words:** Association just means one object "knows about" or "holds" another object. It's how you build real relationships between classes instead of writing everything inside one giant class.

**Association Using Direct Reference Variables — Example:**
```java
class Address
{
    String city = "Delhi";
    String country = "India";

    void displayAddress()
    {
        System.out.println("City: " + city + ", Country: " + country);
    }
}

class Student
{
    String name = "Deepak";
    int rollno = 101;

    // Direct reference to another class
    Address address = new Address();  // Object created directly inside the class

    void displayInfo()
    {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
        address.displayAddress();
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        Student student = new Student();  // No need to pass Address
        student.displayInfo();            // Displays student info along with address
    }
}
```

**Output:**
```
Name: Deepak, Roll No: 101
City: Delhi, Country: India
```

**Association Using Constructor Injection — Example:**
```java
class Engine
{
    void startEngine()
    {
        System.out.println("Engine starts.");
    }
}

class Car
{
    // HAS-A relationship: Car has an Engine
    private Engine engine;

    // Constructor Injection: Engine is provided from outside
    Car(Engine engine)
    {
        this.engine = engine;
    }

    void startCar()
    {
        engine.startEngine();  // Car uses Engine to start
        System.out.println("Car starts.");
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        // create the dependency
        Engine engine = new Engine();
        // inject it into Car
        Car myCar = new Car(engine);
        myCar.startCar();
    }
}
```

**Output:**
```
Engine starts.
Car starts.
```

**Association Using Setter Injection — Example:**
```java
class Processor
{
    void startProcessor()
    {
        System.out.println("Processor starts processing.");
    }
}

class Laptop
{
    // HAS-A relationship: Laptop has a Processor
    private Processor processor;

    // Setter Injection: Injecting dependency through setter method
    public void setProcessor(Processor processor)
    {
        this.processor = processor;
    }

    void startLaptop()
    {
        processor.startProcessor();
        System.out.println("Laptop starts.");
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        // Create the dependency
        Processor processor = new Processor();

        // Create the dependent object
        Laptop myLaptop = new Laptop();

        // Inject the dependency using setter
        myLaptop.setProcessor(processor);

        // Use the dependent object
        myLaptop.startLaptop();
    }
}
```

**Output:**
```
Processor starts processing.
Laptop starts.
```

### What Are the Types of Association?

**1. What Is Aggregation?**

Weak relationship between classes, and objects can exist independently of each other. Example: A Car HAS-A Music Player — the Music Player can be removed, reused, or replaced — it can exist without the car.

**2. What Is Composition?**

Strong relationship between classes, and one object is fully dependent on the other. Example: A Car HAS-A Engine — the Engine is an essential part of the car — if the car is destroyed, the engine has no real standalone meaning.

**In simple words:** Aggregation = weak "has-a" (parts can survive on their own). Composition = strong "has-a" (parts die along with the whole).

- In both Aggregation and Composition, program logic remains the same, but the relationship between the classes is different.

### What Are the Types of Cardinality in Association?

Associations can be:
1. One-to-One
2. One-to-Many
3. Many-to-One
4. Many-to-Many

These are also known as **Cardinality of Associations**. Cardinality is the count or the number of connections.

---

### What Is Dependency (USES-A Relationship)?

Dependency is a relationship where one class uses another class temporarily to perform a specific task. This means the dependent object is often used within a method, rather than being stored as an instance variable. It represents a USES-A relationship. The dependency is typically short-lived, existing only during the execution of a method. Ex: Office Worker USES-A Printer.

It can be achieved by creating or using objects of another class inside a method, instead of holding them as instance variables. We can inject dependent objects using:
1. Dependency using a local variable inside a method — the dependent object is created directly in a method
2. Dependency using a method parameter — the dependent object is passed as a method argument, which promotes more flexibility and testability

**In simple words:** Association is a long-term relationship (the object is *stored* as a field). Dependency is a short-term, "just for this moment" relationship (the object is only *used inside a method* and then forgotten).

**Dependency Using a Local Variable Inside a Method — Example:**
```java
// Dependent class
class Whiteboard
{
    void writeOnBoard()
    {
        System.out.println("Writing on the whiteboard...");
    }
}

// Main class that uses Whiteboard
class Teacher
{
    void teachLesson()
    {
        // Local variable: Dependency created inside the method
        Whiteboard board = new Whiteboard();
        board.writeOnBoard();  // Temporary usage
        System.out.println("Teacher is explaining the topic.");
    }
}

// Entry point
public class MainApp
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher();
        teacher.teachLesson();  // Trigger method that shows dependency
    }
}
```

**Output:**
```
Writing on the whiteboard...
Teacher is explaining the topic.
```

**Dependency Using a Method Parameter — Example:**
```java
// Dependent class
class Printer
{
    void printDocument()
    {
        System.out.println("Printing document...");
    }
}

// Main class that depends on Printer
class OfficeWorker
{
    // Dependency injected via method parameter
    void performTask(Printer printer)
    {
        printer.printDocument();  // Temporary usage
        System.out.println("OfficeWorker has completed printing task.");
    }
}

// Entry point
public class MainApp
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();            // Create dependency
        OfficeWorker worker = new OfficeWorker();   // Create dependent

        // Inject dependency via method parameter
        worker.performTask(printer);
    }
}
```

**Output:**
```
Printing document...
OfficeWorker has completed printing task.
```

**One More Example of Dependency:**
```java
class Printer
{
    void printDocument(String doc)
    {
        System.out.println("Printing document: " + doc);
    }
}

class OfficeWorker
{
    void doWork()
    {
        Printer printer = new Printer(); // Dependency via local variable
        printer.printDocument("ProjectReport.pdf");
        System.out.println("Work completed.");
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        OfficeWorker worker = new OfficeWorker();
        worker.doWork(); // OfficeWorker depends on Printer to print
    }
}
```

**Output:**
```
Printing document: ProjectReport.pdf
Work completed.
```

---

### What Is Inheritance (IS-A Relationship)?

IS-A (Inheritance) is the process by which a child class (subclass) inherits fields and methods from a parent class (superclass). Ex: A Car IS-A Vehicle. It is achieved using the `extends` keyword in case of classes and the `implements` keyword in case of interfaces.

**Example:**
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

**Output:**
```
Vehicle starts.
Car drives.
```

---


---

## Follow-up Interview Questions for This Topic

### "What's the real difference between Aggregation and Composition? Give me an example, not just the definition."

Both are "has-a" relationships, but the difference is about **ownership and lifecycle**:
- In **Aggregation**, the child object can exist independently of the parent. Ex: a `Department` has `Professors` — if the department is dissolved, the professors still exist and can join another department.
- In **Composition**, the child object's life is completely tied to the parent's. Ex: a `House` has `Rooms` — if the house is demolished, the rooms cease to exist too.

It's sometimes called a "has-a" vs "owns-a" distinction — aggregation is a weaker, more flexible relationship (often used for better testability), while composition creates tighter coupling but models a stronger real-world binding.

### "What's the difference between Association and Dependency? They both involve one class using another."

The key difference is **how long the relationship lasts**:
- **Association** is stored as an instance variable — the relationship lives as long as the containing object lives (long-term "has-a").
- **Dependency** only exists inside a method — the object is created or passed in, used, and then it's gone once the method finishes (short-term "uses-a").

If you're asked "is this composition, aggregation, or dependency?" — check whether the object is a field (association family) or just a local variable/parameter (dependency).
