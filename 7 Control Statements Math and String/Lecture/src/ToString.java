public class ToString {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;


    public ToString(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToString bugatti = new ToString(4,4,140,"Bugatti","SW648","Bugatti SAS");
        System.out.println(bugatti);
    }
}




/*
<--------------------------------------------{"Using for ToString Method"}---------------------------------------------------------->

Function:--------------> toString() provides a string representation of an object.
Inheritance:-----------> It's inherited from the Object class.
Default Format:--------> By default, returns class name, "@", and hashcode.
Overriding:------------> Commonly overridden in custom classes for meaningful output.
Implicit Call:---------> Automatically called in string concatenation.

Definition:------------> The toString() method is a fundamental method in Java, inherited from the Object class.
                         It's designed to provide a textual representation of an object. When you call toString() on an
                         object, it returns a string that describes the object's state.
Uses of toString():---->
                         1. Debugging: Provides a concise and informative representation of an object's state during debugging.
                                     Helps identify issues and understand the program's behavior.

                         2. Logging: Logs object information to files or consoles for analysis and troubleshooting.
                                     Facilitates error tracking and performance monitoring.

                         3. String Concatenation: Combines object representations with other strings to create meaningful messages.
                                                  Used in error messages, log entries, and user-facing output.

                         4. Serialization: Converts objects into a byte stream for storage or transmission.
                                           The toString() method can be used to represent the object's state in the serialized form.

                         5. Testing: Verifies the correctness of object creation and modification.
                                     Asserts that the toString() output matches expected values.





 */
