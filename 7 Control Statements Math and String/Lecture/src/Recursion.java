import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial generator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorialIterative(num);
        long fact2 = factorial(num);
        System.out.println("Factorial of your number is: " + fact);
        System.out.println("Factorial of your number is: " + fact2);
    }

    public static long factorial(int num) {
        System.out.println("Function called for: " + num);
        if (num ==1) {
            return 1;
        }
        return num * factorial(num -1);
    }

    public  static long factorialIterative(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;

    }
}



/*
<--------------------------------------------------{" Using for Recursion "}-------------------------------------------------->

1. Self-Calling Function:-------> Recursion is when a function calls itself.
2. Base Case:-------------------> Essential to stop recursion and prevent infinite loops.
3. Recursive Case:--------------> The part where the function makes a recursive call.
4. Stack Overflow Risk:---------> Excessive recursion can cause stack overflow errors.
5. Problem Solving:-------------> Ideal for problems divisible into similar, smaller problems.

Definition:---------------------> Recursion is the process where a function self-calls itself to find the result.
                                  The base condition acts as the breakpoint to the self-calling process.
                                  Recursion provides a clean and simple way to write code.Some problems are inherently
                                  recursive like tree traversals, Tower of Hanoi, etc.

Example:------------------------> 1. Print a series of numbers with recursive Java methods.
                                  2. Sum a series of numbers with Java recursion.
                                  3. Calculate a factorial in Java with recursion.
                                  4. Print the Fibonacci series with Java and recursion.
                                  5. A recursive Java palindrome checker.


 */

