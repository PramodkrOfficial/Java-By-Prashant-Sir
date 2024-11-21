import com.sun.jdi.connect.Connector;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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

    /*
    <--------------------------- Using for "this" keyword ---------------------------------->

    Constructor Call: Can be used to invoke a constructor of the same class (this()).
    Method Call: Invokes a method of the current object.
    Current Instance: Refers to the current class instance variable.
    Pass as Argument: Can be passed as an argument in the method call and constructor call.
    Return Call: Can be used to return the current class instance from the method.
     */

    public  void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;

    }
}



/*
<--------------------------- Using for "Stack vs Heap Memory" keyword ---------------------------------->

Stack:- A Stack is a linear data structure that holds a linear, ordered sequence of elements. It is an abstract data type.
        A stack works on LIFO process (Last In First Out) i.e, the element that was inserted last will be removed first.
        E.g:- A deck of cards, piles of money, piles of books.

Stack Memory:- A stack memory is not flexible the memory size allotted can not be changed.It is used only by one thread execution.

Heap:-  Heap (Java) is also the area of memory used to store objects instantiated by applications running on the JVM.
        When JVM is started, heap memory is created and any objects in the heap can be shared b/w threads as long as the
        application is running.
        Heap is used for dynamic memory allocation and storage of objects. It is a shared memory area accessible to all
        threads in java application.

Heap Memory:- Heap memory is a vital component of the JVM responsible for dynamically allocating and managing objects during
              program execution.It is shared memory area accessible to all threads in the Java application.
Object Storage:- Object created at runtime, such as instances of classes, arrays, and collections are stored in heap.

Application:- Using of key purpose.
Object Allocation:-
Automatic Memory Management:-


 */