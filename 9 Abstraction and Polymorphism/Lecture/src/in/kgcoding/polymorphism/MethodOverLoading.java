package in.kgcoding.polymorphism;

public class MethodOverLoading {


//    public static int add (int a, int b) {
//        return a + b;
//    }
//
//    public static String add (String s1, String s2) {
//        return s1.concat(s2);
//    }
//
//    public static void main(String[] args) {
//        int result1 = MethodOverLoading.add(4,8);
//        System.out.println(result1);
//        String result2 = MethodOverLoading.add("Test, ", "Final");
//        System.out.println(result2);
//    }


    public void bark() {                //same method name
        System.out.println("woof..");   //Different parameter
    }

    //overloading method using
    public void bark(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("woof....");
        }
    }

    public static void main(String[] args) {
        MethodOverLoading dog = new MethodOverLoading();
        dog.bark();
        dog.bark(4);
    }


}



/*
<---------------------------------------------------------------{"Using 'Method' / 'Constructor' Overloading"}--------------------------------------------->

1.Method Overloading:------------> Method overloading occurs when multiple methods in the same class have the same name but different parameter lists.
2.Parameter Difference:----------> Overloaded methods must differ in the number, type, or sequence of their parameters.
3.Return Type:-------------------> Can very between overloaded methods, but the return type alone does not distinguish them.
4.Compile-Time Polymorphism:-----> It's a form of polymorphism that is resolved during compile time.
 */
