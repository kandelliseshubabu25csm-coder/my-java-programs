package packagecode.java;
import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // addFirst(E e)
        deque.addFirst("Banana");
        deque.addFirst("Apple");

        // addLast(E e)
        deque.addLast("Mango");
        deque.addLast("Orange");

        System.out.println("ArrayDeque: " + deque);

        // offerFirst(E e)
        deque.offerFirst("Grapes");
        System.out.println("After offerFirst(): " + deque);

        // offerLast(E e)
        deque.offerLast("Pineapple");
        System.out.println("After offerLast(): " + deque);

        // pollFirst()
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // pollLast()
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);

        // peekFirst()
        System.out.println("Peek First: " + deque.peekFirst());

        // peekLast()
        System.out.println("Peek Last: " + deque.peekLast());
    }
}



