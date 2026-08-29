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
interface w{
    void ov();
}

class u extends t implements v ,w{
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
public void ov(){
    System.out.println("multiple inheritance is completed");
}
}

public class Interface4 {
    public static void main(String[] args) {

        u o = new u();
        o.ov();
        o.rt();
        o.tv();
        
    }
}