package packagecode.java;
import java.util.*;

public class DequeMethod {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // addFirst() and addLast()
        deque.addFirst("B");
        deque.addLast("C");
        deque.addFirst("A");
        deque.addLast("D");

        System.out.println("Deque: " + deque);

        // offerFirst() and offerLast()
        deque.offerFirst("Start");
        deque.offerLast("End");
        System.out.println("After offer: " + deque);

        // peekFirst() and peekLast()
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // removeFirst() and removeLast()
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        // pollFirst() and pollLast()
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());

        System.out.println("Final Deque: " + deque);
    }
}

