package in.gettersetter;

public class Car {
    private String color;   //public
    private String model;  //public
    private double fuelLevel;
    private long costOfPurchase;   //default

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor (String color) {
        if (color.equals("Yellow")) {
            System.out.println("pagal hai kya");
        } else {
            this.color = color;
        }
    }

    public String getModel () {
        return model;
    }
}


/*
<----------------------------------------------------{"Using of 'Getter' and 'Setter' method in deep"}----------------------------------------------------->

1.Getters:--------------------> Retrieve private field values, typically named get<FieldName>.
2.Setters:--------------------> Set or update private field values, usually named set<FieldName>.
3.Control and Validation:-----> Offer controlled access and allow for validation logic.
4.Encapsulation:--------------> Facilitate read-only or write-only access to class fields.
5.Flexibility:----------------> Allow for internal changes without affecting external interfaces.


 */
