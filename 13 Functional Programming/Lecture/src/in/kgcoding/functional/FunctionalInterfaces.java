package in.kgcoding.functional;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x ->  x > 0;
        // Output: true

        System.out.println(isPositive.test(5));
        // Output: false

        Consumer<String> print = message -> System.out.println(message);
        // Output: Welcome Developer!

        print.accept("Welcome Developer!");

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        // Output: 15

        System.out.println(multiply.apply(3, 5));
    }

}




/*
<---------------------------------------------------------------------------------------{'Using "Functional Interfaces" in deep learning'}-------------------------------------------------------------------------------------------------------->

1. Single Abstract Method (SAM):-------> A functional interface has only one abstract method. However, it can have multiple default or static methods.
2. Lambda Compatibility:---------------> They are intended to be used with lambda expressions, providing a target type for lambdas and method references.
3. @FunctionInterface Annotation:------> While not mandatory, this annotation helps the compiler to identify the intention of making an interface functional and to generate an error if the annotated interface does not satisfy the conditions.
4. Common Examples:--------------------> Predicate, Consumer, BinaryOperator, Runnable, Callable, Comparator, and user-defined interfaces can be functional if they have only one abstract method.

 */