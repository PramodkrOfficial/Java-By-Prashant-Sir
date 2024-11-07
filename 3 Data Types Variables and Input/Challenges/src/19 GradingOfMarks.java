import java.util.Scanner;

public class GradingOfMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator\n");
        System.out.print("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 80) {
            System.out.println("Great, You have got A Grade");
        } else if (percentage >= 70) {
            System.out.println("Nice, You have got B Grade");
        } else if (percentage >= 50){
            System.out.println("Good, You have got C Grade, work harder next time");
        } else if (percentage >= 30) {
            System.out.println("You have got D grade, You seriously need to work harder");
        } else {
            System.out.println("Sorry, You have failed the test and got a F grade");
        }
    }
}
