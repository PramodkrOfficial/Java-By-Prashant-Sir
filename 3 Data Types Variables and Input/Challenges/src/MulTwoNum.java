import java.util.Scanner;

public class MulTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firsNumb = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secoNumb = input.nextInt();
        int mul = firsNumb * secoNumb;
        System.out.println("Mul of your numbers are: " + mul);
    }
}
