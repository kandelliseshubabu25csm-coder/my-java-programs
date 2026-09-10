public class EphProm3 {
    public static void main(String[] args) {
        String man = "hemanth";
        try {
            System.out.println(man.charAt(9));
        } catch (StringIndexOutOfBoundsException sioobe) {
            // TODO: handle exception
            System.out.println("we caught an exception called sioobe" + sioobe.getMessage());

        }
        finally{
            System.out.println("we get sioobe exception");
        }
    }

}