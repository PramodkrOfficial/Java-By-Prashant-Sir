import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Do-While Checker\n");
//        System.out.print("Please enter your age: ");
//        int age = input.nextInt();
//
//        while (age < 0 || age > 100) {
//            System.out.println("Please enter your age: ");
//            age = input.nextInt();
//        }
//        System.out.println("Your age is: " + age);

//<---------------------------{Using for "Do-While Loop"}------------------------------------->
        int age = 0;
        do {
            System.out.print("Please enter your age: ");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is: " + age);

    }
}

/*
<---------------------------{Rules for "Do-While Loop"}------------------------------------->
            do {
                body of the loop
            }
            while (condition);
Executes block first, then checks condition.
Guaranteed to run at least one iteration.
Unlike while, first iteration is unconditional.
Don't forget to update condition to avoid infinite loops.
*/
