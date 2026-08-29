interface first{
    int a =244;
    void system();
}
// in secind interface have an initialised variable and abstract method called part
interface second{
    int y = 300;
    void part();
}
// to inherit the interfaCes by using implements keyword
public class Assign23 implements first ,second {
    // to override the methods
 @Override
public void system(){
    System.out.println("the multiple inheritance value is" + a);
 }
@Override
 public void part(){
    System.out.println("the second interface of value is " + y);
}


    public static void main(String[] args) {
        Assign23 as =  new Assign23();
        as.system();
        as.part();

    }
}