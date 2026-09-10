public class EphProm2 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // TODO: handle exception

            System.out.println("i caught an exception named called aioobe" + aioobe.getMessage());
        }
finally{
System.out.println("we sucessfully the eception");
}
    }
}