package in.kgcoding.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {

    }
}




/*
<---------------------------------------------------------------{"Using 'Method' / 'Constructor' Overloading"}--------------------------------------------->

1.Definition:---------------> Method overriding occurs when a subclass provides a specific implementation for a method already defined in its superclass.
2.Run-time-Polymorphism:----> Overriding is a basis for runtime polymorphism, where the method call is determined by the object's type at runtime.
3.Superclass Reference:-----> An overridden method can be called through a superclass reference holding a subclass object.
4.Same Signature:-----------> Overridden methods must have the same name, return type and parameters as the method in the parent class.
5.Access Level:-------------> The access level cannot be more restrictive than the overridden method's access level.
6.@Override Annotation:-----> This annotation is optional but helps to ensure that the method is correctly overridden.
7.Definition:---------------> Method overriding is a feature in Java that allows a subclass to provide its specific implementation for a method already defined in its parent class.
                              The overridden method in the child class should have the same name, return type, and parameters as the method in the parent class.



 */