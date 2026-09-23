package packagecode.java;
import java.util.*;

public class IteratorMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        Iterator<String> itr = list.iterator();

        System.out.println("Elements:");

        while (itr.hasNext()) {
            String item = itr.next();
            System.out.println(item);

            // remove Banana
            if (item.equals("Banana")) {
                itr.remove();
            }
        }

        System.out.println("After Iterator remove(): " + list);

        System.out.println("Using forEachRemaining():");

        Iterator<String> itr2 = list.iterator();
        itr2.forEachRemaining(System.out::println);
    }
}

