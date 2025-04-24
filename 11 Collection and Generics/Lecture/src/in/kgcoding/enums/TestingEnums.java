
package in.kgcoding.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        System.out.println("Initial color: " + color);

        color = TrafficLight.GREEN;
        System.out.println("Change color: " + color);

        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);

        }
    }
}
