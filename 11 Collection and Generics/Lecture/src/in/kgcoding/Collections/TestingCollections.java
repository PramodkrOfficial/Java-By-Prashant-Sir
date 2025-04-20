package in.kgcoding.Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);
        Utility.print(numList);
        System.out.println();

        Collections.sort(numList);
        Utility.print(numList);
        System.out.println();

        Collections.reverse(numList);
        Utility.print(numList);
        System.out.println();

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
//        unmodifiable.add(87);
    }
}





/*
<--------------------------------------------------------{"Using 'Collections Interface Method' in deep learning"}-------------------------------------------------------------------->

1. Offers methods like sort to sort lists.
2. Provides methods like binarySearch for searching sorted lists.
3. Allows reversing the order of elements in a list with reverse.
4. Can shuffle the elements of a list randomly using shuffle.
5. Creates unmodifiable collections using methods like unmodifiableList, etc.
6. Methods like singletonList, create immutable collections with single element.
7. THe copy method is used to copy all elements from one list to another.


 */