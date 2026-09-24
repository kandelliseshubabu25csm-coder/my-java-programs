package packagecode.java;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put(K key, V value)
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("LinkedHashMap: " + map);

        // get(Object key)
        System.out.println("Value of key 102: " + map.get(102));

        // remove(Object key)
        map.remove(103);
        System.out.println("After remove(): " + map);

        // containsKey(Object key)
        System.out.println("Contains key 101: "
                + map.containsKey(101));

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());
    }
}
