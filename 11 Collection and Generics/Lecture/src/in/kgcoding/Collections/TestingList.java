package in.kgcoding.Collections;

import javax.print.StreamPrintService;
import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Pramod");
        strList.add("Java Developer");
//        strList.add(54);

        strList.add(1,"Ramawadhesh");
        strList.remove(0);

        if (strList.contains("Java Developer")) {
            System.out.println("Java Developer exists");
        }

        if (strList.contains("Java Developer")) {
            System.out.println(strList.indexOf("Java Developer"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        for (String str: strList) {
            System.out.println(str);
        }
    }
}



/*
<--------------------------------------------------------{"Using 'List Interface' in deep learning"}-------------------------------------------------------------------->

1. add(E, e): Appends the specified element.
2. add(int index, E element): Inserts at specified position.
3. remove(Object o): Removes the first occurrence of the specified element.
4. remove(int index): Removes the element at the specified position.
5. get(int index): Returns the element at the specified position.
6. set(int index, E element): Replaces the element at the specified position.
7. size(): Returns the number of elements.
8. clear(): Removes all of the elements.
9. contains(Object o): Returns `true` if the list contains the specified position.
10. indexOf(Object o): Returns the index of the first occurrence, or -1, if the list does not contain the element.

 */