package in.kgcoding.abstraction;

public class Interfaces {

}


/*
<--------------------------------------------------------------{"Using 'Interfaces'  in deep"}----------------------------------------------------------------------->

1. Interfaces primarily declare abstract methods for implementation by classes.
2. A class can implement multiple interfaces, allowing for more flexible designs.
3. Interfaces can have default methods with implementation and static methods.
4. Interface methods are inherently public and abstract, except for default and static methods.


5. Definition:-------------------> In Java, an interface is a blueprint of a class. It defines a set of abstract methods that a class must implement.
                                   Interfaces provide a way to achieve abstraction and multiple inheritance in Java.
6.Key Features of Interfaces----->
                                   1.Abstract Methods: All methods declared in an interface are implicitly abstract.
                                                     They have no method body.
                                                     Subclasses must provide implementations for these methods.
                                   Example:
                                              interface Example {
                                                 void display(); // Implicitly public and abstract
                                              }

                                   2.Constants: Variables declared in an interface are implicitly public, static, and final.
                                                They can only hold constant values.
                                                All variables declared in an interface are implicitly public, static, and final.
                                   Example:
                                              interface Example {
                                                  int VALUE = 100; // Implicitly public, static, and final
                                              }

                                   3.Default and Static Methods (Java 8): Default methods allow adding methods with a body in interfaces.
                                                                          Static methods are also allowed in interfaces for utility purposes.
                                   Example:
                                            interface Example {
                                                default void defaultMethod() {
                                                    System.out.println("Default method in interface");
                                                }

                                                static void staticMethod() {
                                                    System.out.println("Static method in interface");
                                                }
                                            }

                                   4.Private Methods (Java 9): Interfaces can have private methods to provide shared functionality to default or static methods within the interface.
                                   Example:
                                             interface Example {
                                                private void helperMethod() {
                                                    System.out.println("Private method in interface");
                                                }
                                             }

                                   5.No Constructors: Interfaces cannot have constructors since they cannot be instantiated.

                                   6.Multiple Inheritance: A class can implement multiple interfaces, overcoming the limitation of single inheritance in Java.
                                   Example:
                                             interface A {
                                                 void methodA();
                                              }
                                              interface B {
                                                 void methodB();
                                              }
                                              class C implements A, B {
                                                 public void methodA() { System.out.println("Method A"); }
                                                 public void methodB() { System.out.println("Method B"); }
                                              }

5. Advantages of Interfaces------>
                                    Abstraction:
                                    Interfaces allow the separation of "what to do" from "how to do it."

                                    Multiple Inheritance:
                                    A class can implement multiple interfaces, enabling a form of multiple inheritance.

                                    Loose Coupling:
                                    By programming to an interface, you reduce dependencies between different parts of a program.

                                    Polymorphism:
                                    An interface reference can point to objects of any class that implements the interface.





 */