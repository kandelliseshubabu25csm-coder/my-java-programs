package HelloWorldProject;
import java.util.Scanner;

// User-defined exception class
class InvalidMobileNumberExpected extends Exception {

    InvalidMobileNumberException(String message) {
        super(message);
    }
}

public class MobileNumberValidation {

    // Method to validate mobile number
    public static void validateMobileNumber(String mobile)
            throws InvalidMobileNumberException {

        if (mobile.matches("[6-9][0-9]{9}")) {
            System.out.println("Mobile Number is Valid.");
        } else {
            throw new InvalidMobileNumberException(
                "Invalid Mobile Number! Enter a valid 10-digit number."
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MOBILE NUMBER VALIDATION =====");

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        try {
            validateMobileNumber(mobile);
        }
        catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Mobile Number Validation Completed.");
            sc.close();
        }
    }
}
