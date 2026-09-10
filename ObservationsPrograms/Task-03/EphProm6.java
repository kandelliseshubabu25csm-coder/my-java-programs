public class EphProm6 {
     static void check(int age){
        if(age < 0){
            throw new IllegalArgumentException("age cannot be negative" + age);
        }
        System.out.println("age set to " + age);
      }

    public static void main(String[] args) {
        
        try {
            check(-2);
        } catch (IllegalArgumentException iae) {
            // TODO: handle exception
            System.out.println("we catch iae " + iae.getMessage());
        }
        finally{
            System.out.println("we successfully cathced the exception");
        }
    }
}