// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class
class Car extends Vehicle {
    // final instance variable (declared but not initialized here)
    final int speedLimit;

    // Constructor initializes the final variable
    Car(int limit) {
        speedLimit = limit;
    }

    // Method marked final (cannot be overridden further)
    @Override
    final void start() {
        System.out.println("Car is starting with speed limit: " + speedLimit);
    }
}

public class FinalKeyWord {
    public static void main(String[] args) {
        Car c = new Car(120);   // initialize final variable via constructor
        c.start();

        // c.speedLimit = 150; // ❌ ERROR: cannot assign a value to final variable
    }
}
