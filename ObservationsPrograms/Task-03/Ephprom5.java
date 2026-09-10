public class EphProm5 {
    public static void main(String[] args) {
        String val = "hemu0912";
        try {
            int number = Integer.parseInt(val);
            System.out.println();
        } catch (NumberFormatException nfe) {
            // TODO: handle exception
            System.out.println("we catch an nfe" + nfe.getMessage());
        }
    }
}