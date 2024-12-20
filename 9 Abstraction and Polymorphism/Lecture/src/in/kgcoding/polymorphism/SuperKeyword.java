package in.kgcoding.polymorphism;


// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Panda");
        dog.makeSound();
    }
}


// Parent class
class Animal {
    String name;

    // Constructor of Animal
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Owner called for: " + name);
    }

    // Method in Animal class
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    String breed;

    // Constructor of Dog
    Dog(String name, String breed) {
        super(name); // Call the parent class constructor
        this.breed = breed;
        System.out.println("Dog Owner called for: " + name + ", Breed: " + breed);
    }

    // Overriding the parent class method
    @Override
    void makeSound() {
        super.makeSound(); // Call the parent class's version of the method
        System.out.println(name + " barks.");
    }
}





/*
<-----------------------------------------------------------------------------{"Using 'Super Keyword' in deep"}------------------------------------------------------->

1. Super() can be used to refer immediate parent class instance variable.
2. Super() can be used to invoke immediate parent class method.
3. Super() can be used to invoke immediate parent class constructor.
4. Call the parent class's constructor.
5. Access methods or variables from the parent class that are hidden or overridden.
6. The super() method in Java is an advanced feature of inheritance that provides a reference to the parent class.
7. It serves various purposes in object-oriented programming and is crucial for achieving polymorphism, code reusability, and clean class hierarchies.

8. Key features of Super() Keyword:-
8.1. Calling Parent Class Constructors
     super() is used to explicitly call the constructor of the parent class.
     If super() is not explicitly called, the compiler automatically inserts it, provided the parent class has a no-argument constructor.

8.2. Accessing Hidden Parent Class Fields
     When a subclass defines a field with the same name as one in the parent class, super can be used to refer to the parent class's field.

8.3. Invoking Parent Class Methods
     When a subclass overrides a method in the parent class, super can be used to call the parent class version of the method.

8.4. Solving Constructor Chaining in Multi-level Inheritance
     In multi-level inheritance, super() ensures that constructors in the entire hierarchy are called in the proper sequence.

8.5. Dynamic Polymorphism and super()
     In polymorphism, super can help distinguish between overridden behaviors in subclasses while still leveraging parent functionality.


 */
