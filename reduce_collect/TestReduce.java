import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


// dicussing reduce method

public class TestReduce {
    public static void main(String[] args) {
        
        // reduce operation in imperative programming --> must be executed in a single thread
        // for loop has no room for parallelization
        // entire logic executed in a single thread

        // other example using Persons list
        // need antoher operation; map the person to its income


        // computing sum of a list -> reduce()
        List<Integer> nums = Arrays.asList(1, 2, 3, 4 , 5);

        int sum = nums.stream()
                      .reduce(0, Integer::sum);
        
        System.out.println(sum);

        // to do the same with the example of persons, we need to use map() first to map to the 
        // income of the person and then apply the result of the sum.
        // map-reduce operation is typical in functional programming


        // combining max and optional
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5)
                                .reduce(Integer::max);
        
        if(max.isPresent()) {
            System.out.println("The maximum value is: " + max.get());
        } else {
            System.out.println("max is not defined");
        }

        // HERE TRY TO GET THE MAX IN AN EMPTY STREAM

        Optional<Integer> maxim = Stream.<Integer>empty()
                                  .reduce(Integer::sum);
        
        if (maxim.isPresent()) {
            System.out.println(maxim.get());
        } else {
            System.out.println("max is not defined");
        }
        // using the count method (it returns a long)
        // we can use a casting if the count don't has to be so huge.
        int howMany = (int)(Stream.of(1, 2, 3, 4 , 5, 6 ,7, 8, 9, 10)
                       .count());
        System.out.println(howMany);
    }
}