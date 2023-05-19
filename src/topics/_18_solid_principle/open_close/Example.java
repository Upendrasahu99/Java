package topics._18_solid_principle.open_close;

public class Example {

}

abstract class Vehicle{
    abstract void drive();
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a car...");
    }
}

class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a bike...");
    }
}

