package packagecode.java;
	import java.util.*;

	public class ListMehods {
	    public static void main(String[] args) {

	        List<String> list = new ArrayList<>();

	        // add()
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");
	        list.add("Banana");
	        System.out.println("List: " + list);

	        // add(index, element)
	        list.add(1, "Orange");
	        System.out.println("After add(1, Orange): " + list);

	        // get()
	        System.out.println("Element at index 2: " + list.get(2));

	        // set()
	        list.set(2, "Grapes");
	        System.out.println("After set(): " + list);

	        // remove(index)
	        list.remove(1);
	        System.out.println("After remove(1): " + list);

	        // indexOf()
	        System.out.println("First index of Banana: " + list.indexOf("Banana"));

	        // lastIndexOf()
	        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

	        // subList()
	        System.out.println("SubList: " + list.subList(0, 2));

	        // sort()
	        list.sort(Comparator.naturalOrder());
	        System.out.println("After sorting: " + list);
	    }
	}


