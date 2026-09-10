// null ponter exception 

public class EphProm1 {
    public static void main(String[] args) {
        String name  = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("we get an nullpointer exception" + e.getMessage());
        }
    }
}