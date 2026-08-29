interface a{
    int x = 44;
    void it();
}
interface b{
    String y = "kiran";
    void ti();
}

interface c {
    double z = 44.98;
    void ui(); 
}
interface d extends a,b,c{
    int b = 99;
    void iu();
}
class many implements d{
    @Override
   public void it(){
System.out.println(x);
   };
   @Override
    public void ti(){
System.out.println(y);
    };
    @Override
   public void ui(){
System.out.println(z);
   };
    @Override
    public void iu(){
System.out.println(b);
    };
    

}
public class Interface2 {
    public static void main(String[] args) {
    // we  can create an object for Many class
many n = new many();
System.out.println(n.y);
System.out.println(n.x);
System.out.println(n.z);
System.out.println(n.b);
n.it();
n.iu();
n.ti();
n.ui();
    }
}