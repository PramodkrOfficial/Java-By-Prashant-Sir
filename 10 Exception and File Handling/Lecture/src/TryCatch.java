
import java.lang.Exception;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int result = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your first num: ");
            int num = sc.nextInt();
            System.out.println("Enter your second num: ");
            int num2 = sc.nextInt();
            result = num / num2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index exception: " + e.getMessage());
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Multiple exceptions" + result);
        } catch (java.lang.Exception e) {
            System.out.println("Last exception");
        }
    }
}




/*
<-------------------------------------------------------------{"Using 'Try and Catch' method in deep"}---------------------------------------------------------------------------------->


1.Try Block:-------> Contains code that is susceptible to exceptions.
2.Catch Block:-----> Follows the try block and handles the exceptions thrown by the try block.
3.Catch Block:-----> When an exception occurs in the try block, the control is transferred to catch block, where the exception is handled.



*/

