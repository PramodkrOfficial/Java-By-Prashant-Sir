import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.print("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, Tell me your rate of interest: ");
        float rate  = input.nextFloat();
        System.out.print("Now tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();

//        <-----------------Simple Interest = (P * T * R)/100  {Formula}---------------->
        float interest = (principle * rate * years) / 100;
        System.out.println("\n\n Your Simple interest is Rs: " + interest);
    }
}
