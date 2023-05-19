/**
 * In this code constructor initialize object using constructor.
 *
 * Class: Car
 *
 * Attributes:
 *
 * make (String)
 * model (String)
 * year (int)
 * mileage (double)
 * fuelLevel (double)
 * State: The state of a car object would be the values of its attributes at any given moment.
 *
 * Constructor: The constructor initializes the attributes of the car object when it is created. For example:
 *
 * Method: A method is a block of code that performs a specific task. For example, a car object might have methods like start(), stop(), accelerate(), and decelerate(). Here's an example:
 */

package topics._08_oops.a_19_constructor;

public class Example1 {

}

class Car {
    String make;
    String model;
    int year;
    double mileage;
    double fuelLevel;

    public Car(String make, String model, int year, double mileage, double fuelLevel) { // code for construction
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public void start() {
        System.out.println("Starting the car.");
        // code to start the car(function or method)
    }

    public void stop() {
        System.out.println("Stopping the car.");
        // code to stop the car (function or method)
    }

    public void accelerate() {
        System.out.println("Accelerating the car.");
        // code to accelerate the car (function or method)
    }

    public void decelerate() {
        System.out.println("Decelerating the car.");
        // code to decelerate the car
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2019, 5000.0, 50.0);
        myCar.start();
        myCar.accelerate();
        myCar.stop();
        myCar.decelerate();
    }
}

/**
 * In this example, we've defined a Car class with attributes for the make, model, year, mileage, and fuel level of a car object. We've also defined a constructor to initialize these attributes when a new car object is created. Finally, we've defined methods for starting, stopping, accelerating, and decelerating the car object. Using the constructor makes it easy to create and initialize new car objects, and using methods allows us to perform specific tasks on the car object.
 */