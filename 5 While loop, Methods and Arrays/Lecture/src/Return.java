import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber() + 1;
        int second = readNumber() + 2;

        int sum = first + second;
        System.out.println("Sum of the numbers are: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;

    }

    public static void greet(){
        System.out.println("Welcome to Calculator\n");

    }


}
