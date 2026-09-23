package packagecode.java;
import java.util.*;

public class ListIteratorMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        ListIterator<String> itr = list.listIterator();

        System.out.println("Forward Traversal:");

        while (itr.hasNext()) {
            System.out.println(
                "Index " + itr.nextIndex() + ": " + itr.next()
            );
        }

        System.out.println("\nBackward Traversal:");

        while (itr.hasPrevious()) {
            System.out.println(
                "Index " + itr.previousIndex() + ": " + itr.previous()
            );
        }

        // Move to first element
        itr = list.listIterator();

        itr.next();
        itr.set("Orange");

        System.out.println("\nAfter set(): " + list);

        // Add element
        itr.add("Grapes");

        System.out.println("After add(): " + list);

        // Remove element
        itr.previous();
        itr.remove();

        System.out.println("After remove(): " + list);
    }
}
