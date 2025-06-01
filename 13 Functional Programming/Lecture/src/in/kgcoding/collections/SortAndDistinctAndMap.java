package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndDistinctAndMap {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,2,5,1,3);
        List<Integer> sortedNum = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        // Output: [1,2,3,4,5]
        System.out.println(sortedNum);

        List<String> items = List.of("apple","banana","orange","banana","apple");
        List<String> distinctItems = items.stream()
                .distinct()
                .collect(Collectors.toList());
        // Output: [apple, banana,orange]
        System.out.println(distinctItems);

        List<String> words = List.of("Stream","Operations","Java", "Developer");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // Output: [STREAM, OPERATIONS, JAVA , DEVELOPER]
        System.out.println(upperCaseWords);
    }
}





/*
<---------------------------------------------------------------------------------------{'Using "Intermediate Operation" in deep learning'}-------------------------------------------------------------------------------------------------------->

1. sorted():------------> Orders the elements of a stream based on their natural order or a provided comparator.
2. distinct():----------> Filters out duplicate elements, ensuring that every element in the resulting stream is unique.
3. map():---------------> applies a function to each element of a stream, transforming them into a new stream of results based on the function logic.

 */
