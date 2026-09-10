// classcast exception
public class EphProm4 {
    public static void main(String[] args) {
        object obj = new String("hemanth");
        try {
            Integer number = (Integer) obj;
        } catch (ClassCastException cce) {
            // TODO: handle exception
            System.out.println("we catch an exception called cce"+ cce.getMessage());

        }
    }
}