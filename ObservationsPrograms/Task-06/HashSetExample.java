package packagecode.java;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add(E e)
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("HashSet: " + set);

        // remove(Object o)
        set.remove("Banana");
        System.out.println("After remove(): " + set);

        // contains(Object o)
        System.out.println("Contains Mango: "
                + set.contains("Mango"));

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}

