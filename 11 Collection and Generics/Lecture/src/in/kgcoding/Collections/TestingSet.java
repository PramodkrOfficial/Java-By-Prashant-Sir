package in.kgcoding.Collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add(" Pramod"));
        System.out.println(names.add(" Java"));
        System.out.println(names.add(" Developer"));

        Utility.print(names);
        System.out.println();

        System.out.println(names.add("Pramod"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println();

        System.out.println(names.contains("Developer"));
        System.out.println(names.remove("Developer"));
        Utility.print(names);
        System.out.println(names.remove("Developer"));
    }
}




/*
<--------------------------------------------------------{"Using 'Set Interface Method' in deep learning"}-------------------------------------------------------------------->

1. add(E e): Adds the specified element to set.
2. remove(Object o): Removes the specified element from the set.
3. contains(Object o): Checks if the set contains the specified element.
4. size(): Returns the number of elements in the set.
5. isEmpty(): Checks if the set is empty.

 */