import java.util.Scanner;

public class ArithmeticCal {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic Calculator\n");
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mul = firstNum * secondNum;
        int div = firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);
//         int x = 8;
//         int y = 4;
//        System.out.println(firstNum + secondNum);
//        System.out.println(firstNum - secondNum);
//        System.out.println(firstNum * secondNum);
//        System.out.println(firstNum / secondNum);
//        System.out.print(firstNum % secondNum);

    }
}
