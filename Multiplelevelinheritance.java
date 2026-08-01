package packageinheritance;
class Parent{
	void Animals() {
		System.out.println("Animals are danger");
	}
}
class Child extends Parent{
	void Cats() {
		System.out.println("Cats are  cute");
		
	}
}
class GrandChild extends Child{
	void rabbits() {
System.out.println("rabbits are  beautiful");
		
	
		 
	}
}


public class Multiplelevelinheritance {

	public static void main(String[] args) {
		
		GrandChild gc=new GrandChild();
		gc.Animals();
		gc.Cats();
		gc.rabbits();
		
		
		}
		

	
	}
	


