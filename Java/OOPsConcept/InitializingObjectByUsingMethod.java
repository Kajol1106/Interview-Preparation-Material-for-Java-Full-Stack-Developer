package OOPsConcept;

public class InitializingObjectByUsingMethod {
    String color;
    int age;
    void initObject(String c, int a) {
        color = c;
        age = a;
    }

    void display() {
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        InitializingObjectByUsingMethod buzo = new InitializingObjectByUsingMethod();
        buzo.initObject("black", 10);
        buzo.display();
    }
}
