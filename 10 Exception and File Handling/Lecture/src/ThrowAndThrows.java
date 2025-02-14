public class ThrowAndThrows {

    public void printName(String name) throws IllegalArgumentException {
        if (name.contains("checked.")) {
            throw new IllegalArgumentException("Name contains restricted word '-'.");
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThrowAndThrows obj = new ThrowAndThrows();

        try {
            obj.printName("checked.name");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }


}


/*
<-------------------------------------------------------------{"Using 'ThrowAndThrows' keyword in deep"}---------------------------------------------------------------------------------->

<--------------------------Throws Keyword------------------------------>
1. Declares that a method may throw one or more exceptions.
2. Used in the method signature to indicate that the method might throw exceptions to specified types.
3. A method declared with throws requires the calling method to handle or further declare the exception.




<------------------Structure code of Throws Keyword-------------------->

            void teachClass() throws BookNotFoundException {
                    boolean bookFound = locateBook();

                    if (!bookFound)
                        throw new BookNotFoundException();
                    else {
                        readBook();
                        explainContents();
                    }
                }


<---------------------------Throw Keyword------------------------------>
1. Used to explicitly throw an exception from any method or block of code.
2. You can throw either a new instance of an exception or an existing exception object using throw.
3. Example: throw new ArithmeticException("Division by zero");



                        Exception Occurred:

                        FirstMethod()

                        SecondMethod()

                        ThirdMethod()

                        Main()

                        call Stack


<-------------------------------------------------------------{"Using differentiate b/w 'ThrowAndThrows' keyword in deep"}---------------------------------------------------------------------------------->

                     throw                                                                                            throws

Java throw keyword is used to explicitly throw an exception.                                   Java throws keyword is used to declare an exception.
Checked exception cannot be propagated using throw.                                            Checked exception can be propagated with throws.
If we see syntax wise, throw is followed by an instanceof Exception class.                     If we see syntax wise, throws is followed by exception class names.
Example: throw new NumberFormatException ("The month entered, is invalid.");                   Example: throws IOException, SQLException
The keyword throw is used inside method body.                                                  throws clause is used in method declaration (signature)
By using throw keyword in java you can not throw than one exception.                           By using throws you can declare multiple exceptions.
Example: throw new IOException("Connection failed!!");                                         Example: public void method() throws IOException,SQLException.





 */
