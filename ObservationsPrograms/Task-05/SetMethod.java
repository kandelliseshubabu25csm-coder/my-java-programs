package packagecode.java;


	import java.util.*;

	public class SetMethod {
	    public static void main(String[] args) {

	        Set<String> set = new HashSet<>();

	        // add()
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Mango");
	        set.add("Apple"); // duplicate
	        System.out.println("Set: " + set);

	        // contains()
	        System.out.println("Contains Banana: " + set.contains("Banana"));

	        // size()
	        System.out.println("Size: " + set.size());

	        // isEmpty()
	        System.out.println("Is Empty: " + set.isEmpty());

	        // remove()
	        set.remove("Mango");
	        System.out.println("After remove(): " + set);

	        // clear()
	        set.clear();
	        System.out.println("After clear(): " + set);
	    }
	}


