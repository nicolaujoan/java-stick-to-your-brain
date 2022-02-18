import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIter {
    public static void main(String[] args) {
        
        // USING THE LIST ITERATOR

        // create and add elements to the list
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Richard");
        list.add("Donna");
        list.add("Ken");

        System.out.println("list: " + list);

        // get the list iterator
        ListIterator<String> iterator = list.listIterator();

        // iterator in forward direction
        System.out.println();
        System.out.println("list iterator in forward direction");

        while(iterator.hasNext()) {
            int index = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("Index=" + index + ", Element=" + element);
        }

        System.out.println();
        System.out.println("list iterator in backward direction");

        // reuse the iterator to iterate from the end to the beggining
        while(iterator.hasPrevious()) {
            int index = iterator.previousIndex();
            String element = iterator.previous();
            System.out.println("Index=" + index + ", Element=" + element);
        }

        // iterator.previous(), iterator.next(), moves the iterator

    }
}
