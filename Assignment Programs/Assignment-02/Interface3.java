class t{
    int y = 44;
    t(){
        System.out.println(y);
    }
    void tv(){
        System.out.println(y+9);
    }
}
interface v {
    int z =99;
    void rt();
}

class u extends t implements v{
    int x= 24;
@Override
void tv(){
    System.out.println(y+200);
}
    u(){
        System.out.println(x);
    }
   public  void rt(){
        System.out.println(x+20);
    }

}
public class Interface3 {
    public static void main(String[] args) {
        
u p = new u();
p.tv();
p.rt();
    }
}