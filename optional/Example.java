package optional;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        // java program without the Optional class
        String words[] = new String[10];
        // String word = words[5].toLowerCase();
        // System.out.println(word);

        // This produces a NullPointerException

        Optional<String> checkNull = Optional.ofNullable(words[5]);
        
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("word is: " + checkNull.orElse(null));
        }

        Integer bid = 30;

        System.out.println(bid.compareTo(30));
        System.out.println(bid.compareTo(29));
        System.out.println(bid.compareTo(31));

    }
}