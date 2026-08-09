package packagecodejava;
import java.util.Scanner;

public class StudentUtilityProgram01 {

    // Scanner object for input
    static Scanner sc = new Scanner(System.in);

    // =========================
    // PART D: USER-DEFINED METHODS
    // =========================

    // Method to find factorial
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to find maximum of two numbers
    public static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to calculate area of circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println("       STUDENT UTILITY PROGRAM");
            System.out.println("======================================");
            System.out.println("1. Student Information and Result");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Find Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Display Day of the Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Display Numbers from 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Check Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of a Circle");
            System.out.println("14. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ==========================================
                // PART A: STUDENT INFORMATION
                // ==========================================

                case 1:
                    sc.nextLine(); // Clear input buffer

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();

                    System.out.print("Enter marks for Subject 1: ");
                    double mark1 = sc.nextDouble();

                    System.out.print("Enter marks for Subject 2: ");
                    double mark2 = sc.nextDouble();

                    System.out.print("Enter marks for Subject 3: ");
                    double mark3 = sc.nextDouble();

                    double total = mark1 + mark2 + mark3;
                    double percentage = total / 3;

                    System.out.println("\n---------- STUDENT RESULT ----------");
                    System.out.println("Name       : " + name);
                    System.out.println("Roll Number: " + rollNumber);
                    System.out.println("Mark 1     : " + mark1);
                    System.out.println("Mark 2     : " + mark2);
                    System.out.println("Mark 3     : " + mark3);
                    System.out.println("Total      : " + total);
                    System.out.println("Percentage : " + percentage + "%");

                    break;

                // ==========================================
                // PART B: CONDITIONAL STATEMENTS
                // ==========================================

                case 2:
                    System.out.print("Enter a number: ");
                    int evenOddNumber = sc.nextInt();

                    if (evenOddNumber % 2 == 0) {
                        System.out.println(evenOddNumber + " is Even.");
                    } else {
                        System.out.println(evenOddNumber + " is Odd.");
                    }

                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();

                    System.out.print("Enter third number: ");
                    int num3 = sc.nextInt();

                    int largest;

                    if (num1 >= num2 && num1 >= num3) {
                        largest = num1;
                    } else if (num2 >= num1 && num2 >= num3) {
                        largest = num2;
                    } else {
                        largest = num3;
                    }

                    System.out.println("Largest number = " + largest);

                    break;

                case 4:
                    System.out.print("Enter percentage: ");
                    double percentageInput = sc.nextDouble();

                    if (percentageInput >= 90) {
                        System.out.println("Grade: A+");
                    } else if (percentageInput >= 80) {
                        System.out.println("Grade: A");
                    } else if (percentageInput >= 70) {
                        System.out.println("Grade: B");
                    } else if (percentageInput >= 60) {
                        System.out.println("Grade: C");
                    } else if (percentageInput >= 50) {
                        System.out.println("Grade: D");
                    } else if (percentageInput >= 40) {
                        System.out.println("Grade: E");
                    } else {
                        System.out.println("Grade: F - Fail");
                    }

                    break;

                case 5:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("Friday");
                            break;

                        case 6:
                            System.out.println("Saturday");
                            break;

                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("Invalid day number.");
                    }

                    break;

                // ==========================================
                // PART C: LOOPING STATEMENTS
                // ==========================================

                case 6:
                    System.out.print("Enter a number for multiplication table: ");
                    int tableNumber = sc.nextInt();

                    System.out.print("Enter the limit: ");
                    int tableLimit = sc.nextInt();

                    System.out.println("\nMultiplication Table of " + tableNumber);

                    for (int i = 1; i <= tableLimit; i++) {
                        System.out.println(
                            tableNumber + " x " + i + " = " + (tableNumber * i)
                        );
                    }

                    break;

                case 7:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    if (n < 1) {
                        System.out.println("Please enter a positive number.");
                    } else {
                        System.out.println("Numbers from 1 to " + n + ":");

                        for (int i = 1; i <= n; i++) {
                            System.out.print(i + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 8:
                    System.out.print("Enter N: ");
                    int sumN = sc.nextInt();

                    if (sumN < 1) {
                        System.out.println("Please enter a positive number.");
                    } else {
                        int sum = 0;
                        int i = 1;

                        while (i <= sumN) {
                            sum = sum + i;
                            i++;
                        }

                        System.out.println(
                            "Sum of first " + sumN +
                            " natural numbers = " + sum
                        );
                    }

                    break;

                case 9:
                    System.out.print("Enter number of Fibonacci terms: ");
                    int terms = sc.nextInt();

                    if (terms <= 0) {
                        System.out.println("Please enter a positive number.");
                    } else {
                        int first = 0;
                        int second = 1;

                        System.out.println("Fibonacci Series:");

                        int count = 1;

                        do {
                            System.out.print(first + " ");

                            int next = first + second;
                            first = second;
                            second = next;

                            count++;

                        } while (count <= terms);

                        System.out.println();
                    }

                    break;

                // ==========================================
                // PART D: METHODS
                // ==========================================

                case 10:
                    System.out.print("Enter a number: ");
                    int factorialNumber = sc.nextInt();

                    if (factorialNumber < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else if (factorialNumber > 20) {
                        System.out.println(
                            "Please enter a number from 0 to 20."
                        );
                    } else {
                        long result = factorial(factorialNumber);

                        System.out.println(
                            "Factorial of " + factorialNumber +
                            " = " + result
                        );
                    }

                    break;

                case 11:
                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    if (isPrime(primeNumber)) {
                        System.out.println(primeNumber + " is a Prime number.");
                    } else {
                        System.out.println(primeNumber + " is not a Prime number.");
                    }

                    break;

                case 12:
                    System.out.print("Enter first number: ");
                    int firstNumber = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int secondNumber = sc.nextInt();

                    int maximumNumber = maximum(firstNumber, secondNumber);

                    System.out.println(
                        "Maximum number = " + maximumNumber
                    );

                    break;

                case 13:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();

                    if (radius < 0) {
                        System.out.println("Radius cannot be negative.");
                    } else {
                        double area = circleArea(radius);

                        System.out.println(
                            "Area of circle = " + area
                        );
                    }

                    break;

                // ==========================================
                // EXIT
                // ==========================================

                case 14:
                    System.out.println("\nThank you for using Student Utility Program!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 14.");
            }

        } while (choice != 14);

        sc.close();
    }
}




