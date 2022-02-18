import java.util.HashSet;
import java.util.Set;

// using Set interface and HashSet as its implementation class

public class Sets {
    public static void main(String[] args) {
        
        // create set
        Set<String> s1 = new HashSet<String>();

        // adding some elements
        s1.add("joan");
        s1.add("peter");
        s1.add("jaume");
        s1.add("jhonny");
        s1.add("joan"); // duplicate no effect !!!

        // create another set by copying s1
        Set<String> s2 = new HashSet<String>(s1);

        // add some more elements
        s2.add("ellen");
        s2.add("noah");
        s2.add(null);  // one null is fine
        s2.add(null);  // duplicate has no effect !!!

        // print the sets
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // print the sizes
        System.out.println("s1 size: " + s1.size());
        System.out.println("s2 size: " + s2.size());
        
    }
}