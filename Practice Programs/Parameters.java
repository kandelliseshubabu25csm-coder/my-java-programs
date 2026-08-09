package packagecodejava;

public class Parameters {
	int addition(int x,int y,int z) {
		return x+y+z;
	}
	int multiplication(int x,int y,int z) {
		return x*y*z;
		
		
	}
	public static void main(String[] args) {
		Parameters pt=new Parameters();
		int res=pt.addition(10,20,30);
		int mult=pt.multiplication(6, 7, 8);
		System.out.println("addition:" + res);
		System.out.println("multiplication:" + mult);

		
		
		
	}

}
