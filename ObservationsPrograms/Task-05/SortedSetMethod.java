package packagecode.java;
import java.util.*;

public class SortedSetMethod{
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println("SortedSet: " + set);

        // first()
        System.out.println("First element: " + set.first());

        // last()
        System.out.println("Last element: " + set.last());

        // headSet()
        System.out.println("HeadSet(<30): " + set.headSet(30));

        // tailSet()
        System.out.println("TailSet(30): " + set.tailSet(30));

        // subSet()
        System.out.println("SubSet(20, 50): " + set.subSet(20, 50));

        // comparator()
        System.out.println("Comparator: " + set.comparator());
    }
}


