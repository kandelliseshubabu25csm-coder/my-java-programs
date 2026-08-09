package packagecodejava;

public class ReturnType {
	int addition() {
		int x=10,y=20;
		return x+y+20;
	}
	public static void main(String[] args) {
		ReturnType rt=new ReturnType();
		int res=rt.addition();
		System.out.println("res:" +res);
		
		
	}

}
