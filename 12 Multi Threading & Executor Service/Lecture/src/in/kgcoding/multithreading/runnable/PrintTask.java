package in.kgcoding.multithreading.runnable;

public class PrintTask implements Runnable{

    @Override
    public void run() {
        // Print Task
        for (int i = 0; i <= 100 ; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.printf("%d %c ", i, targetChar);
        }
        System.out.printf("\n %s %c* task complete", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
