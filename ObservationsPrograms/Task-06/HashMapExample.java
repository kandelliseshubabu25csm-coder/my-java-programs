package packagecode.java;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // put(K key, V value)
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("HashMap: " + map);

        // get(Object key)
        System.out.println("Value of key 102: " + map.get(102));

        // remove(Object key)
        map.remove(103);
        System.out.println("After remove(): " + map);

        // containsKey(Object key)
        System.out.println("Contains key 101: "
                + map.containsKey(101));

        // containsValue(Object value)
        System.out.println("Contains value Banana: "
                + map.containsValue("Banana"));

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // getOrDefault(Object key, V defaultValue)
        System.out.println("Value of key 105: "
                + map.getOrDefault(105, "Not Found"));

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
