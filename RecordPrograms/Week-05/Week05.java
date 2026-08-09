package packagecodejava;
class Employee{
	   private String name;
	   private int id;
	   private String designation;
	  private  double salary;
	   private boolean promotionstatus;
	// consturctor is default const is create
	public Employee(){
	this.name = "not assigned";
	this.id = 0;
	this.designation = "trainer";
	this.salary = 0.0;
	this.promotionstatus = false;
	}
	// const have passes 2 parameters by using const overloading
	public Employee(String name , int id){
	this.name = name;
	this.id = id;
	this.designation = "trainer";
	this.salary = 0.0;
	this.promotionstatus = false;
	System.out.println("--- 2 parameters passing constructor");
	}

	// const have passes4 parameters

	public Employee(String name , int id , String designation , double salary){
	this.name = name;
	this.id = id;
	this.designation = "trainer";
	this.salary = 0.0;
	this.promotionstatus = false;
	System.out.println("4paramters passing constructor");
	}

	public Employee(String name , int id , String designation , double salary , boolean promotionstatus){
	this.name = name;
	this.id = id;
	this.designation = "trainer";
	this.salary = 0.0;
	this.promotionstatus = false;
	System.out.println("all details passing constructor");
	}

	public void show(){
	System.out.println("--- employee details ---");
	System.out.println("name : " + name);
	System.out.println("id :" + id);
	System.out.println( "designation : " + designation);
	System.out.println("salary :" + salary);
	System.out.println("promotionstatus : " + promotionstatus);
	}
	}
	public class Week05 {

	    public static void main(String[] args) {
	        Employee e1 = new Employee();
	        e1.show();
	        Employee e2 = new Employee("hemanth" , 244);
	        e2.show();
	        Employee e3  = new Employee("hemanth" , 244 , "software engineer" , 70.000);
	        e3.show();
	        Employee e4 = new Employee("hemanth" , 244 , "software engineer" , 75.000 , false);
	         e4.show();

	    }
	}

