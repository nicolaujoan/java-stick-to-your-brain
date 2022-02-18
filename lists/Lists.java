import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        
        // create a list of strings
        List<String> names = new ArrayList<String>();
        
        // adding elements
        names.add("Joan");
        names.add("Pedro");
        names.add("Toni");
        names.add("Jaume");

        // printing the list
        System.out.println(names.toString());

        // adding an element to an specified position
        names.add(1, "Sara");

        System.out.println(names); // don't need to call toString()

        // tip: a list must grow sequentially
        // this is because is also known as a sequence
    
        // displaying the size of the list
        System.out.println("size of the list: " + names.size());

        System.out.println("Elements with its index:");
        // printing each element with its index
        for (int i = 0; i < names.size(); i++) {
            System.out.println("index: " + i + "    value: " + names.get(i));
        }

        // sublisting
        List<String> sublist = names.subList(1, 3);
        System.out.println("Sublist from 1 to 3 excluded: " + sublist);

        // removing an element from the list (by specifying the element)
        names.remove("Pedro");
        System.out.println("after removing Pedro: " + names);

        // removing an element from the list (by specifying the index)
        names.remove(0);
        System.out.println("after removing the element at index 0: " + names);

    }
}