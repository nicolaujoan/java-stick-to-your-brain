import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Maps {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();

        // some insertions
        map.put("jhon", "jairo");
        map.put("joan", "nicolau");
        map.put("pedro", "picapiedra");
        map.put("dean", "winchester");
        map.put("pep", null);
        map.put("toni", null);


        // print the details
        printDetails(map);

        // remove all entries from the map
        // map.clear();

        // print all keys
        printKeys(map);

        System.out.println("############ printing key-value pairs ################");

        // PLAYING WITH THE ENTRY SET (key, value pairs)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        
        // printing all key value pairs using forEach() method of the collection interface
        // can be used an iterator or for-each loop to do the same
        entries.forEach((Map.Entry<String,String> entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        });

        System.out.println("############ in a cleaner way ##################");

        // clean daddy
        map.forEach((String key, String value) -> {
            System.out.println("key=" + key + ", value=" + value);
        });

        System.out.println(map.values());

    }

    public static void printDetails(Map<String,String> map) {
        // Get the value for the "dean" key
        String deanSurname = map.get("dean");  // return null if there's no mapping for key
        // Print details
        System.out.println("Map: " + map);
        System.out.println("Map Size: " + map.size());
        System.out.println("Map is empty: " + map.isEmpty());
        System.out.println("Map contains dean key: " + map.containsKey("dean"));
        System.out.println("dean surname: " + deanSurname);
        System.out.println("dean key is removed: " + map.remove("dean"));
    }

    public static void printKeys(Map<String, String> map) {

        // first we get the set of keys
        Set<String> keys = map.keySet();

        // print all keys using foreach method
        // can use for-each, iterator... to do the same
        keys.forEach(System.out::println);
    } 
}