package in.kgcoding.multithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);  //setting priority to 1
        t2.setPriority(Thread.MAX_PRIORITY);  // setting priority to 10

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        //start threads
        t1.start();
        t2.start();
    }
}

class  MyThread extends Thread {

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Running thread name: %s\n",current.getName());
        System.out.printf("Running thread priority: %s\n",current.getPriority());
    }
}



/*
<----------------------------------------------------------{"Using 'MultiThread Method' in deep learning"}----------------------------------------------------------------------->
1. Priority Levels: Java threads have priority levels from 1 (lowest) to 10 (highest), with a default value of 5.
2. Influence on Execution: A threads priority suggests the importance of a thread to the scheduler, through it doesn't guarantee the order of execution.
3. Set and Get Priority: Use setPriority (int) to change a thread's priority and getPriority to retrieve it.




 */