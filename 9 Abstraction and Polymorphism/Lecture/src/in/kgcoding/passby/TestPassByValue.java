package in.kgcoding.passby;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x,y);
        System.out.printf("x=%d, y=%d, sum=%d", x , y, sum);
//        System.out.println(sum);
    }


    public static int add(int a, int b) {
        a = 99;
        return a;
//        a += b;
//        return a+b;
    }
}


/*
<-----------------------------------------------------------{"Using 'CallBy Value' in deep"}--------------------------------------------------------->

1.Variable Pass By Value:----> Java's default method.
                               Copies argument's value to function's parameter.
                               Changes in function don't affect original variable.

1.Objects and References:----> Java passes the reference's value for objects.
                               Modifications to objects in method affect originals.

3.Primitive Types:-----------> Always passed by value.
                               In-function changes don't impact originals.

-------------------------------------------******************----------------------------------------------------


Key Takeaways:
1.Primitive types:--> Changes made inside methods do not affect the original variable.
                      True pass-by-value behavior.

2.Objects:----------> The reference to the object is passed by value.
                      The method can modify the object’s state but cannot change the reference itself.

-------------------------------------------******************----------------------------------------------------
Java does not support true pass-by-reference like some other languages (e.g., C++).
All arguments are passed by value, but the behavior can mimic pass-by-reference when objects are involved.
-------------------------------------------******************----------------------------------------------------

 */

