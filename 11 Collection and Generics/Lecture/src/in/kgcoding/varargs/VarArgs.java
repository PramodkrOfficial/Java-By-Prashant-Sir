package in.kgcoding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(10,5));
//        System.out.println(sum(new int[]{4,5}));
        System.out.println(sum(4,5,6,3,2));
        System.out.println(sum(2,3,5,6,7));
    }

    public static int sum (int first, int second, int... a) {
        int sum  = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }


//    public static int sum (int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum (int a, int b) {
        return a+b;
    }
}




/*
<------------------------------------------{"Variable Arguments in deep learning"}------------------------------------------------------------->




 */