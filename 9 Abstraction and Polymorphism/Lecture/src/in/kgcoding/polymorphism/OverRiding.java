package in.kgcoding.polymorphism;

// Main Class
public class OverRiding {
    public static void main(String[] args) {

        // Reference of the superclass
        Employee employee;

        // Employee as a Manager
        employee = new Manager();
        employee.work(); // Output: Manager is planning and supervising tasks.

        // Employee as a Developer
        employee = new Developer();
        employee.work(); // Output: Developer is writing and testing code.

        // Employee as a Designer
        employee = new Designer();
        employee.work(); // Output: Designer is creating graphics and user interfaces.
    }
}


// Superclass
class Employee {
    // Method to be overridden
    void work() {
        System.out.println("Employee is working on general tasks.");
    }
}

// Subclass 1
class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is planning and supervising tasks.");
    }
}

// Subclass 2
class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing and testing code.");
    }
}

// Subclass 3
class Designer extends Employee {
    @Override
    void work() {
        System.out.println("Designer is creating graphics and user interfaces.");
    }
}







/*
<-------------------------------------------------------------------{"Using 'Method' / 'Constructor' Overriding"}------------------------------------------------------------------------------------------------>

1.Definition:---------> Overriding in Java is a key feature of object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
                        When a method in a subclass has the same name, return type, and parameters as a method in the superclass, the subclass's method overrides the super-class's method.
2.Key Features--------> 1.Method Signature: The method in the subclass must have the same name, return type, and parameter list as the method in the superclass.
                        2.Access Modifiers: The overriding method cannot have a more restrictive access modifier than the method in the superclass. For example, if the superclass method is protected, the overriding method cannot be private.
                        3.Annotations: It's good practice to use the @Override annotation. This ensures that the method is correctly overriding a method from the superclass and helps catch errors during compilation.
                        4.Dynamic (Runtime Polymorphism): Method calls are resolved at runtime based on the actual object type, not the reference type.
                        5.Superclass Method Invocation: The overridden method in the subclass can call the superclass method using the super keyword.

3.Features of Overriding: Important features

                        6.Runtime Polymorphism: The decision of which method to execute is made during runtime, not compile time.
                        7.Reusability: Allows subclasses to reuse and modify existing methods from the superclass.
                        8.Encapsulation: Helps encapsulate behavior specific to subclasses while keeping a unified method signature.
                        9.Code Readability and Maintainability: Makes code easier to understand by providing a clear relationship between superclass and subclass behaviors.



 */




