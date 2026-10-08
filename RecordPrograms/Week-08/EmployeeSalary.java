
import java.util.Scanner;

// Defining an interface
interface Employee {
    void displaySalary();
}

// Regular employee implementation
class RegularEmployee implements Employee {
    public void displaySalary() {
        int basicPay = 25000;
        int hra = 15000;
        int ta = 5000;
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay
                + " HRA: " + hra
                + " T.A: " + ta
                + " Total Amount: " + total);
    }
}

// Contract employee implementation
class ContractEmployee implements Employee {
    public void displaySalary() {
        int basicPay = 12000;
        int hra = 0;
        int ta = 3000;
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay
                + " HRA: " + hra
                + " T.A: " + ta
                + " Total Amount: " + total);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String empId = sc.nextLine().trim();

        // Access implementation through interface reference
        Employee emp;

        if (empId.matches("(?i)R\\d+")) {
            emp = new RegularEmployee();
            emp.displaySalary();
        } else if (empId.matches("(?i)C\\d+")) {
            emp = new ContractEmployee();
            emp.displaySalary();
        } else {
            System.out.println("Invalid Employee Id");
        }

        sc.close();
    }
}