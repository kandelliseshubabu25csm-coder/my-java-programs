package packagecode.java;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // add(E e)
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);

        // offer(E e)
        queue.offer(5);
        System.out.println("After offer(): " + queue);

        // peek()
        System.out.println("Peek element: " + queue.peek());

        // poll()
        System.out.println("Poll element: " + queue.poll());
        System.out.println("After poll(): " + queue);

        // remove(Object o)
        queue.remove(20);
        System.out.println("After remove(20): " + queue);

        // contains(Object o)
        System.out.println("Contains 30: " + queue.contains(30));

        // size()
        System.out.println("Size: " + queue.size());
    }
}
