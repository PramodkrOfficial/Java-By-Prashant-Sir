package in.kgcoding.equals;

import java.util.Objects;

public class EqualsAndHashCode {

    private String name;
    private int age;
    private String id;


    public EqualsAndHashCode(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCode that = (EqualsAndHashCode) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}



/*
<-----------------------------------------------------------------------{"Using 'Equals()' and 'HashCode()' method in Deep"}--------------------------------------------------------------------------------------------------->

1.Equals() Method:---------------> Used for logical equality checks between objects.By default, it compares object references, but it's commonly overridden to compare object states.
2.HashCode() Method:-------------> Generates an integer hash code representing an object. It's crucial for the performance of hash-based collections like HashMap.
3.Equals-HashCode Contract:------> If two objects are equal according to equal(), they must have the same hash code. However, two objects with the same hash code aren't necessarily equal.
4.Overriding Both:---------------> If equals() is overridden, hashCode() should also be overridden to maintain consistency between these methods.


 */
