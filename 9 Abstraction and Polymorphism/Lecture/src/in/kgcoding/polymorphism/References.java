package in.kgcoding.polymorphism;

public class References {
}





/*
<---------------------------------------------------{"Using 'References' and 'Objects' in deep"}----------------------------------------------->

1.Upcasting:------> Converts subclass to superclass reference.
                    Automatic and safe.
                    Access only to superclass methods.
1.Upcasting:------> Converts superclass to subclass reference.
                    Manual and risky, needs instanceof check.
                    Access to subclass-specific methods.
1.Upcasting:------> Up-casting for generalization in methods.
                    Down-casting for specific subclass behaviours.

Example:----------> Upcasting & Down-casting

                    Parent p = new Child();   // Upcasting

                    Child c = new Parent();   // Trying to downcast

                    Parent p = new Child();   // Down-casting
                    Child c = (Child)p;


 */
