package in.kgcoding.executorservice.executor;

public class ExecutorService implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d:%c ",i, targetChar);
        }
        System.out.printf("\n%c Task Done\n", targetChar);
    }

    private  final  char targetChar;

    public ExecutorService(char targetChar) {
        this.targetChar = targetChar;
    }
}






/*
<--------------------------------------------------------------------------{"Using 'Executor Service' in deep learning"}----------------------------------------------------------------------------------------------->

1. Purpose:------------------> ExecutorService is a framework provided by the java Concurrency API to manage and execute submitted tasks without the need to manually manage thread life cycles.
2. Thread Pool Management:---> ExecutorService efficiently reuses a fixed pool of threads to execute tasks, thereby improving performance by reducing the overhead of thread creation, especially for short-lived asynchronous tasks.



 */