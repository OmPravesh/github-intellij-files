// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// First interface
interface Flyable {
    void fly();
}

// Second interface
interface Swimmable {
    void swim();
}

// Third interface
interface Runnable {
    void run();
}

// Child class extending Animal and implementing 3 interfaces
class Bird extends Animal implements Flyable, Swimmable, Runnable {
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming...");
    }

    @Override
    public void run() {
        System.out.println("Bird is running...");
    }
}

// Main class
public class Inter3 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();   // from Animal (parent class)
        b.fly();   // from Flyable
        b.swim();  // from Swimmable
        b.run();   // from Runnable
    }
}

