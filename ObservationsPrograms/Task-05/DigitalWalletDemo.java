package packagecode.java;
interface PaymentService {

    void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}


// Custom Exception 1
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom Exception 2
class InvalidUPIException extends Exception {

    public InvalidUPIException(String message) {
        super(message);
    }
}


// Custom Exception 3
class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}


// Wallet Class
class Wallet {

    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    public Wallet(String userName, String mobileNumber,
                  String upiId, double balance) {

        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money
    public void addMoney(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Money added successfully: Rs." + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deduct money
    public void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Display wallet details
    public void displayWalletDetails() {

        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : Rs." + balance);
    }
}


// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Pay method
    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        if (upiId == null ||
            !upiId.contains("@") ||
            upiId.startsWith("@") ||
            upiId.endsWith("@")) {

            throw new InvalidUPIException("Invalid UPI ID.");
        }

        // Validate amount
        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Payment amount must be greater than zero.");
        }

        // Check balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException(
                    "Insufficient wallet balance.");
        }

        // Deduct amount
        wallet.deductMoney(amount);

        System.out.println("Payment successful.");
        System.out.println("Paid Rs." + amount + " to " + upiId);
    }

    // Check balance
    @Override
    public void checkBalance() {

        System.out.println("Available Balance: Rs."
                + wallet.getBalance());
    }
}


// Main Class
public class DigitalWalletDemo {

    public static void main(String[] args) {

        // Create wallet
        Wallet wallet = new Wallet(
                "Rahul",
                "9876543210",
                "rahul@upi",
                5000.0
        );

        // Create UPI payment object
        UPIPayment payment = new UPIPayment(wallet);

        // Display wallet details
        wallet.displayWalletDetails();

        // Add money
        System.out.println("\n===== ADD MONEY =====");
        wallet.addMoney(2000.0);

        // Check balance
        System.out.println("\n===== CHECK BALANCE =====");
        payment.checkBalance();

        // UPI payment
        System.out.println("\n===== UPI PAYMENT =====");

        try {

            payment.pay("priya@upi", 1500.0);

        }
        catch (InvalidUPIException e) {

            System.out.println("Transaction Failed: "
                    + e.getMessage());

        }
        catch (InvalidAmountException e) {

            System.out.println("Transaction Failed: "
                    + e.getMessage());

        }
        catch (InsufficientBalanceException e) {

            System.out.println("Transaction Failed: "
                    + e.getMessage());

        }
        finally {

            System.out.println(
                    "Transaction process completed.");
        }

        // Final wallet details
        System.out.println("\n===== FINAL WALLET DETAILS =====");
        wallet.displayWalletDetails();
    }
}