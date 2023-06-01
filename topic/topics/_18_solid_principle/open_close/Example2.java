package topics._18_solid_principle.open_close;

public class Example2 {
}

interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public static double calculate(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
//In this example, the Shape interface defines a area() method which calculates the area of a shape. The Rectangle and Circle classes implement this interface and provide their own implementation of the area() method. The AreaCalculator class uses an array of Shape objects to calculate the total area of all shapes in the array.

//      The Open-Closed Principle is followed because the AreaCalculator class is closed to modification but open to extension. We can easily add new shapes to the array without modifying the AreaCalculator class. For example, we can add a Triangle class that implements the Shape interface and calculates its area using its own implementation of the area() method. The AreaCalculator class does not need to be modified to include the Triangle class.
