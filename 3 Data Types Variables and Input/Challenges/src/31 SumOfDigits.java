import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SumOfDigits\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = SumOfDigits(num);
        System.out.println("Sum of Digits is: " + sum);
    }

    public static int SumOfDigits (int num) {
        int sum = 0;
        while (num > 0) {
//            sum = sum + num % 10;
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
