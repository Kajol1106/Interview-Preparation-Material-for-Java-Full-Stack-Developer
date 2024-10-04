package OOPsConcept;

public class InitializingObjectByReferenceVariable {
    String color;
    int age;

    public static void main(String[] args) {
        InitializingObjectByReferenceVariable buzo = new InitializingObjectByReferenceVariable();
        buzo.color = "black";
        buzo.age = 10;
        System.out.println(buzo.color + " "+ buzo.age);
    }
}
