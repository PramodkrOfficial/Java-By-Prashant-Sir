package in.kgcoding.abstraction;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void getSetGo() {
        System.out.println("I'm flying over cloud...");
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vroom......");
    }
}
