public class Driver {

    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {

        /*
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
         */
        Car bugadi  = new Car("Red");
        Car mahindra = new Car();
//        bugadi.addFuel(6);
        Car startedCar = bugadi.start();
        bugadi.start().drive();
        mahindra.start().drive();
        System.out.println(bugadi.color);
        System.out.println(mahindra.color);
//        startedCar.drive();


//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/jan/2024";
//        System.out.println(Driver.minAgeForDriving);
    }
}


/*
<--------------------------- Using for "static" keyword ---------------------------------->

Static Variables: Belong to the class, not individual instances. Shared among all instances of the class.
Static Methods: Can be called without creating an object of the class. Can only directly access static variables and other static methods.
No Access to Non-Static Members: Static methods and blocks cannot directly access non-static members (variables and methods) of the class.
 */

/*
<--------------------------- Using for "Constructors" keyword ---------------------------------->

Purpose: Constructors initialize new objects and set initial states for the object's attributes.
Naming: A Constructor must have the same name as the class in which it is declared.
No Return Type: Constructors don't have a return type, not even void.
Automatic Calls: A constructor can be automatically called when a --------of a class is created.
Definition: A Constructor is a special initialization function that is automatically called whenever a class is declared.
Default Constructor: A Constructor with no parameters is known as a default Constructor.
Static Constructor: Static Constructors are called automatically before any static fields are accessed.
Constructors used to set initial values for the instance variables of the class.

<--------------------------- Using for "Type of Constructors" keyword ---------------------------------->

Default Constructor: A Constructor is called "Default Constructor" when it doesn't have any parameter.
{"if no constructor is explicitly defined, java provides a default constructor that initializes all member variables to default values."}
Parameterized Constructor: A Constructor which has a specific number of parameters is called a parameterized Constructor.
{"Constructors can have parameters to pass values when creating an object, allowing for different creations."}
Copy Constructor: Copy Constructor is passed with another object which copies the data available from the passed object to the newly created object.
Super Constructor: Super Constructor in Java is a particular type of constructor that allows the subclass to invoke the Superclass constructor.
It is used when an object is being inherited from another class, and its subclasses need additional values that are specific to itself.
Super Constructor can be used to create a thing of the Superclass with a set of parameters different from those specified in its Superclass by calling it Super().
Super Constructor is useful for assigning different values to instance variables of Superclass, which may be required during subclass initialization.


<--------------------------- Using for "Constructors (Chaining)" keyword ---------------------------------->

Within Same Class:- Using this() keyword to call another constructor in the same class.
First Statement:- Using this() keyword must be the first statement in a constructor.
No Loop:- Constructor chaining can't form a loop: it must have a termination point.
Constructors can use the this() keyword to invoke other constructors within the same class. Constructor chaining is the term for this technique, which promotes code reuse.


<--------------------------- Using for "Code Blocks{}" keyword ---------------------------------->
Scope: Code blocks {} determine the scope of variables.
Local Variables: Variables inside a block are not accessible outside it.
Initialization Block: Blocks without static run each time an instance is created.
Static Block: Blocks with static run once when the class is loaded.




 */











