import java.util.Scanner;

public class TriAngleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator\n");
        System.out.print("Please enter your base in cmsS: ");
        double base = input.nextDouble();
        System.out.print("Now enter your perpendicular height in cms: ");
        double height = input.nextDouble();

//        <-----------------Area of TriAngle = (B * H)/2  {Formula}---------------->

        double area = (base * height) / 2;
//        double area = 0.5 * base * height;
        System.out.println("The area of your triangle is: " + area + "cms2");

    }
}
