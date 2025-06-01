package in.kgcoding.optionalclass;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
//        List<Integer> numbers = List.of();
        Optional<Integer> test = numbers.stream()
                .reduce((a, b) -> a + b);
        if (test.isPresent()) {
            System.out.println(test.get());
        } else {
            System.out.println("List is empty");
        }

    }
}
