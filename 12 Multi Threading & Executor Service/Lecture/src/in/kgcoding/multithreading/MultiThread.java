package in.kgcoding.multithreading;

public class MultiThread {
    public static void main(String[] args) {

        // creating runnable task
        Runnable task1 = new NumberPrinter();
        Runnable task2 = new LetterPrinter();

        // creating threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // starts threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Both task completed.");
    }
}


// Task 1: Print numbers from 1 to 5
class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("NumberPrinter interrupted.");
            }
        }
    }
}

// Task 2: Print letters A to E
class LetterPrinter implements Runnable {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("LetterPrinter interrupted.");
            }
        }
    }
}


/*
<----------------------------------------------------------{"Using 'MultiThread Method' in deep learning"}----------------------------------------------------------------------->

1. Thread: A thread in Java is a small part of a program that can run at the same time as other parts.
2. Purpose: Threads help a program do many things at once, like handling many users or doing different tasks simultaneously.
3. Creating Threads: You can make a thread by using the Thread class or the Runnable interface.
4. Using Threads: Use threads for tasks that can happen at the same time, like managing many requests or splitting up a big job.
5. Thread Talk: Threads can talk to each other using wait(), notify(), and notifyAll() to coordinate their work.


 */
