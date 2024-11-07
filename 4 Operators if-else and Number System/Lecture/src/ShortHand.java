import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);

//        <------Addition-------->
        int x1 = input.nextInt();
//        a = a + x1;
        a += x1;
        System.out.println(a);
        int x2 = input.nextInt();
//        a = a + x2;
        a += x2;
        System.out.println(a);

//        <------Subtraction-------->
        int x3= input.nextInt();
//        a = a - x3;
        a -= x3;
        System.out.println(a);

//        <------Multiplication-------->
        int x4 = input.nextInt();
//        a = a * x4;
        a *= x4;
        System.out.println(a);

//        <------Division-------->
        int x5 = input.nextInt();
//        a = a / x5;
        a /= x5;
        System.out.println(a);

//        <------Modulation-------->
        int x6 = input.nextInt();
        a = a % x6;
        a %= x6;
        System.out.println(a);

    }
}
