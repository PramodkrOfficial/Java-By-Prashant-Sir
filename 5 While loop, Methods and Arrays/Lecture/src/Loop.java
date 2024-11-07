import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*
        int num = 1;                    // initialization
        while ( num <= 100){            // condition
            System.out.println(num);    // actual work
            num = num + 1;              // updating the condition
        }
         */

        int count = 500;
        while (count >= 200){
        System.out.println(count);
        count -= 1;
        }


        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }
    }
}



/*
Loop :  Code that runs multiple times based on a condition.
        Repeated execution of code.
        Loops automate repetitive tasks.
        Types of loops : for, while, do while.
        Other loops : nested, infinite, counting.
 */


/*
        While Loop : Repeating a block of code while a condition is true.
                     Used for non-standard conditions.
        Iterations : Number of times the loop runs.
        Remember   : Always include an update to avoid infinite loops.
 */



