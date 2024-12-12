package in.kgcoding;


public class Object {

    private String  writer;
    private String editionNumber;
    private int year;

    public Object(String writer, String editionNumber, int year) {
        this.writer = writer;
        this.editionNumber = editionNumber;
        this.year = year;
    }


    public void displayInfo() {
        System.out.println("Book information: \n");
        System.out.println("Writer: " + writer);
        System.out.println("EditionNumber : " + editionNumber);
        System.out.println("Year: " + year);
    }


    public static void main(String[] args) {
        Object myBook = new Object("PremChand", "HGJ8467",2005);
        myBook.displayInfo();

    }
}




/*
<-----------------------------------------------------------------------{"Using 'Object class' in Deep"}--------------------------------------------------------------------------------------------------->

1.Root Class:------------------> The Object class is the parent class of all classes in Java, forming the top of the class hierarchy.
2.Default Methods:-------------> It provides fundamental methods like equals(),hashCode(),toString(), and getClass() that can be overridden by subclass.
3.String Representation:-------> The toString() method returns a string representation of the object, often overridden for more informative output.
4.Definition:------------------> A Java object is an instance of a class. It represents a specific realization of the class blueprint, with its own unique set of data values for the fields defined in the class.
                                 Objects are created using the new keyword followed by the class name, along with any required arguments to initialize the object’s state.
                                 Objects encapsulate both data (fields) and behavior (methods) into a single unit. They can interact with each other by invoking methods and accessing fields.

5.An object consists of:-------> 1 State: It is represented by attributes of an object. It also reflects the properties of an object.
                                 2 Behavior: It is represented by the methods of an object. It also reflects the response of an object with other objects.
                                 3 Identity: It gives a unique name to an object and enables one object to interact with other objects.

6.Syntax of an object:---------> ClassName objectName = new ClassName();
7.Example of an object:--------> Car myCar = new Car();

8.Initializing an object:------> In Java, we can initialize objects in 3 ways---
                                 1.By reference variable: Initialization of an object means storing the data in the object
                                 2.By method: Methods can be defined to initialize object characteristics after creation, enabling more complicated initialization scenarios.
                                 3.By constructor: Constructors are special methods used to initialize objects; they share the same name as the class. Perfect for initializing object attribute values upon creation.


 */