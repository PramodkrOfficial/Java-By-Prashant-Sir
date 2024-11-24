import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);
    }
    public static void oldSwitch(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.print("Invalid day");
        }

    }

    public static void newSwitch(int day) {

        String dayStr = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7,8 -> "Holiday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }
}

/*
<--------------------------- Switch Operator Method ------------------------->

Multiple Cases:-----> Handles multiple values for an expression efficiently.
Supported Types:----> Accepts byte, short, char, int, String, enums, and from Java 14, long, float, double.
Case Labels:--------> Each case end with a colon(:) and is followed by code.
Break Statement:----> Typically used to prevent fall-through b/w cases.
Default Case:-------> Executes if no case matches; optional and doesn't require break.
Type Safety:--------> Case label types must the switch expression's type.

            <-------------{'Additional uses'}-------------->
Enhanced Switch: Java 12 introduced enhancements like yield and multiple constants per case.
Switch Expression: From Java 14, switch can return a value using "yield".



 */
