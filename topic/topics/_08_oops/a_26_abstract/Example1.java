package topics._08_oops.a_26_abstract;

public class Example1 {
}

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car start with key");
    }
}

class Scooter extends Vehicle {
  //  Vehicle v = new Vehicle();  not possible
    @Override
    void start() {
        System.out.println("Scooter start with kick");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Scooter scooter = new Scooter();
        scooter.start();
    }
}
