package in.kgcoding.multithreading;

public class StateOfThread {
    public static void main(String[] args) {
        ATM sharedATM = new ATM();

        Person user1 = new Person(sharedATM, "Alice");
        Person user2 = new Person(sharedATM, "Bob");

        System.out.println("State of user1: " + user1.getState()); // NEW

        user1.start();
        user2.start();

        try {
            Thread.sleep(100); // Allow threads to start
            System.out.println("State of user1: " + user1.getState()); // RUNNABLE or TIMED_WAITING
            System.out.println("State of user2: " + user2.getState()); // BLOCKED or RUNNABLE
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of user1: " + user1.getState()); // TERMINATED
        System.out.println("State of user2: " + user2.getState()); // TERMINATED
    }
}

class ATM {
    synchronized void useATM(String userName) {
        System.out.println(userName + " is accessing the ATM...");
        try {
            Thread.sleep(3000); // simulate ATM usage time
        } catch (InterruptedException e) {
            System.out.println(userName + " was interrupted.");
        }
        System.out.println(userName + " is done using the ATM.");
    }
}

class Person extends Thread {
    ATM atm;
    String userName;

    Person(ATM atm, String userName) {
        this.atm = atm;
        this.userName = userName;
        setName(userName); // Set thread name for tracking
    }

    public void run() {
        System.out.println(getName() + " is in RUNNABLE state, trying to access ATM.");
        atm.useATM(userName); // Critical section
    }
}



/*
<-----------------------------------{"Using 'State of a Thread Method' in deep learning"}--------------------------------------->

1. New: Thread  is created but not started.
2. Runnable: Thread is ready or running.
3. Running: Thread is actively executing tasks.
4. Blocked/Waiting: Thread is alive but not active because it's waiting for resources or other threads.
5. Terminated: Thread has finished or stopped running.


      waiting/ sleeping/ blocking:---------> {New}
      waiting/ sleeping/ blocking:---------> {Runnable}
      waiting/ sleeping/ blocking:---------> {Running}
      waiting/ sleeping/ blocking:---------> {Terminated}


 */