package packagecode.java;

public class StringOperation3 {
	
	    //sub string
	    public static void main(String[] args) {
	        String man = "practice questions";
	        String s1 = man.substring(9);
	        String s2 = man.substring(0,8);
	        int n = man.length();
	        char f = man.charAt(9);
	        System.out.println("string is "  + man);
	                System.out.println("1st substring is " +s1);
	        System.out.println("2nd substring is"  + s2);
	        System.out.println("length is " +n);
	        System.out.println("th echaracter is " + f);

	    }
	}


