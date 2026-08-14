# Java Interview Prep #1c: Polymorphism (Overloading & Overriding)

## What Is Polymorphism?

- Polymorphism means "many forms". It means the ability of a single entity to behave in multiple ways. For ex., in real world: 1) a person can act as a teacher, father, son or different roles 2) water has states like solid, liquid, gas.
- There are 2 types of polymorphism in Java:
  1. Compile-Time Polymorphism
  2. Run-Time Polymorphism

**In simple words:** Same action, different behavior depending on who is doing it or how it is called. Example: pressing the "power button" on a TV turns it on, but pressing the same "power button" on a fan turns the fan on. Same button (method name), different result (behavior) depending on the object.

### What Is Compile-Time Polymorphism?

It is also known as static or early binding and it is achieved by using method overloading or operator overloading. At compile time, the Java compiler decides which overloaded method or operator to invoke based on the method signature and reference type.

### What Is Method Overloading?

Method overloading means more than one method with the same name but different parameters. All overloaded methods must have the same name and should be in the same class or subclass, and the method parameter list must be different in number, type or order of parameters.

**Example:**
```java
class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }

    double add(double a, double b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }
}
public class MainApp
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        int result1 = calc.add(10, 20);
        double result2 = calc.add(5.5, 4.5);
        int result3 = calc.add(1, 2, 3);

        // Printing the results
        System.out.println("Result of add(int, int): " + result1);
        System.out.println("Result of add(double, double): " + result2);
        System.out.println("Result of add(int, int, int): " + result3);
    }
}
```

**Output:**
```
Result of add(int, int): 30
Result of add(double, double): 10.0
Result of add(int, int, int): 6
```

### What Are Some Important Points to Remember About Method Overloading?

1. Method overloading does not depend on return type, it depends only on the parameter list.
   ```java
   int add(int a, int b) { return a + b; }
   double add(double a, double b) { return a + b; } //Valid overload
   ```

2. Main method can also be overloaded in Java.
   ```java
   public static void main(String[] args)
   {
       System.out.println("Main method with String[]");
   }
   public static void main(int[] args)
   {
       System.out.println("Main method with int[]");
   }
   ```

3. Constructors can also be overloaded.
   ```java
   class Student
   {
       Student() {}
       Student(String name) {}
       Student(String name, int age) {}
   }
   ```

4. Access modifiers (e.g., public, private) can be different.
   ```java
   public void show() {}
   private void show(int a) {}  //Valid overload
   ```

5. Static methods can be overloaded.
   ```java
   static void display() {}
   static void display(String msg) {}  //Valid overload
   ```

### What Is Runtime Polymorphism?

It is also known as Dynamic or Late Binding, and it's achieved by using method overriding. Here the JVM decides at runtime which overridden method to invoke based on the actual object, not the reference type.

### What Is Method Overriding in Java?

It allows the child class to write its own implementation of a method that is already present in the parent class, and the JVM decides which method to execute at runtime based on the object type, not the reference type. The methods must have the same name, be in different classes (subclass), and have the same number, type and order of parameters, and it should follow an is-a relationship which is inheritance.

**Example:**
```java
class Bank
{
    double getInterestRate()
    {
        return 0.0;
    }
}

class SBI extends Bank
{
    @Override
    double getInterestRate()
    {
        return 6.5;
    }
}

class HDFC extends Bank
{
    @Override
    double getInterestRate()
    {
        return 7.0;
    }
}

class ICICI extends Bank
{
    @Override
    double getInterestRate()
    {
        return 6.8;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}
```

**Output:**
```
SBI Interest Rate: 6.5%
HDFC Interest Rate: 7.0%
ICICI Interest Rate: 6.8%
```

### What Are Some Important Points to Remember About Method Overriding in Java?

1. It requires the child class method to have the same name, return type, and parameter list as the parent class method.
2. Overriding method must be in a subclass, not in the same class.
3. If the parent method is public, the overriding method cannot be private — basically we can't change the access modifier type in an overridden method (can't reduce visibility).
4. Static methods, constructors, and the main method cannot be overridden.
5. Methods marked as final, static, or private cannot be overridden.
6. The overriding method can throw only the same or narrower checked exceptions than the overridden method.
7. The `@Override` annotation is recommended to avoid mistakes and improve code readability.
8. It is used to achieve runtime polymorphism or dynamic method dispatch.

### What Are the Advantages of Polymorphism?

1. It increases flexibility and reusability
2. It allows code extensibility without modifying existing code
3. It supports single task, multiple implementations
4. It enhances maintainability and scalability

### What Are Some Important Points to Remember About Polymorphism?

1. Mainly achieved through method overloading and method overriding
2. It supports the Open/Closed Principle, meaning code is open for extension but closed for modification.
3. It helps reduce code duplication by reusing the same interface or method name across different types.
4. Upcasting enables runtime polymorphism, for ex., a parent class reference can hold a child class object.

---


---

## Follow-up Interview Questions for This Topic

### "You said method overriding happens at runtime — so why can't I override a static or private method then?"

Because overriding depends on **runtime (dynamic) binding** — the JVM looks at the actual object at runtime and decides which method to call. Static, private, and final methods are resolved at **compile-time (static binding)** instead — the compiler already fixes which method will run, based on the reference type, before the program even executes. Since there's nothing left to decide at runtime, these methods can't be overridden — a static method can only be *hidden* (redefined with the same signature in the child, but it's a completely separate method, not an override).

**In simple words:** Overriding needs the JVM to "wait and decide later." Static/private/final methods are already decided in advance, so there's nothing left to decide later.

### "What's the actual difference between overloading and overriding? People use them loosely — walk me through it."

- **Where it happens:** Overloading happens inside the *same* class (or a subclass); overriding happens *between* a parent class and a child class.
- **How it's resolved:** Overloading is resolved at **compile-time** based on the method signature; overriding is resolved at **runtime** based on the actual object.
- **Return type:** Overloaded methods can have different return types; overridden methods must keep the same (or a covariant) return type.
- **Parameters:** Overloading requires a different parameter list; overriding requires the *exact same* parameter list.
- **Purpose:** Overloading is about handling different kinds of input for a similar action; overriding is about giving a subclass its own version of inherited behavior — this is what achieves runtime polymorphism.
