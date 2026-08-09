package packagejavacode;
class Parent{
	void Sample() {
		System.out.println("Sample is one");
		
	}
}
class Son extends Parent{
	void Basic() {
		System.out.println("Basic methods");
	}
}

		class Daughter extends Parent{
			void Desk() {
				System.out.println("Desk top");
				
			}
		}
		

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Son s=new Son();
		s.Sample();
		s.Basic();
		Daughter d=new Daughter();
		d.Sample();
		d.Desk();
	}
}



