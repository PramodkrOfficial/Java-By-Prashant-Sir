package in.kgcoding.collectionslibrary;

//import java.util.HashSet;
//import java.util.Set;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {

        // Creating a set
        Set<String> set = new HashSet<>();


        // Adding elements
        set.add("Pramod");

        // Attempting to add a duplicate element
        boolean isAdded = set.add("Pramod");        //This will be false
        System.out.println("Pramod added again: " + isAdded);

        // Checking if a specific element is in the set
        boolean containsDev = set.contains("Developer");
        System.out.println("Contains Dev: " + containsDev);

    }
}





/*
<--------------------------------------------------------{"Using 'Set Interface' in deep learning"}-------------------------------------------------------------------->

1. Unique Elements: Does not allow duplicate elements.
2. Unordered Collection: It does not guarantee any specific ordering of elements.
3. No Positional Access: Unlike lists, it doesn't support indexing-based access to elements.
4. Implementation: Common implementation include HashSet, LinkedHashSet, and TreeSet.


 */




/*
<--------------------------------------------------------{"Using 'Set Interface Method' in deep learning"}-------------------------------------------------------------------->

1. add(E e): Adds the specified element to set.
2. remove(Object o): Removes the specified element from the set.
3. contains(Object o): Checks if the set contains the specified element.
4. size(): Returns the number of elements in the set.
5. isEmpty(): Checks if the set is empty.

 */