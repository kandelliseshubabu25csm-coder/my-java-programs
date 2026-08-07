package packageinheritance;
interface I1{
	int x=100;
	void sample();
	
}
interface I2{
	int y=200;
	void demo();
}
 class Multi implements I1,I2{
	public void sample() {
		System.out.println("This is form of interface 1");
	}

	
	public void demo() {
		System.out.println("This is form of interface 2");
		
	}
	void MyMethod () {
		System.out.println("From child class");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Multi multi=new Multi();
		multi.sample();
		multi.demo();
		multi.MyMethod();
	}

}
