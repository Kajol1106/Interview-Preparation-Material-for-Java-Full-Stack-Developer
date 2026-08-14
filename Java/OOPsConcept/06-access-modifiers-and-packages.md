# Java Interview Prep #1f: Access Modifiers & Packages

## What Are Access Modifiers in Java?

1. **public**: The member is accessible from anywhere in the program. It can be used across packages and classes.
2. **protected**: The member is accessible within the same package and also in subclasses even if they are in different packages. It cannot be accessed by non-subclass classes outside the package.
3. **default (no modifier)**: The member is accessible only within the same package and cannot be accessed from classes in different packages.
4. **private**: The member is accessible only within the same class. Cannot be accessed from outside the class, even by subclasses.

**Example:**
```java
public class Car
{
    private String model;
    protected int speed;
    public void startEngine()
    {
        System.out.println("Engine started");
    }
}
```

---

## What Are Packages in Java?

- It is a core concept used to group related classes, interfaces and sub-packages, and used to avoid name conflicts, group related code and improve code maintainability and access control.
- You can think of a package as a folder in a file system, where similar Java files (classes or interfaces) are stored together — just like organizing documents into folders for easy access and management.
- Java has 2 types of packages:
  1. Built-in Packages (like `java.util`, `java.io`, `java.lang`)
  2. User-defined Packages (created by the programmer)
- Syntax to declare a package: `package package_name;`
- Syntax to import a package:
  1. `import package_name.class_name;` — only for specific class
  2. `import package_name.*;` — import all classes from a package

### Why Use Packages?

1. Organizes classes logically (e.g., utility classes, model classes).
2. Avoids class name conflicts between different modules or developers.
3. Provides access protection (using public, protected, private).
4. Makes searching, locating, and using classes/interfaces easier.

### What Are Built-in Packages?

- These are part of the Java Standard Library and provide ready-made classes and interfaces for various functionalities like data structures, input/output, networking, GUI, and more.
- Automatically imported ones contain core classes like `String`, `Math`, `Object`; other packages exist for collections, dates, etc.

**Example:**
```java
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
```

**Output:**
```
Enter your name: Kajol
Hello, Kajol
```

### What Are User-Defined Packages?

- These are created by programmers to logically group related classes and interfaces, improving code organization, reusability, and avoiding naming conflicts.

**Example:**
```java
package p1;

public class MyClass
{
    public void display()
    {
        System.out.println("Hello from MyClass in p1 package.");
    }
}
```

```java
package p2;

import p1.MyClass;  // Importing MyClass from p1 package

public class MainApp
{
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

**Output:**
```
Hello from MyClass in p1 package.
```

### How Do You Compile and Run a User-Defined Package (Using Terminal)?

```bash
javac p1/MyClass.java           # Compile the package class
javac -cp . p2/MainApp.java     # Compile the main class using current dir as classpath
java p2.MainApp                 # Run the program
```

---

