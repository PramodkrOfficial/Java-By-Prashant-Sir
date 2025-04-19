package in.kgcoding.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = 55;         // AutoBoxing
        System.out.println(first);
        int second = first;        // Unboxing

    }
}






/*
<----------------------------------------------------------{"Using 'Wrapper classes' in deep learning"}--------------------------------------------------------------------->

1. Provide a way to use primitive data types (lint, char, boolean, etc.) as objects.
2. Automatic conversion between the primitive types and their corresponding wrapper classes.
3. Once created, the value of a wrapper object cannot be changed.
4. Utility Methods: Each wrapper class provides useful methods, like compareTO, valueOf, and parseXXX(e.g. parseInt for Integer).
5. Required for storing primitives in collection objects like ArrayList, HashMap, etc.
6. Allows assignment of null to primitive values when needed.


 */