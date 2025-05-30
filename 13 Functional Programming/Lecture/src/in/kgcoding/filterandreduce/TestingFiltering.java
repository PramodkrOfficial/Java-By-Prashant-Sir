package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFiltering {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","banana","mango","cherry","papaya");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits normally....");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing Fruits using streams....");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Printing Fruits using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));
    }

}



/*

<-------------------------------------------------{'Using "Filtering under to Lambda" in deep learning'}------------------------------------------------------------->

1. Purpose:--------------> Used to filter elements of a stream based on a given predicate (a condition). Only elements that satisfy the condition are included in the resulting stream.
2. Lazy Operation:-------> It's a lazy operation, meaning it's not executed until a terminal operation(like collect or forEach) is invoked on the stream.
3. Returns a stream:-----> Filter itself returns a new stream with elements that match the predicate.


 */
