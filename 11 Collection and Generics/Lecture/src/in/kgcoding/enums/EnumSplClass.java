package in.kgcoding.enums;

import javax.swing.*;

public class EnumSplClass {
    public void main(String[] args) {

        // String to Enums using valueOf.
        TrafficSignal signal = TrafficSignal.valueOf("RED");
        System.out.println(signal +" : "+ signal.getAction());

        signal = TrafficSignal.valueOf("GREEN");
        System.out.println(signal +" : "+ signal.getAction());



        signal = TrafficSignal.valueOf("ORANGE");
        System.out.println(signal +" : "+ signal.getAction());


    }

}

enum TrafficSignal {
    RED ("stop"),
    GREEN ("start"),
    ORANGE ("slow down");

    private final String action;

    TrafficSignal(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}





/*
<--------------------------------------------------------{"Using 'Enums class Method' in deep learning"}----------------------------------------------------------------------->

1. Enums in Java:-----------> Special types for fixed sets of constants like days,colors.
2. Declaration:-------------> Use Enum keyword, e.g., Enum Color {RED, GREEN, YELLOW}.
3. Access: Access constants with dot syntax, e.g.{Color.RED}.
4. Features: Type-safe, readable, can have methods and fields.
5. Usage: Useful in switch statements and iterating with values() method.


 */