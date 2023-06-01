/**
 * This a simple or single Inheritance example.
 * In this example car is subclass(child class) and vehicle is Superclass(parent class).
 */

package topics._08_oops.a_25_inheritance;

public class Example1 {
}
class Vehicle{
    public void start() {
        System.out.println("Starting the car.");
        // code to start the car(function or method)
    }

    public void stop() {
        System.out.println("Stopping the car.");
        // code to stop the car (function or method)
    }
}
class car extends Vehicle{
    public static void main(String[] args) {
        Vehicle nano = new car();
        nano.start();
        nano.stop();
    }
}
