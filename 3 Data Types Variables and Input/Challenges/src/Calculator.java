import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Our Calculator");
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your numbers are: " + sum);

        System.out.print("Enter the first number: ");
        int firsNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secoNum = input.nextInt();
        int sub = firsNum - secoNum;
        System.out.println("Sub of your numbers are: " + sub);

        System.out.print("Enter the first number: ");
        int firsNumb = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secoNumb = input.nextInt();
        int mul = firsNumb * secoNumb;
        System.out.println("Mul of your numbers are: " + mul);

        System.out.print("Enter the first number: ");
        int fNumb = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int sNumb = input.nextInt();
        int div = fNumb / sNumb;
        System.out.print("Div of your numbers are: " + div);
    }
}
