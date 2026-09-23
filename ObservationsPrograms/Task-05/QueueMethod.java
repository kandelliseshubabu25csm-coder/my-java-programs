package packagecode.java;
import java.util.*;

public class QueueMethod{
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // add()
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // offer()
        queue.offer("D");
        System.out.println("After offer(): " + queue);

        // element()
        System.out.println("Head using element(): " + queue.element());

        // peek()
        System.out.println("Head using peek(): " + queue.peek());

        // remove()
        System.out.println("Removed using remove(): " + queue.remove());

        // poll()
        System.out.println("Removed using poll(): " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}




