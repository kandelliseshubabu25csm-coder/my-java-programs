package packagecode.java;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("ArrayList: " + list);

        // add(int index, E element)
        list.add(1, "Orange");

        System.out.println("After add(index, element): " + list);

        // get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // set(int index, E element)
        list.set(2, "Grapes");

        System.out.println("After set(): " + list);

        // remove(int index)
        list.remove(1);

        System.out.println("After remove(index): " + list);

        // remove(Object o)
        list.remove("Apple");

        System.out.println("After remove(object): " + list);

        // contains(Object o)
        System.out.println("Contains Mango: "
                + list.contains("Mango"));

        // size()
        System.out.println("Size: " + list.size());

        // isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());

        // Add duplicate elements
        list.add("Mango");
        list.add("Banana");

        // indexOf(Object o)
        System.out.println("First index of Mango: "
                + list.indexOf("Mango"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Mango: "
                + list.lastIndexOf("Mango"));

        // sort(Comparator)
        list.sort(Comparator.naturalOrder());

        System.out.println("After sort(): " + list);

        // clear()
        list.clear();

        System.out.println("After clear(): " + list);
    }
}