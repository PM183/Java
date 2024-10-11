/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its constructor
having parameters for length and breadth is used to initialize length and breadth of the rectangle. 
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side 
(suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter 
of a rectangle and a square. Also use array of objects. */

class Rectangle {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class p19 {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[2];

        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Square(4);

        for (Rectangle shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle:");
            } else if (shape instanceof Square) {
                System.out.println("Square:");
            }
            shape.printArea();
            shape.printPerimeter();
            System.out.println();
        }
    }
}