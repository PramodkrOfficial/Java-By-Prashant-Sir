public class Inheritance {
    public static void main(String[] args) {
        // Create objects of the derived classes
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskey", "Black");

        // Call the speak method (which is overridden in the derived classes)
        dog.speak();  // Output: Buddy barks.
        cat.speak();  // Output: Whiskers meows.
    }

}

// Base class (Parent class)
class Animal {
    String name;

    // Constructor of the base class
    public Animal(String name) {
        this.name = name;
    }

    // Method in the base class
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    String breed;

    // Constructor of the derived class
    public Dog(String name, String breed) {
        // Call the constructor of the base class (Animal)
        super(name);
        this.breed = breed;
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }
}

// Another derived class (Child class)
class Cat extends Animal {
    String color;

    // Constructor of the derived class
    public Cat(String name, String color) {
        // Call the constructor of the base class (Animal)
        super(name);
        this.color = color;
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }
}



/*
<------------------------------------------------{"Using of Inheritance in deep"}------------------------------------------------->

1.Inheritance:--------> Inheritance allows a new class (subclass) to inherit features from an existing class (superclass).
2.Code Reusability:---> It enables subclass to use methods and variable of the superclass, reducing code duplication.
3.Access Control:-----> The protected access modifier is often used in inheritance to allow subclass access to superclass members.


<------------------------------------------------{"Some important of Inheritance in deep"}------------------------------------------------->

Definition:-----------> Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors
                        of a parent object. It is an important part of OOPs (Object-Oriented programming system).
Reason behind:--------> The idea behind inheritance in Java is that you can create new classes that are built upon existing
                        classes. When you inherit from an existing class, you can reuse methods and fields of the parent class.
Reason behind:--------> Why use inheritance in java
                        o For Method Overriding (so runtime polymorphism can be achieved).
                        o For Code Reusability

Used in Inheritance:--> Inheritance is the most powerful feature of object-oriented programming. It allows us to inherit the properties of one class into another class.
                        o Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
                        o Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
                        o Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
                        o Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class
                                       when you create a new class. You can use the same fields and methods already defined in the previous class.

Types of Inheritance:-> Single Inheritance:
                        Multilevel Inheritance:
                        Hierarchical Inheritance:
                        Multiple Inheritance (Not Directly Supported):
                        Hybrid Inheritance:

1.Single Inheritance:----------> A subclass inherits from only one superclass.
                                 Example: A Dog class can inherit from an Animal class.

2.Multilevel Inheritance:------> A subclass inherits from a superclass, which in turn inherits from another superclass.
                                 Example: A SportsCar class can inherit from a Car class, which inherits from a Vehicle class.

3.Hierarchical Inheritance:----> Multiple subclasses inherit from a single superclass.
                                 Example: Multiple animal species (like Dog, Cat, and Bird) can inherit from an Animal class.

4.Multiple Inheritance:--------> Java doesn't directly support multiple inheritance to avoid the "diamond problem."
                                 However, it can be simulated using interfaces.

5.Hybrid Inheritance:----------> Hybrid inheritance is a combination of multiple inheritance methods, which can be achieved
                                 in Java through class inheritance and interface implementation, despite the "Diamond Problem".
                                 Interface Inheritance: ElectricCar inherits the start() and stop() methods from the Vehicle interface.
                                 Class Inheritance: ElectricCar also inherits the implementation of start() and stop() from the Car class.


 */
