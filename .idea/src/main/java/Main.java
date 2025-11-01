// Main.java

// Abstract class Shape
abstract class Shape {
    int a, b;

    // Constructor
    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extends Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        // Use double division to avoid integer division truncation
        double area = (a * b) / 2.0;
        System.out.println("Area of Triangle: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(10, 5);

        rect.printArea();   // prints: Area of Rectangle: 50
        tri.printArea();    // prints: Area of Triangle: 25.0
    }
}

