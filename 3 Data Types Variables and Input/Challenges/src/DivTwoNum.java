import java.util.Scanner;

public class DivTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int fNumb = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int sNumb = input.nextInt();
        int div = fNumb / sNumb;
        System.out.print("Div of your numbers are: " + div);
    }
}
