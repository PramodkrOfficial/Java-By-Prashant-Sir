package in.kgcoding.multithreading.join;

import in.kgcoding.multithreading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');


        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 started");

        Thread t2 = new Thread(p2);
        t2.start();
        t1.join();
        System.out.println("\n Thread 2 started");

        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d ", Thread.currentThread().getName(),
                (endTime - startTime));
    }
}


/*
<--------------------------------------------------------------------------{"Using 'Join Method' in deep learning"}----------------------------------------------------------------------------------------------->

1. Purpose of join:---------------> The join method is used to make the calling thread wait until the thread on which join has been called completes its execution.
2. Synchronization of threads:----> join helps in synchronizing multiple threads, ensuring that a thread completes its execution before the next steps in the calling thread proceed.
3. Overloaded Versions:-----------> join comes in three versions:------> 1 join():-----------------------------> Waits indefinitely until the thread on which it's called finishes.
                                                                         2 join(long millis):------------------> Waits for the thread to die for the specified milliseconds.
                                                                         3 join(long millis, int nanos):-------> Waits for the thread to die for the specified milliseconds plus nanoseconds.

4. Thread1.join(): Main Thread will stop execution at this point and wait for Thread 1 to complete.
5. Thread2.join(): Main Thread will stop execution at this point and wait for thread 2 to complete.


 */