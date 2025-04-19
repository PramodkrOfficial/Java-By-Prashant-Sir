public class VarArgs {
    public static void main(String[] args) {
        printMany("one", "two","three");
        System.out.println();
        printMany("one", "two");
        System.out.println();
        printMany();
        System.out.println();
        printMany(new String[]{"one","two", "three"});
    }

    static void printMany (String...elements) {
        for (String element : elements) {
            System.out.println(element);
        }
    }
}


/*
<--------------------------------------------------------{"Using 'Variable Arguments' in deep learning"}------------------------------------------------------------->

1. Java's varargs allow methods to accept any number of arguments.
2. Declared using an ellipsis (...), e.g, void method(int... numbers).
3.Internal Handling: Treated as arrays, e.g, int... numbers is int[] numbers.
4. Placement: Must be the last in the method's parameters.
5. Usage: Call with varying argument counts, e.g, method (1,2) or method().
6. Introduced in Java 5.

 */