package in.knowledgegate;

import in.gettersetter.Car;


public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Pearl","Volvo",4,8000000);
        car.setColor("Blue");
        car.setFuelLevel(5);
        System.out.printf("%s %s %s",car.getColor(), car.getModel(), car.getFuelLevel());

    }
}
