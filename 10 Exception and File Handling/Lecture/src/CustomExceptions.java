public class CustomExceptions  extends Exception {


    private double degrees;

    public CustomExceptions(double degrees) {
        this.degrees = degrees;
    }

    public String getMessage() {
        return "The temperature (" + degrees + "c) isn't in the normal range.";
    }

    public double getDegrees() {
        return degrees;
    }
}




/*
<-------------------------------------------------------------{"Using 'CustomExceptions' keyword in deep"}---------------------------------------------------------------------------------->

1. Custom exceptions are user-defined exception classes that extend either Exception (for checked exceptions) or RuntimeException (for unchecked exceptions).
2. They are created to represent specific error conditions relevant to an application.

 */