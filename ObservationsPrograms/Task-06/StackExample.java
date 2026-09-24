package packagecode.java;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // push(E item)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");

        System.out.println("Stack: " + stack);

        // peek()
        System.out.println("Top element: " + stack.peek());

        // search(Object o)
        System.out.println("Position of Banana: "
                + stack.search("Banana"));

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop(): " + stack);

        // empty()
        System.out.println("Is Stack Empty: " + stack.empty());
    }
}

