import java.beans.Expression;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int num2 = input.nextInt();

        /*
        <-------------------- Simple Method -------------------->
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest number");
        } else {
            System.out.println(num2 + " is the greatest number");
        }

        <---------------- Professional Method ------------------>
        int greaterNumber;
        if (num1 > num2) {
            greaterNumber = num1;
        } else {
             greaterNumber = num2;
        }
        System.out.println(greaterNumber + " is the greatest number");



        <---------------- Ternary Operator Method -------------->

        variable = Expression1 ? Expression2 : Expression3 (Formula)

        Syntax: condition ? expression1 : expression2
        Condition: Boolean expression, evaluates to true or false.
        Expressions: Both expressions must return compatible types.
        Use Case: Suitable for simple conditional assignments.
        Readability: Good for simple conditions, but can reduce clarity in overused.

        */

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number");
    }
}



