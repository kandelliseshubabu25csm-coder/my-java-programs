package packagecode.java;
import java.util.*;

public class NavigableMapMethod {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");
        map.put(50, "Grapes");

        System.out.println("NavigableMap: " + map);

        // lowerKey()
        System.out.println("Lower Key than 30: " + map.lowerKey(30));

        // floorKey()
        System.out.println("Floor Key of 30: " + map.floorKey(30));

        // ceilingKey()
        System.out.println("Ceiling Key of 35: " + map.ceilingKey(35));

        // higherKey()
        System.out.println("Higher Key than 30: " + map.higherKey(30));

        // firstEntry()
        System.out.println("First Entry: " + map.firstEntry());

        // lastEntry()
        System.out.println("Last Entry: " + map.lastEntry());

        // pollFirstEntry()
        System.out.println("Poll First Entry: " + map.pollFirstEntry());

        // pollLastEntry()
        System.out.println("Poll Last Entry: " + map.pollLastEntry());

        // descendingMap()
        System.out.println("Descending Map: " + map.descendingMap());
    }
}

