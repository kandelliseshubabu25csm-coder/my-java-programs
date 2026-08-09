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

public class SingleInheritance {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.Animals();

	Child c=new Child();
	c.Cats();
	c.Animals();
	
	}
	

}
