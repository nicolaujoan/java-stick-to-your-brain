import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Optionals {
    public static void main(String[] args) {
        // REPRESENTING AN OPTIONAL VALUE

        // create an empty optional
        Optional<String> str = Optional.empty();

        // create an Optional for the string "hello"
        Optional<String> hello = Optional.of("pedrito bros");
        

        // create an optional with a String that may be null
        String nullableString = "";
        Optional<String> mayNull = Optional.ofNullable(nullableString);

        // print optional is empty
        if(str.isPresent()) {
            String value = str.get();
            System.out.println("Optional value: " + value);
        } else {
            System.err.println("Optional is empty");
        }

        // print the optional value
        if(hello.isPresent()) {
            String value = hello.get();
            System.out.println("Optional value: " + value);
        } else {
            System.out.println("Optional is empty");
        }

        // using ifPresent()
        // create a new Optional value
        Optional<String> opt = Optional.of("hola buenos dias");
        // print the value in the optional if is present
        opt.ifPresent(value -> System.out.println("optional value is: " + value));

        // GET THE MAXIMUM OF ODD INTEGERS FROM THE STREAM
        OptionalInt maxOdd = IntStream.of(10, 20, 30)
                             .filter(n -> n % 2 == 1)
                             .max();

        if(maxOdd.isPresent()) {
            int value = maxOdd.getAsInt();
            System.out.println("max value: " + value);
        } else {
            System.out.println("there's no max odd number");
        }
                             
        // GETTING THE LONGEST NAME
        Optional<String> name = Stream.of("joan", "pedrito", "toniel.lo", "tonarini")
                                .max(Comparator.comparingInt(String::length));

        if(name.isPresent()) {
            String longestName = name.get();
            System.out.println("the longest name is: " + longestName);
        } else {
            System.out.println("Stream is empty");
        } 
    }
}