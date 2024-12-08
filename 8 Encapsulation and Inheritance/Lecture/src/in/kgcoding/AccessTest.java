package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model = "Bugatti";
        car.costOfPurchase = 1000000;
        System.out.println(car);

        Car newCar = new Car("Black","BMW", 1,5000000);
        System.out.println(newCar);

        Default def = new Default();
    }
}
