import org.w3c.dom.ls.LSOutput;

public class BreakAndContinue {
    public static void main(String[] args) {

        breakRule();
        continueRule();
    }

    public static void breakRule() {
        System.out.println("This is a Break statement");
        for (int i = 1; i < 1000; i++) {
            if (i == 101) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
        System.out.println();

    }

    public static void continueRule () {
        System.out.println("This is a Continue statement");
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");

    }
}

/*
<------------------------------{"Using for  Break & Continue"}-------------------------------->
 1. Break lets you stop a loop early, or break out of a loop.
 2. Continue is used to skip one iteration or the current iteration.
 3. In while loop remember to do the increment manually before using continue.

 */


