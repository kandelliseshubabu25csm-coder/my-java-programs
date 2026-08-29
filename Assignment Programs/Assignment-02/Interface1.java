interface one{
    int a =244;
    void at();
}
interface two extends one{
    int q= 4;
    void ta();
}


class many implements one,two{
@Override
public void at(){
    System.out.println("value is" +a);
}
@Override
public void ta(){
    System.out.println("percent is" +q);
}
}

public class Interface1 {
    public static void main(String[] args) {
// we create an object for class
        many m = new many();
        System.out.println(m.a);
        m.at();
        System.out.println();
        m.ta();

    }
}