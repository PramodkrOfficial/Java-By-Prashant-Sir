import java.util.Scanner;

public class LCM {

//         <-------------{ LCM : Least Common Multiple } ------------>

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of the two numbers is: " + lcm);

    }

    public static int lcm (int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
