package packagecodejava;
import java.util.Scanner;

public class Week02{

   
    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    
    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
System.out.print("Enter a number to check Prime: ");
        int primeNumber = sc.nextInt();

        if (isPrime(primeNumber)) {
            System.out.println(primeNumber + " is a Prime number.");
        } else {
            System.out.println(primeNumber + " is not a Prime number.");
        }

        
        System.out.print("\nEnter a number to check Palindrome: ");
        int palindromeNumber = sc.nextInt();

        if (isPalindrome(palindromeNumber)) {
            System.out.println(palindromeNumber + " is a Palindrome number.");
        } else {
            System.out.println(palindromeNumber + " is not a Palindrome number.");
        }

        
        if (args.length >= 2) {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("\n--- Command Line Arguments ---");
            System.out.println("First number  : " + a);
            System.out.println("Second number : " + b);
            System.out.println("Sum           : " + (a + b));

        } else {

            System.out.println("\nNo command line arguments provided.");
        }

        
        sc.close();
    }
}




    