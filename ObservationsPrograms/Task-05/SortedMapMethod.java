package packagecode.java;
import java.util.*;

public class SortedMapMethod {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Mango");
        map.put(10, "Apple");
        map.put(40, "Orange");
        map.put(20, "Banana");

        System.out.println("SortedMap: " + map);

        // firstKey()
        System.out.println("First Key: " + map.firstKey());

        // lastKey()
        System.out.println("Last Key: " + map.lastKey());

        // headMap()
        System.out.println("HeadMap(<30): " + map.headMap(30));

        // tailMap()
        System.out.println("TailMap(20): " + map.tailMap(20));

        // subMap()
        System.out.println("SubMap(10, 40): " + map.subMap(10, 40));

        // comparator()
        System.out.println("Comparator: " + map.comparator());
    }
}

