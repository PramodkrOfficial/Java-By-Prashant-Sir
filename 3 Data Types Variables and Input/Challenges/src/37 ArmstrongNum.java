import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
//        System.out.println("Here your Armstrong number");
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrong (int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
//        System.out.println("No of Digit: " + noOfDigits);
        int finalNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNum += pow(lastDigit, noOfDigits);
        }
//        System.out.println("Final number is: " + finalNum);
        return finalNum == numCopy;
    }
    public static int pow (int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
//        System.out.println("Pow of " + num1 + " is " + result);
        return result;
    }

    public static int noOfDigits (int num) {
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }

        return digits;
    }
}
