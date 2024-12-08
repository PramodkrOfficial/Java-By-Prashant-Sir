public class FinalTesting {

     final double PI = 3.1412;

    void testing(double PI) {
//        this.PI = PI;        //  Can not reassign a value of final variable
    }

    public static void main(String[] args) {

    }
}


/*
<------------------------------------------------{"Using of 'StringBuilder' and 'StringBuffer' in String class"}------------------------------------------------------->

1. Variable:------------------> When applied to a variable, it becomes a constant, meaning its value cannot be changed once initialized.
2. Efficiency:----------------> Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.
3. Null Safety:---------------> A final variable must be initialized before the constructor completes, reducing null pointer errors.
4. Immutable Objects:---------> Helps in creating immutable objects in combination with private fields and no setter methods.


<----------------------------{Syntax of 'Final keyword'} ------------------------->

                        public static Main {
                            public final String name = "Pramod_Dev";
                            Public void setName(String name) {
                            this.name = name;       // can not reassign final variables
                            }
                        }
 */
