public class Unary {
    public static void main(String[] args) {

//        { Converts a positive value to negative }
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);

//       { Pre - increment: Increment the value by 1 and then use it in our statement }
        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int  m = 8;
        System.out.println(++m);
        System.out.println(m);

//       { Pre - decrement: Decrement the value by 1 and then use it in our statement }
        System.out.println("Watching Decrement");
        int b = 10;
        --b;
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b);
        int n = 10;
        System.out.println(--n);
        System.out.println(n);

//       { Post - Increment: Use current value in the statement and then increment it by 1 } int q = 10;
        System.out.println("Watching Increment");
        a++;
        System.out.println(a);
        int p  = 5;
        System.out.println(p++);
        System.out.println(p);


//       { Post - Decrement: Use current value in the statement and then decrement it by 1 } int q = 10;
        System.out.println("Watching Decrement");
        a--;
        System.out.println(a);
        int q = 10;
        System.out.println(q--);
        System.out.println(q);
    }
}
