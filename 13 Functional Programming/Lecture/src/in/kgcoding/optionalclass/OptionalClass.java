package in.kgcoding.optionalclass;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        // Creating Optional Objects
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalOf = Optional.of("Java Developer");
        Optional<String> optionalNullable = Optional.ofNullable(null);

        // Checking presence of value
        if (optionalOf.isPresent()) {
            System.out.println("Value is present: " + optionalOf.get());
        }

        // Using orElse to provide a fallback
        String  orElseExample = optionalEmpty.orElse("Default Value");
        System.out.println("Using orElse: " + orElseExample);

        // Using ifPresent to perform an action if value is present
//        optionalOf.ifPresent(System::out::println);
    }
}






/*
<------------------------------------------------------------{'Using "Functional Interfaces" in deep learning'}------------------------------------------------------->

                                       value--------> Optional
                                                      value

                                       null---------> Optional
                                                      empty

1. Creating Optional Objects:-------> Optional.empty(), Optional.of(), Optional.ofNullable()
2. Checking Value Presence:---------> isPresent() and ifPresent()
3. Default Values:------------------> orElse() and orElseGet()
4. Value Transformation:------------> map()
5. Throwing Exception:--------------> orElseThrow()

 */