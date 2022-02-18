import java.util.Arrays;
import java.util.List;

public class StreamsTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // sum of squares of all odd integers in the list
        int sum = numbers.stream()
                    .filter(n -> n % 2 == 1)
                    .map(n -> n * n)
                    .reduce(0, Integer::sum);
        
        System.out.println(sum);
    }
}