package in.kgcoding.abstraction;

//Defining Abstract class
public abstract class Vehicle implements Transport {

    private int noOfTires;

//    Defining Abstract Method
    public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("OOps Testing......");
    }

}
