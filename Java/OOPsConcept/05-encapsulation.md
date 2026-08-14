# Java Interview Prep #1e: Encapsulation

## What Is Encapsulation?

It is the mechanism of binding data (variables) and actions (methods) into a single unit. Technically every class is an example of encapsulation. In the real world, ex: a capsule in which the main medicine is encapsulated, or a car in which the engine, wheels, and other parts are encapsulated.

**In simple words:** Lock your data (variables) in a box and give people only a "door" (getters/setters) to access it — not direct access to the box. This way you control what goes in and what comes out.

**Simple Example:**
```java
class Car
{
    // Data members (variables)
    String brand;
    int speed;

    // Method to display person details
    void setDetails(String b, int s)
    {
        brand = b;
        speed = s;
    }
    void printDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Creating object
        Car c = new Car();

        // Calling method
        c.setDetails("Tata", 100);
    }
}
```

**Output:**
```
Brand : Tata
Speed : 100
```

The above example is a simple encapsulated class, but it does not provide any data hiding. So, to create proper encapsulation, we have to follow some rules, i.e., declare variables as private so that they cannot be accessed directly from outside the class, and make public getter and setter methods to access and modify the private variables.

### What Does a Properly Encapsulated Java Program Look Like?

```java
class Car
{
    // Private data members (encapsulated)
    private String brand;
    private int speed;

    // Public setter for brand
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    // Public getter for brand
    public String getBrand()
    {
        return brand;
    }

    // Public setter for speed
    public void setSpeed(int speed)
    {
        // Optional: simple validation
        if (speed >= 0)
        {
            this.speed = speed;
        }
    }

    // Public getter for speed
    public int getSpeed()
    {
        return speed;
    }

    // Method to print car details
    public void printDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        Car c = new Car();

        // Setting values using setters
        c.setBrand("Tata");
        c.setSpeed(100);

        // Printing car details
        c.printDetails();
    }
}
```

**Output:**
```
Speed : Tata
Speed : 100
```

### What Are the Uses of Encapsulation?

- **Protects data**: Hides data from direct access using private variables.
- **Controls data access**: Provides controlled access through public getters and setters.
- **Allows data validation**: Enables validation before updating variables (e.g., checking valid input).
- **Improves code maintainability**: Keeps internal implementation hidden, making changes easier.
- **Enhances flexibility**: Internal logic can change without affecting external code.
- **Prevents unauthorized or accidental modifications**: Limits who and how data can be changed.

### Can You Show a Program That Demonstrates All the Above Uses?

```java
// Class demonstrating proper encapsulation
class Account
{
    // Protects data by hiding it from direct access
    private String accountHolder;
    private double balance;

    // Public getter (controlled access to private data)
    public String getAccountHolder()
    {
        return accountHolder;
    }

    // Public setter (controlled access with flexibility for future validation)
    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance()
    {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount)
    {
        // Allows data validation before modifying balance
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("You have deposited " + amount + " Rs.");
            System.out.println("New balance is: " + getBalance() + " Rs.");
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount)
    {
        // Data validation: prevents negative balance
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + " Rs.");
            System.out.println("New balance is: " + getBalance() + " Rs.");
        }
        else
        {
            System.out.println("Invalid or Insufficient balance for withdrawal");
        }
    }
}

public class BankApp
{
    public static void main(String[] args)
    {
        // Creating object
        Account account = new Account();

        // Cannot access private fields directly
        // account.balance = 10000; // Not allowed (Encapsulation)

        // Uses public setters and methods
        account.setAccountHolder("Deepak");

        // Proper access via methods ensures validation
        account.deposit(10000);      // Valid deposit
        account.withdraw(3000);      // Valid withdrawal

        account.deposit(-20000);     // Invalid deposit
        account.withdraw(100000);    // Invalid withdrawal (insufficient funds)
    }
}
```

**Output:**
```
You have deposited 10000.0 Rs.
New balance is: 10000.0 Rs.
You have withdrawn 3000.0 Rs.
New balance is: 7000.0 Rs.
Invalid deposit amount
Invalid or Insufficient balance for withdrawal
```

---

