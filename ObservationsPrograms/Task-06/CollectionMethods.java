
    import java.util.*;

public class CollectionMethods {

    public static void main(String[] args) {

        Collection<String> c1 = new ArrayList<>();

        // add()
        c1.add("Apple");
        c1.add("Banana");
        c1.add("Mango");

        System.out.println("Collection: " + c1);

        // addAll()
        Collection<String> c2 = new ArrayList<>();
        c2.add("Orange");
        c2.add("Grapes");

        c1.addAll(c2);

        System.out.println("After addAll(): " + c1);

        // contains()
        System.out.println("Contains Mango: " +
                c1.contains("Mango"));

        // containsAll()
        System.out.println("Contains all c2: " +
                c1.containsAll(c2));

        // size()
        System.out.println("Size: " + c1.size());

        // isEmpty()
        System.out.println("Is Empty: " +
                c1.isEmpty());

        // remove()
        c1.remove("Banana");

        System.out.println("After remove(): " + c1);

        // removeAll()
        c1.removeAll(c2);

        System.out.println("After removeAll(): " + c1);

        // iterator()
        System.out.println("Using Iterator:");

        Iterator<String> itr = c1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // clear()
        c1.clear();

        System.out.println("After clear(): " + c1);
    }
}
	
    

