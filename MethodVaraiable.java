package packagecodejava;

public class MethodVaraiable {
	int addition() {
		int x=10,y=50;
		return x+y;
	}
	
		int division() {
			int x=40,y=56;
			return x/y;
		}
			int multiplication() {
				int x=1,y=4;
				return x*y;
			}
			public void main() {
				int x=2;
				int y=3;
			}
			public static void main(String[] args) {
				MethodVaraiable mv=new MethodVaraiable();
				int add=mv.addition();
				int div=mv.division();
				int mul=mv.multiplication();
				System.out.println("res:" +add);
				System.out.println("res:" +div);
				System.out.println("res:" +mul);
			}
}
