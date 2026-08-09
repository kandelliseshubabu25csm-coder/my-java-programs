package packagecodejava;
class Animal{
	   private String name;
	   private String habitat;
	   private String food;
	  public Animal(String name , String habitat , String food){
	    this.name = name;
	    this.habitat = habitat;
	    this.food = food;
	  }
	 public String getname(){
	    return name;
	 }
	public String gethabitat(){
	return habitat;
	}
	public String getfood(){
	    return food;
	}
	String sound(){
	return "animal sound";
	}
	void show(){

	System.out.println("animal is " + name);
	System.out.println("habitat is" + habitat);
	System.out.println("food is " + food);
	System.out.println("sound is " + sound());
	System.out.println("------------------");


	}

	}
	class cow extends Animal{
	    public cow(){
	        super("cow", "shed", "grass");
	    }
	    @Override
	    String sound(){
	return "moo";
	}
	}

	class pig extends Animal{
	    public pig(){
	        super("pig","sty","grains,vegetable");
	    }
	    @Override
	    String sound(){
	return "oink";
	}
	}
	class horse extends Animal{
	    public horse(){
	        super("horse" , "stable", "grass");
	    }
	    @Override
	    String sound(){
	return "neigh";
	}

	}
	public class Week03 {
	    public static void main(String[] args) {
	horse farm = new horse();
	farm.sound();
	farm.show();
	pig far = new pig();
	farm.sound();
	far.show();
	cow fa = new cow();
	fa.sound();
	 fa.show();





	        
	    }
	}

