// Base class
class Animal {
    // Method that will be overridden in subclasses
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    // Overriding the sound method for Dog
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    // Overriding the sound method for Cat
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Class to demonstrate method overloading
class OverloadExample {
    void printMessage() {
        System.out.println("No parameters here");
    }

    void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message " + (i + 1) + ": " + message);
        }
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrate method overriding (runtime polymorphism)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows

        // Demonstrate method overloading (compile-time polymorphism)
        OverloadExample overloadExample = new OverloadExample();
        overloadExample.printMessage();
        overloadExample.printMessage("Hello!");
        overloadExample.printMessage("Hello!", 3);
    }
}
