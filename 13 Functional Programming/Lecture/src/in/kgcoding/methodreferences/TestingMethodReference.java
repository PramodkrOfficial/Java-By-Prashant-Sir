package in.kgcoding.methodreferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        newSum2 = numbers.stream()
                .reduce(0, (Integer::sum));
        System.out.printf("\nSum2 using reduce is %d",newSum2);

    }
}




/*
<-------------------------------------------------------------{'Using "Method References" in deep learning'}---------------------------------------------------------------------------------------->

1. Purpose Syntax & Usage:------> Used a method reference is described using :: (double colon) syntax. For example, 'System.out::println' refers to the 'println method' of the 'System.out' object.
2. Functional Interfaces:-------> They are used with functional interfaces.
3. Benefit:---------------------> They make your code more readable and concise.
4. Limitation:------------------> They can only be used for methods that fit the parameters and return type.




<-------------------------------------------------{'Using "Syntax of Method References" in deep learning'}------------------------------------------------------------->

1. Static Method References:----------------> ClassName::staticMethodName
2. Instance Method:-------------------------> instance::instanceMethodName
3. Instance Method Particular Class:--------> ClassName::methodName
4. Constructor References:------------------> ClassName::new

 */