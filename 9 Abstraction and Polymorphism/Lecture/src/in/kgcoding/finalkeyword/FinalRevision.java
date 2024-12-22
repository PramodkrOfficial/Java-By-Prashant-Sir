package in.kgcoding.finalkeyword;


// Using final with a variable
class FinalExample {
    // final variable
    final int MAX_VALUE = 100;

    // final method
    final void displayMessage() {
        System.out.println("This is a final method.");
    }
}

// Subclass attempting to override a final method
class Subclass extends FinalExample {
    // Uncommenting this will cause a compile-time error
    // void displayMessage() {
    //     System.out.println("Cannot override a final method.");
    // }
}

// Using final with a class
final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class, cannot be extended.");
    }
}

// Uncommenting this will cause a compile-time error
// class SubClassOfFinalClass extends FinalClass {}

public class FinalRevision {
    public static void main(String[] args) {
        // Example of final variable
        FinalExample obj = new FinalExample();
        System.out.println("The final variable MAX_VALUE: " + obj.MAX_VALUE);

        // Trying to modify MAX_VALUE will cause an error
        // obj.MAX_VALUE = 200; // Error: Cannot assign a value to a final variable

        // Accessing a final method
        obj.displayMessage();
    }
}





/*
<------------------------------------------------------------------{"Using 'Final Keyword' in deep"}------------------------------------------------------------------>



Final Variable--------------------------------------------->      To create constant variables

Final Methods---------------------------------------------->      To prevent method overriding

Final Classes---------------------------------------------->      To prevent inheritance



1.Immutable:-----------> Variable becomes a constant, meaning its value cannot be changed once initialized.
2.Method:--------------> A final method cannot be overridden by subclass.
3.Class:---------------> A final class cannot be subclassed, securing the class from being extended.
4.Efficiency:----------> Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.
5.Null Safety:---------> A final variable must be initialized before the constructor completes reducing null pointer errors.
6.Immutable Objects:---> Helps in creating immutable objects in combination with private fields and no setter methods.

*/