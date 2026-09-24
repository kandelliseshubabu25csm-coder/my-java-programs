package packagecode.java;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // add(E e)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("TreeSet: " + set);

        // remove(Object o)
        set.remove(30);
        System.out.println("After remove(): " + set);

        // contains(Object o)
        System.out.println("Contains 20: " + set.contains(20));

        // first()
        System.out.println("First element: " + set.first());

        // last()
        System.out.println("Last element: " + set.last());

        // higher(E e)
        System.out.println("Higher than 20: " + set.higher(20));

        // lower(E e)
        System.out.println("Lower than 40: " + set.lower(40));

        // ceiling(E e)
        System.out.println("Ceiling of 25: " + set.ceiling(25));

        // floor(E e)
        System.out.println("Floor of 25: " + set.floor(25));

        // pollFirst()
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("After pollFirst(): " + set);

        // pollLast()
        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After pollLast(): " + set);
    }
}



