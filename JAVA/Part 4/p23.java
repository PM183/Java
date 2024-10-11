/*Assume you want to capture shapes, which can be either circles (with a radiusand a color)
or rectangles (with a length, width, and color). You also want to be able to create signs 
(to post in the campus center, for example), each of which has a shape (for the background of the sign)
and the text (a String) to put on the sign. Create classes and interfaces for circles, rectangles, shapes, 
and signs. Write a program that illustrates the significance of interface default method. */

// Interface for shapes
interface Shape {
    String getColor();
    default void draw() {
        System.out.println("Drawing a shape of color " + getColor());
    }
}

// Class for Circle
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a circle of radius " + radius + " and color " + getColor());
    }
}

// Class for Rectangle
class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a rectangle of length " + length + ", width " + width + " and color " + getColor());
    }
}

// Interface for signs
interface Sign {
    Shape getShape();
    String getText();
    default void display() {
        System.out.println("Displaying a sign with shape " + getShape().getColor() + " and text '" + getText() + "'");
    }
}

// Class for Sign
class CampusSign implements Sign {
    private Shape shape;
    private String text;

    public CampusSign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public Shape getShape() {
        return shape;
    }

    public String getText() {
        return text;
    }
}
public class p23 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        circle.draw(); // Output: Drawing a circle of radius 5.0 and color Red
        rectangle.draw(); // Output: Drawing a rectangle of length 4.0, width 6.0 and color Blue

        CampusSign sign1 = new CampusSign(circle, "Welcome to Campus");
        CampusSign sign2 = new CampusSign(rectangle, "Campus Center");

        sign1.display(); // Output: Displaying a sign with shape Red and text 'Welcome to Campus'
        sign2.display(); // Output: Displaying a sign with shape Blue and text 'Campus Center'
    }
}