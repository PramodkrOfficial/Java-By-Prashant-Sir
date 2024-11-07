import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Our Perimeter Calculator: ");
        System.out.println("Please enter all 4 sides in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

//        <-----------------Perimeter of rectangle ABCD = A+B+C+D  {Formula}---------------->

        double perimeter = a+b+c+d;
        System.out.println("Perimeter of your rectangle is: " + perimeter + "cm");
    }
}
