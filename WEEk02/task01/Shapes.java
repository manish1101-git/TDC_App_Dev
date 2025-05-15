
  abstract class Shape {
   
    public abstract double calculateArea();
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Test class demonstrating runtime polymorphism
public class Shapes {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(5);
        System.out.printf("Circle Area: %.2f\n", shape.calculateArea());

        shape = new Rectangle(4, 6);
        System.out.printf("Rectangle Area: %.2f\n", shape.calculateArea());

        shape = new Triangle(3, 8);
        System.out.printf("Triangle Area: %.2f\n", shape.calculateArea());
    }
}