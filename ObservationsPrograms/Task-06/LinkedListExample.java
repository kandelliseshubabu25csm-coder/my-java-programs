package packagecode.java;
import java.util.LinkedList;

	public class LinkedListExample {

	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        // add(E e)
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");

	        System.out.println("LinkedList: " + list);

	        // addFirst(E e)
	        list.addFirst("Orange");

	        System.out.println("After addFirst(): " + list);

	        // addLast(E e)
	        list.addLast("Grapes");

	        System.out.println("After addLast(): " + list);

	        // get(int index)
	        System.out.println("Element at index 2: " + list.get(2));

	        // getFirst()
	        System.out.println("First element: " + list.getFirst());

	        // getLast()
	        System.out.println("Last element: " + list.getLast());

	        // remove(int index)
	        list.remove(2);

	        System.out.println("After remove(index): " + list);

	        // remove(Object o)
	        list.remove("Banana");

	        System.out.println("After remove(object): " + list);

	        // removeFirst()
	        System.out.println("Removed first element: "
	                + list.removeFirst());

	        System.out.println("After removeFirst(): " + list);

	        // removeLast()
	        System.out.println("Removed last element: "
	                + list.removeLast());

	        System.out.println("After removeLast(): " + list);

	        // offer(E e)
	        list.offer("Pineapple");

	        System.out.println("After offer(): " + list);

	        // peek()
	        System.out.println("Peek element: " + list.peek());

	        // poll()
	        System.out.println("Poll element: " + list.poll());

	        System.out.println("After poll(): " + list);
	    }
	}
	



