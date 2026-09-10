// type not prresentexception
public class EphProm9 {
   public static void main(String[] args) {
    try {
        throw new TypeNotPresentException("missing class of not same type", new ClassNotFoundException());
    } catch (TypeNotPresentException tnpe) {
        // TODO: handle exception
        System.out.println("the exception is "  + tnpe.getMessage());

    }
    finally{
        System.out.println("catched done");
    }
   } 
}