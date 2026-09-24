package packagecode.java;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add(E e)
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Apple");

        System.out.println("LinkedHashSet: " + set);

        // remove(Object o)
        set.remove("Banana");
        System.out.println("After remove(): " + set);

        // contains(Object o)
        System.out.println("Contains Mango: "
                + set.contains("Mango"));

        // size()
        System.out.println("Size: " + set.size());

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
