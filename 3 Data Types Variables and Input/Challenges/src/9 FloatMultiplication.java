import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.print("Please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.print("Now, please enter second decimal number: ");
        double second = input.nextDouble();

//       <----------- Beginner way of coding style ---------->
//        double add = first + second;
//        double sub = first - second;
//        double mul = first * second;
//        double div = first / second;
//
//        System.out.println("\n Result Add is: " + add);
//        System.out.println("\n Result Sub is: " + sub);
//        System.out.println("\n Result Mul is: " + mul);
//        System.out.println("\n Result Div is: " + div);

//       <-------------- Professional way of coding style ------------->
        System.out.println("\n Result Add is: " + (first + second));
        System.out.println("\n Result Sub is: " + (first - second));
        System.out.println("\n Result Mul is: " + (first * second));
        System.out.println("\n Result Div is: " + (first / second));


    }
}
