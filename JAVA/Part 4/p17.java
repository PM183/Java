/*Create a class with a method that prints "This is parent class" and its subclass with 
another method that prints "This is child class". Now, create an object for each of the
class and call 1 - method of parent class by object of parent */

public class p17 {

    public static void main(String[] args) {
        // Create an object of the parent class
        ParentClass parent = new ParentClass();
        // Call the method of the parent class
        parent.printParent();

        // Create an object of the child class
        ChildClass child = new ChildClass();
        // Call the method of the child class
        child.printChild();
    }
}

class ParentClass {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    void printChild() {
        System.out.println("This is child class");
    }
}
