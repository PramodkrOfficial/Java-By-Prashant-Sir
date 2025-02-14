
public class Exception extends Throwable {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}

/*
<-------------------------------------------------------------{"Using 'Exception' method in deep"}---------------------------------------------------------------------------------->

1.Definition:--------------> In Java, an exception is a disruptive event that occurs during the execution of a program, interrupting its normal flow.
                             It's an instance of a problem that arises while the program is running, such as arithmetic errors, null pointer accesses, or resource overflows.
                             Exceptions are objects in java that encapsulate information about an error event, including its type and the state of the program when the error occurred.

2.Definition2:-------------> An exception in Java is an event that occurs during the execution of a program that disrupts its normal flow.
                             Exceptions are used to handle runtime errors, such as division by zero, invalid input, or file not found, in a controlled manner.

3.Types of Exceptions:-----> 3.1 User-Defined Exception:---> A user-defined exception is a custom exception created by extending the Exception or RuntimeException class.
                                                             These exceptions are useful when built-in exceptions are not sufficient for specific application needs.



                             3.2 Built-in Exception:-------> Java provides a set of predefined exception classes that handle different types of errors during program execution.
                                                             These exceptions are part of the java.lang package.

                             3.3 Example of Built-in Exception:----->    Exception	                               Description
                                                                        ArithmeticException	                       Thrown when an arithmetic operation, such as division by zero, occurs.
                                                                        NullPointerException	                   Thrown when an object reference points to null and an operation is performed on it.
                                                                        ArrayIndexOutOfBoundsException	           Thrown when an array index is accessed that is out of bounds.
                                                                        NumberFormatException	                   Thrown when a string cannot be converted to a valid number.
                                                                        IOException	                               Thrown when an input/output operation fails.
                                                                        FileNotFoundException	                   Thrown when an attempt to open a file that does not exist occurs.
                                                                        ClassNotFoundException	                   Thrown when a required class is not found.
                                                                        SQLException	                           Thrown when there is an issue in database operations.


Built-in Exception: 1. Checked Exceptions:-----> These are exceptions that must be either caught or declared in the method.

                    2. Unchecked Exceptions:---> These are exceptions that do not need to be explicitly handled.

                       Checked Exceptions                            Unchecked Exceptions

                       ClassNotFoundException                        ArithmeticException
                       InterruptedException                          ClassCastException
                       IOException                                   NullPointerException
                       InstantiationException                        ArrayIndexOutOfBoundException
                       SQLException                                  ArrayStoreException
                       FileNotFoundException                         IllegalThreadStateException


 */
