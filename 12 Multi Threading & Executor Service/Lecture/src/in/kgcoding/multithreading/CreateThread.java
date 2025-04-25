package in.kgcoding.multithreading;

// Step 1: Define a class that extends Thread
public class CreateThread extends Thread {

    public static void main(String[] args) {
        //Step 3: Create an Instance of Your Class
        CreateThread t1 = new CreateThread('*');
        t1.start();    // start the first thread

        CreateThread t2 = new CreateThread('$');
        t2.start();    // start the second thread

    }

    // Step 2: Override the run() Method
    @Override
    public void run() {
        //First Task
        for (int i = 0; i <= 1000 ; i++) {
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n %c Task Done\n", targetChar);
    }

    private final char targetChar;
    public CreateThread(char targetChar) {
        this.targetChar = targetChar;
    }
}



/*
<----------------------------------------------------------{"Using 'MultiThread Method' in deep learning"}----------------------------------------------------------------------->

1. In the main method, two threads(t1, t2) are created and started.
2. They will execute independently and print their values.


 */




