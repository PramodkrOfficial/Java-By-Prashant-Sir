public class FinallyBlock {
    public static void main(String[] args) {
        try {
            try {
                int result  = 1 / 0;
            }catch (ArithmeticException e) {
                System.out.println("Something caught");
            }finally {
                System.out.println("Not quite finally");
            }
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }finally {
            System.out.println("Finally");
        }
    }
}


/*
<-------------------------------------------------------------{"Using 'FinallyBlock' keyword in deep"}---------------------------------------------------------------------------------->

1. Executes code after the try-catch blocks, used mainly for cleanup operations.
2. Always runs regardless of whether an exception is thrown or caught in the try-catch blocks.
3. Ideal for closing resources like files or database connections to prevent resource leaks.




 */




//public class FinallyBlock {
//    public static void main(String[] args) {
//        try {
//            try {
//                int result = 1 / 0;  // This will throw ArithmeticException
//            } catch (ArithmeticException e) {  // Fix: Catch ArithmeticException
//                System.out.println("Inner catch: ArithmeticException caught");
//            } finally {
//                System.out.println("Inner finally: Not quite finally");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Outer catch: ArithmeticException caught");
//        } finally {
//            System.out.println("Outer finally: Finally");
//        }
//    }
//}
