package in.kgcoding.lambda;

public class LambdaExpression {
    public static void main(String[] args) {

        /*
             // Simple Addition:
            (int a, int b) -> a + b;

            // Check if a Number is Even:
            (int number) -> number % 2 == 0;

            // Print a Message:
            (String message) -> System.out.println(message);

            // Sort a List of Strings by Length:
            (String s1, String s2) -> s1.length() - s2.length();

            // Runnable with Lambda (No Parameters):
            () -> System.out.println("Hello, World!");

         */

    }
}



/*

<-------------------------------------------------{'Using "Lambda Expression" in deep learning'}------------------------------------------------------------------->

1. Shortcuts:------------------> Lambda expressions are quick, nameless functions for small tasks.
2. Syntax:---------------------> Written as (parameters) -> {body}, linking inputs to actions.
3. Functional Interfaces:------> They work with interfaces that have only one method, making code concise.
4. Readability:----------------> They make code shorter and clearer, especially with collections.
5. Useful with Collections:----> Great for managing lists and sets, like filtering or sorting.




<-------------------------------------------------{'Using "Lambda Syntax" in deep learning'}------------------------------------------------------------------->

1. No arguments:--------------------> () -> System.out.println("Hello")

2. One argument:--------------------> s -> System.out.println(s)

3. Two arguments:-------------------> (x, y) ->  x + y

4. With explicit argument types:----> (Integer x, Integer y)  ->  x  + y

5. Multiple statements:-------------> (x, y)  ->  {
                                           System.out.println(x);
                                           System.out.println(y);
                                           return (x + y);
                                       }
 */
