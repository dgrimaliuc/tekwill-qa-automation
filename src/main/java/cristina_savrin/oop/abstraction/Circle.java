package cristina_savrin.oop.abstraction;

/**
 * 1. Create an abstract class called "Shape" with an abstract method named "calculateArea".
 * Create two subclasses of Shape, such as "Rectangle" and "Circle", and implement the "calculateArea" method differently in each subclass.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
