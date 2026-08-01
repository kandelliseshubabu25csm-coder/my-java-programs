package packagecodejava;

public class BasicThings {
	int rollno;
	String name;
	float fee;
	public BasicThings(int i,String n,float f){
		this.rollno=i;
		this.name=n;
		this.fee=f;
	System.out.println("This is a constructor:");
	}
		public void sample() {
			System.out.println("rollno is:" +this.rollno);
			System.out.println("name is:" +this.name);
			System.out.println("fee is:" +this.fee);
		}
		public static void main(String[] args) {
			BasicThings bt=new BasicThings(218,"seshu",5100);
			bt.sample();
		}
		
			
			
		
		
	}
	



	


