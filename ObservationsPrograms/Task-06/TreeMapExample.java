package packagecode.java;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // put(K key, V value)
        map.put(30, "Mango");
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(40, "Orange");
        map.put(50, "Grapes");

        System.out.println("TreeMap: " + map);

        // get(Object key)
        System.out.println("Value of key 20: " + map.get(20));

        // remove(Object key)
        map.remove(40);
        System.out.println("After remove(): " + map);

        // containsKey(Object key)
        System.out.println("Contains key 30: "
                + map.containsKey(30));

        // containsValue(Object value)
        System.out.println("Contains value Mango: "
                + map.containsValue("Mango"));

        // firstKey()
        System.out.println("First key: " + map.firstKey());

        // lastKey()
        System.out.println("Last key: " + map.lastKey());

        // higherKey(K key)
        System.out.println("Higher key than 20: "
                + map.higherKey(20));

        // lowerKey(K key)
        System.out.println("Lower key than 30: "
                + map.lowerKey(30));

        // ceilingKey(K key)
        System.out.println("Ceiling key of 25: "
                + map.ceilingKey(25));

        // floorKey(K key)
        System.out.println("Floor key of 25: "
                + map.floorKey(25));

        // entrySet()
        System.out.println("Entries: " + map.entrySet());
    }
}

