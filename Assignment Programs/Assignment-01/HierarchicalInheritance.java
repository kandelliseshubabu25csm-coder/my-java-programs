package javaproject;
class Demo{
	void Big() {
		System.out.println("this is the calss Demo");
	}
}
class Goes extends Demo{
	void Horse() {
		System.out.println("Horse was running") ;
	}
}
class Rose extends Demo{
	void Pig() {
		System.out.println("Animal was eating");
		
	}
}

public class HierarchicalInheritance {
class main{
	public static void main(String[] args) {
		Goes g=new Goes();
		g.Big();
		g.Horse();
		Rose r=new Rose();
		r.Big();
		r.Pig();
		
		
	}
}
}
