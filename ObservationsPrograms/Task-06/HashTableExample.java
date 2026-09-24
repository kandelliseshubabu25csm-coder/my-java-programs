package packagecode.java;
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        // put(K key, V value)
        table.put(101, "Apple");
        table.put(102, "Banana");
        table.put(103, "Mango");

        System.out.println("Hashtable: " + table);

        // get(Object key)
        System.out.println("Value of key 102: " + table.get(102));

        // remove(Object key)
        table.remove(103);
        System.out.println("After remove(): " + table);

        // containsKey(Object key)
        System.out.println("Contains key 101: "
                + table.containsKey(101));

        // containsValue(Object value)
        System.out.println("Contains value Banana: "
                + table.containsValue("Banana"));

        // keys()
        System.out.println("Keys:");

        Enumeration<Integer> keys = table.keys();

        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // elements()
        System.out.println("Values:");

        Enumeration<String> values = table.elements();

        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        // size()
        System.out.println("Size: " + table.size());

        // isEmpty()
        System.out.println("Is Empty: " + table.isEmpty());
    }
}

