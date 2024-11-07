import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter\n");
        System.out.print("please enter your temp in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

//        <---------------- C = (F - 32) * 5 / 9  {Formula}---------------->

//        float celsius = (fahrenheit - 32) * 5 / 9;
        float celsius = (fahrenheit - 32) * 5.0f / 9.0f;

        System.out.println("Your temperature is: " + celsius + "C");
    }
}
