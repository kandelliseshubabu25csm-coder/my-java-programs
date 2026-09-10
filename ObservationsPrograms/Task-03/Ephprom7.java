// negative arraysize exception
public class EphProm7 {
    public static void main(String[] args) {
        try {
            int max = -5;
            int b[] = new int[max];
        } catch (NegativeArraySizeException nase) {

            // TODO: handle exception
            System.out.println("catcehd nase" + nase.getMessage());
        }
    }
}