import java.util.Scanner;

public class SubTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Our Calculator");
        System.out.print("Enter the first number: ");
        int firsNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secoNum = input.nextInt();
        int sub = firsNum - secoNum;
        System.out.println("Sub of your numbers are: " + sub);
    }
}
