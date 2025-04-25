package in.kgcoding.multithreading;


public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        //First task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * Task Completed");

        //Second task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ Task Completed");

        //Third task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # Task Completed");

        long endTime  = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime));
    }
}


/*
<--------------------------------------------{"Using 'Need of Multi-Threading' in deep learning"}------------------------------------------------------->

1. Tasks might be very important.
2. Tasks are independent of each other.
3. A Multi-core CPU is sitting idle most of the time.
4. A big task can be divided into smaller parts.
5. Making your code responsive.


 */