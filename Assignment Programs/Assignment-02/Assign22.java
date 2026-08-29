interface one{
    int a =23;
    void two();
}
// the  class is innerited the interface 
public class Assign22 implements one {
    public void two(){
        System.out.println("the value of interface is" +a);
    }
    public static void main(String[] args) {
        //we create the object
        Assign22 ac = new Assign22();
        ac.two();
    }
}