import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Calculator\n");
        System.out.print("Please enter your Age: ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("You are a senior citizen");
        } else if (age >= 20) {
            System.out.println("you are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }
    }
}
