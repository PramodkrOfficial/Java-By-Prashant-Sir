package in.kgcoding.passby;

public class TestPassByReference {
    public static void main(String[] args) {
        Point  first = new Point(4,8);
        System.out.println("first: " +first);
        move(first);
        System.out.println("first: " + first);
    }

    public static void move (Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}





/*
<-----------------------------------------------------------{"Using 'CallBy Reference' in deep"}--------------------------------------------------------->

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