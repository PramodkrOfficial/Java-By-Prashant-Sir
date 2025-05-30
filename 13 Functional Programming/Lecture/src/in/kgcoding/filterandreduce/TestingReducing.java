package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReducing {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("\nSum using reduce is %d",newSum);

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.printf("\nSum2 using reduce is %d",newSum2);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) ->  a > b ? a : b);
        System.out.printf("\nMax using reduce is %d",max);
    }
}




/*
<-------------------------------------------------{'Using "Reducing under to Lambda" in deep learning'}------------------------------------------------------------->

1. Purpose: Used to reduce the elements of a stream to a single value. It takes a binary operator as a parameter and applies it repeatedly, combining the elements of the stream.
2. Versatile: Can be used for summing, finding, min or max, and combining elements in a myriad of ways.
3. Optional or Default Value: Without an identity value, reduce returns an Optional. With an identity value, it returns a default value if the stream is empty.
4.
 */