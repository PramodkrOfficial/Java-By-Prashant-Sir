public class Parameter {
    public static void main(String[] args) {

//        int num = sumTwoNumbers(4,7);
//        System.out.println("num");
        System.out.println(sumTwoNumbers(12, 3));
        System.out.println(sumTwoNumbers(6, 7));
        System.out.println(sumTwoNumbers(5, 9));
        System.out.println(sumTwoNumbers(-67, 67));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println("First number received: " + firstNum);
        System.out.println("Second number received: " + secondNum);
         return firstNum + secondNum;
//        int sum  = firstNum + secondNum;
//        return sum;
    }
}


