package packageinheritance;
 abstract class one {
	 int x;
	 void MyName() {
		 System.out.println("My name is Rahul");
		 
		 
		 
	 }
	 abstract void MyAge();
	
}

public class AbstractDemo extends one{
	void MyAge() {
		System.out.println("My age in sub class: 18");
		
	}
	public static void main(String[] args) {
		AbstractDemo ab=new AbstractDemo();
		ab.MyName();
		ab.MyAge(); 
	}
}
