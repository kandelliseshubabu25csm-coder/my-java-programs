// arraystoreexception
public class EphProm8 {
    public static void main(String[] args) {
        
        Object a[] = new String[3];
        try {
            a[0] = Integer.valueOf(9);
        } catch (ArrayStoreException ase) {
            // TODO: handle exception
System.out.println("catched is ase"  +ase.getMessage());

        }
        finally{
            System.out.println("the process is doned");
        }
    }
}