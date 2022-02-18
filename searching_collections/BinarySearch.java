import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Jhon");
        list.add("Mateu");
        list.add("Joan");
        list.add("peter");

        // must sort before performing the binary search
        Collections.sort(list);
        System.out.println("list: " + list);  // sorted list

        // find Mateu
        int index = Collections.binarySearch(list, "Mateu");
        System.out.println("Mateu in list is at index " + index);

        // find peter
        index = Collections.binarySearch(list, "peter");
        System.out.println("peter in list is at index " + index);

        // find Ellen
        index = Collections.binarySearch(list, "Ellen");
        System.out.println("Ellen in list is at index " + index);

        /* since ellen is not in the list, it returned -1 */
        // depends on the position where it be placed
        // ellen will be at first position if exists
        // this is because returns -1  !!!!
    }
}