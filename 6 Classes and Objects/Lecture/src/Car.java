public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    static {
        noOfCarsSold = 0;
        System.out.println("I'm in Static Block");
    }
    {
        noOfCarsSold++;
        System.out.println("I'm in Init Block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        noOfSeats = 5;
       /*
        noOfWheels = 4;
        this.color = "Black";
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
        */
    }

    public Car start() {       //void function
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can't start");
        }else if (currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode, please refuel");

        }else {
            System.out.println("Car is started.... bruhhhh.....");

        }
        return this;
    }

    public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving...");


    }

//    public  void addFuel(float fuel) {
//        currentFuelInLiters += fuel;
//    }



    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I'm in Finalize!");
    }
}



/*
<--------------------------------------------------------- Using for "Stack vs Heap Memory" keyword -------------------------------------------------------------->

Stack:--------------------------> A Stack is a linear data structure that holds a linear, ordered sequence of elements. It is an abstract data type.
                                  A stack works on LIFO process (Last In First Out) i.e, the element that was inserted last will be removed first.
                                  E.g:- A deck of cards, piles of money, piles of books.

Stack Memory:-------------------> A stack memory is not flexible the memory size allotted can not be changed.It is used only by one thread execution.

Heap:---------------------------> Heap (Java) is also the area of memory used to store objects instantiated by applications running on the JVM.
                                  When JVM is started, heap memory is created and any objects in the heap can be shared b/w threads as long as the
                                  application is running.
                                  Heap is used for dynamic memory allocation and storage of objects. It is a shared memory area accessible to all
                                  threads in java application.

Heap Memory:--------------------> Heap memory is a vital component of the JVM responsible for dynamically allocating and managing objects during
                                  program execution.It is shared memory area accessible to all threads in the Java application.
Object Storage:-----------------> Object created at runtime, such as instances of classes, arrays, and collections are stored in heap.

Application:--------------------> Using of key purpose.

Object Allocation:--------------> Memory is allotted in the heap to all objects created during program execution, including instances of classes, arrays, and collections.
Automatic Memory Management:----> Garbage collection is the mechanism by which Java manages memory automatically. In order to make memory available for new object allocations, the JVM automatically detects and
                                  deallocates objects that are no longer reachable.
Memory Efficiency:--------------> The JVM can effectively manage memory and steer clear of manual memory management problems like memory leaks because to heap memory's flexible memory allocation.
Shared Memory:------------------> The heap is a shared memory space that is available to all threads in a Java application. Multiple threads can interact and share data through heap-stored objects.


<-------------------------------------------------------- Using for "How Java uses Heap Memory" keyword -------------------------------------------->
How to use:---------------------> The Java Heap is divided into several generations each serving different purposes to optimise memory management
                                  and garbage collection.

1. Young Generation:------------> First Generation Overview
                                • First part of Java heap, divided into survivor and Eden spaces.
                                • Objects allocated in Eden space upon creation.
                                • Minor garbage collection (Minor GC) triggers as Young Generation fills up.
                                • JVM clears short-lived objects, promoting surviving to survivor spaces.
                                • Objects surviving multiple Minor GC cycles move to Old Generation.

2. Old Generation:--------------> Old Generation Overview
                                • Stores long-lived objects.
                                • Promotes objects that persist or have survived multiple Minor GC cycles.
                                • Less frequent "Full GC" garbage collections.
                                • Reclaims memory by identifying and collecting no longer in use long-lived objects.

3. Permanent Generation:--------> Java 8 and the Permanent Generation (Prior to Java 8)
                                • The Permanent Generation was a separate region within the heap used for storing metadata related to classes, methods, and JVM internals.
                                • It was a source of issues like OutOfMemoryErrors in applications with dynamically loaded classes.
                                • In Java 8, the Permanent Generation was replaced by the "Metaspace," allowing class metadata to be stored in native memory outside the heap.


<------------------------------------------------------ Using for "Primitive V/s Reference Data types" keyword --------------------------------------------->

Java Data types:----------------> Understanding Java Programming Data Types
                                • Java categorizes data into distinct functions.
                                • Primitive and reference data types discussed.

1. Primitive Data Types---------> Primitive data types in Java are predefined by the language. They represent the most basic units of data and include:
                                • Boolean: This data type represents a binary value, either true or false. It is commonly used in logical expressions and conditional statements. For example:

                                    boolean isTrue = true;
                                    boolean isFalse = false;

                                • Byte: The byte data type stores integer values ranging from -128 to 127. It is primarily used when memory optimization is crucial. For example:

                                    byte myByte = 10;

                                • Short: The short data type holds integer values in the range of -32,768 to 32,767. It is used when a smaller range is sufficient. For example:

                                    short myShort = 30000;

                                • Int: The int data type is used to store integer values within a more extensive range (-2,147,483,648 to 2,147,483,647). It is the most commonly used integer type in Java. For example:

                                    int myInt = 1000000;

                                • Long: The long data type allows for storing significantly larger integer values (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807). When dealing with large numbers beyond the range of int,
                                  long is used. For example:

                                    long myLong = 1234567890L;
                                    ('Note: The suffix L indicates that we want to treat the number as a long.')

                                • Float: The float data type represents floating-point numbers with single precision. It can store fractional values up to 7 digits. For example:

                                    float myFloat = 3.14f;
                                    (' Note: The suffix f denotes that we want to treat the number as a float.')

                                • Double: The double data type is used for floating-point numbers with double precision. It can store fractional values with greater precision than float (up to 15 decimal places). For example:

                                    double myDouble = 3.14159;

                                • Char: The char data type stores a single Unicode character. It is enclosed within single quotes ('') and can represent any character. For example:

                                    char myChar = 'A';

2. Reference Data Types---------> Reference data types (Non-Primitive Data Types) are more complex in nature, representing objects rather than actual values. They are typically created using classes, interfaces, or arrays.
                                  Some popular reference data types in Java include:

                                • String: The String class represents a sequence of characters. It is one of the most commonly used reference data types. For example:

                                    String myString = "Hello, World!";

                                • Array: Arrays in Java are a collection of elements of a specific data type. They provide a way to store multiple values in a single variable. For example:

                                    int[] myArray = new int[]{ 1, 2, 3, 4, 5 };

                                • Class: User-defined classes can be used as reference data types. They encapsulate properties and behaviors that define objects. For example:

                                    class Person {
                                        String name;
                                        int age;
                                    }

                                    Person myPerson = new Person();
                                    myPerson.name = "John";
                                    myPerson.age = 25;



<--------------------------------------------------------- Using for "Variable Scopes" keyword -------------------------------------------------------------->

Scope of Variables in Java:-----> The scope of variables in Java is a location (or region) of the program where the variable is visible to a program and can be accessible.
                                  Java allows you to declare variables within any block. A block specifies a scope by beginning with an opening curly brace and ending with a closing curly brace.

                                  There are three types of variables in Java, depending on their scope:
                                • local variables
                                • instance variables
                                • class variables (static variables).

                                • 1. Scope of Local Variables in Java:------> Local variables are those variable which are declared inside methods, constructors, or blocks.
                                                                              These variables are accessible only within that specific block of code in which they are declared.

                                                                            • Declared inside methods, constructors, or blocks.
                                                                            • Accessible only within the declared block.
                                                                            • Scope remains within the method, block, or constructor.
                                                                            • Visible only within the method, constructor, or block.

                                • 2. Scope of Instance Variables in Java:---> Instance variables are those variable that are declared within a class but outside any method.
                                                                              They are associated with objects of the class and have distinct values for each object.

                                                                            • Declared within a class but outside methods.
                                                                            • Associated with class objects with distinct values.
                                                                            • Scope within the class, visible in all methods, constructors, and program block.

                                • 3. Scope of Static Variables in Java:-----> Static variables, also known as class variables, are declared using the static keyword
                                                                              and are associated with the class, sharing their values among all instances.

                                                                            • Declared using the static keyword.
                                                                            • Also known as class variables.
                                                                            • Associated with the class, not objects.
                                                                            • Values shared among all instances of the class.
                                                                            • Scope within the class when defined with the static keyword.



<--------------------------------------------------------- Using for "Garbage Collection and Finalize" keyword -------------------------------------------------------------->

Definition:---------------------> Java garbage collection is the process by which Java programs perform automatic memory management. Java garbage collection is an automatic process.
                                  The programmer does not need to explicitly mark objects to be deleted. The garbage collection implementation lives in the JVM.
                                  It’s a feature that allows developers to focus on their application’s logic without being burdened by the meticulous task of handling memory allocation and deAllocation.

Automatic process:--------------> Garbage collection is managed by the JVM(Java Virtual Machine), running in the background.
Object Eligibility:-------------> Objects that are no longer reachable, meaning no active references to them, are eligible for garbage collection.
No Manual Control:--------------> Unlike languages like C++, Java developers cannot explicitly deallocate memory. Garbage collection is automatic and non-deterministic.
Generational Collection:--------> Java uses a generational garbage collection strategy, which divides memory into different regions(Young, Old, Permanent generations)based on object ages.
Heap Memory:--------------------> Garbage collection occurs in the heap memory, where all Java objects reside.
Performance Impact:-------------> Garbage collection can affect application performance, particularly if it runs frequently or takes a long time to complete.


<--------------------------------------------------------- Using for "Garbage Collection and Finalize" keyword -------------------------------------------------------------->

Finalization:-------------------> Before an object is garbage collected, the finalize() method may be called, giving the object a chance to clean up resources.However, it's not guaranteed to run, and its usage is generally discouraged.
Optimization:-------------------> Developers can optimize the process indirectly through code practice like setting unnecessary object references to null.
System.gc() Call:---------------> While System.gc() suggests that the JVM performs garbage collection, it's not a guarantee.


 */




