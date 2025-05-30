package in.kgcoding.executorservice.executor.singlethread;

import in.kgcoding.multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingSingleThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        PrintTask task2 = new PrintTask('$');
        PrintTask task1 = new PrintTask('*');
        PrintTask task3 = new PrintTask('#');




        service.submit(task1);
        service.submit(task2);
        service.submit(task3);


        service.shutdown();

//        service.awaitTermination(10, TimeUnit.SECONDS);
    }
}
