package packagecodejava;

public class ConDemo {
	int rollno;
	String name;
	float fee;
	public ConDemo(){
		this.rollno=218;
		this.name="seshu";
		this.fee=23.56f;
	System.out.println("This is a constructor:");
	}
		public void sample() {
			System.out.println("rollno is:" +this.rollno);
			System.out.println("name is:" +this.name);
			System.out.println("fee is:" +this.fee);
		}
		public static void main(String[] args) {
			ConDemo cd=new ConDemo();
			cd.sample();
		}
		
			
			
		
		
	}
	


