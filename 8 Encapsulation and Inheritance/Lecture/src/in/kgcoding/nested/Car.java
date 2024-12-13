package in.kgcoding.nested;

public class Car {

    private int noOfDoors;

    public void repair() {
        Tyre T = new Tyre();
    }

    protected  class Tyre {
        private double width;
        private double pressure;
        private String material;

        public void inflate() {
            noOfDoors = 4;
        }
    }
}



/*
<----------------------------------------------------{"Using 'Nested' and 'Inner' Classes Principle in Deep"}------------------------------------------------------------>

1.Nested Classes:-----------------------> Classes defined within another class,divided into static (static nested classes) and non-static (inner classes).
2.Static Nested Classes: ---------------> Act as static members of the outer class; can access outer class's static members but not its non-static members.
3.Inner Classes: -----------------------> Associated with an instance of the outer class; can access all members of the outer class, including private ones.
4.Local and Anonymous Inner Classes:----> Local inner classes are defined within a block (like method) and are not visible outside it.
                                          Anonymous inner classes are nameless and used for single-use-implementations.
5.Use Cases:----------------------------> Useful for logically grouping classes, improving encapsulation and enhancing code readability.




 */


