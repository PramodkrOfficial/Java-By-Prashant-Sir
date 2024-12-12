package in.kgcoding.equals;

public class EqualsAndHashCode {
    public static void main(String[] args) {

    }
}



/*
<-----------------------------------------------------------------------{"Using 'Equals()' and 'HashCode()' method in Deep"}--------------------------------------------------------------------------------------------------->

1.Equals() Method:---------------> Used for logical equality checks between objects.By default, it compares object references, but it's commonly overridden to compare object states.
1.HashCode() Method:-------------> Generates an integer hash code representing an object. It's crucial for the performance of hash-based collections like HashMap.
1.Equals-HashCode Contract:------> If two objects are equal according to equal(), they must have the same hash code. However, two objects with the same hash code aren't necessarily equal.
1.Equals() Method:---------------> If equals() is overridden, hashCode() should also be overridden to maintain consistency between these methods.
 */
