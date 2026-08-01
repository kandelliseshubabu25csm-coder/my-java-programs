package packagecodejava;
class Grandparent{
	void Animals() {
		System.out.println("Animals are good");
		
	}
}
class Parent extends Grandparent{
	void Cats() {
		System.out.println("Cats are cute");
	}
}
class Child1 extends Parent{
	void Tiger() {
		System.out.println("Tiger is very dangerous");
	}
}
class Child2 extends Parent{
	void Parrot() {
		System.out.println("Parrot is beautiful");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.Animals();
		p.Cats();
		System.out.println("--------------");
		Child1 c1=new Child1();
		c1.Animals();
		c1.Cats();
		c1.Tiger();
		System.out.println("--------------");
		Child2 c2=new Child2();
		c2.Animals();
		c2.Cats();
		c2.Parrot();
		
	}

}
