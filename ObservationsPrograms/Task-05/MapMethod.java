package packagecode.java;
import java.util.*;

public class MapMethod {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("Map: " + map);

        // get()
        System.out.println("Value of key 102: " + map.get(102));

        // containsKey()
        System.out.println("Contains key 101: " + map.containsKey(101));

        // containsValue()
        System.out.println("Contains value Mango: " + map.containsValue("Mango"));

        // size()
        System.out.println("Size: " + map.size());

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());

        // remove()
        map.remove(102);
        System.out.println("After remove(): " + map);

        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);
    }
}

