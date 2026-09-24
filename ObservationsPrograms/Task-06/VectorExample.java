package packagecode.java;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        // add(E e)
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        System.out.println("Vector: " + vector);

        // addElement(E obj)
        vector.addElement("Orange");
        System.out.println("After addElement(): " + vector);

        // get(int index)
        System.out.println("Element at index 2: " + vector.get(2));

        // set(int index, E element)
        vector.set(2, "Grapes");
        System.out.println("After set(): " + vector);

        // remove(int index)
        vector.remove(1);
        System.out.println("After remove(index): " + vector);

        // removeElement(Object obj)
        vector.removeElement("Apple");
        System.out.println("After removeElement(): " + vector);

        // size()
        System.out.println("Size: " + vector.size());

        // capacity()
        System.out.println("Capacity: " + vector.capacity());

        // contains(Object o)
        System.out.println("Contains Mango: "
                + vector.contains("Mango"));
    }
}


