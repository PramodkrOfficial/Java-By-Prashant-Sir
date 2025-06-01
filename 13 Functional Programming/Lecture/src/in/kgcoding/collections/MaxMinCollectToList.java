package in.kgcoding.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinCollectToList {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,2,5,1,3);
        Optional<Integer> maxNum = numbers.stream()
                .max(Integer::compareTo);
        // Output: 5
        maxNum.ifPresent(System.out::println);

        List<Integer> number = List.of(4,2,5,1,3);
        Optional<Integer> minNum = number.stream()
                .min(Integer::compareTo);
        // Output: 1
        minNum.ifPresent(System.out::println);

        List<String> words = Arrays.asList("Stream","Operations","Java","Developer");
        List<String> collectedWords = words.stream().collect(Collectors.toList());
        // Output: [Stream, Operations, Java, Developer]
        System.out.println(collectedWords);

    }
}



/*
<---------------------------------------------------------------------------------------{'Using "Intermediate Operation" in deep learning'}-------------------------------------------------------------------------------------------------------->
1. max():-----------------------------> Finds the largest element in the stream according to a given comparator or natural ordering.
2. min():-----------------------------> Identifies the smallest element in the stream based on a provided comparator or natural ordering.
3. collect(Collectors.toList()):------> To gathers all the elements of the stream into a new List.

 */