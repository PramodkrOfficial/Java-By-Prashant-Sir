package in.kgcoding.polymorphism;


public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle v = new Vehicle();
        Plane p = new Plane();

        //castTest(v);
        castTest(c);
        castTest(p);

        //Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle();

        //Object ref1 = new Car();
        //Object ref2 = new Vehicle();
    }

    private static void castTest(Vehicle veh) {
        //Car cVehicle = (Car) veh;
        //veh .noOfDoors();
       veh.start();
        //Vehicle.noOfDoors();

        if (veh instanceof Car) {
            System.out.println("only instanceof checking...");
        }
    }
}
