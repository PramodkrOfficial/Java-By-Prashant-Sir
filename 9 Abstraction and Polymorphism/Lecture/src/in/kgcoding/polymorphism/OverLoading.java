package in.kgcoding.polymorphism;

public class OverLoading {

    OverLoading() {
        System.out.println("Default constructor called.");
    }

    OverLoading(String pop) {
        System.out.println(pop);
    }

    public int add(int a, int b) {
        return a+b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        OverLoading overload = new OverLoading();
        int add = overload.add(3,5);
        overload.add("a","b");
        System.out.println(overload.add(5, add));
        System.out.println(overload.add(3,7,4,8));
    }
}
