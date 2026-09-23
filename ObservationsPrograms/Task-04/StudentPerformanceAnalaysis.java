package packagecode.java;
import java.util.Scanner;

class Student {

    // Data members
    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor
    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Method to find highest marks
    public int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Method to find lowest marks
    public int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int total = calculateTotal();

        // Five subjects, each subject is out of 100
        double percentage = (double) total / (marks.length * 100) * 100;

        // Round to two decimal places
        return Math.round(percentage * 100.0) / 100.0;
    }

    // Method to determine grade
    public String determineGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to determine pass or fail
    public String determineResult() {
        if (calculatePercentage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    // Method to generate performance remark
    public String getRemark() {
        String grade = determineGrade();

        switch (grade) {
            case "A+":
                return "Excellent Performance";
            case "A":
                return "Very Good Performance";
            case "B":
                return "Good Performance";
            case "C":
                return "Satisfactory Performance";
            case "D":
                return "Needs Improvement";
            default:
                return "Poor Performance";
        }
    }

    // Method to display student details
    public void displayDetails() {

        // String operations
        String formattedName = studentName.trim().toUpperCase();
        int nameLength = formattedName.length();

        System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");

        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + nameLength);

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "         : " + marks[i]);
        }

        System.out.println("\nTotal Marks       : " + calculateTotal() + " / "
                + (marks.length * 100));

        System.out.printf("Average Marks     : %.2f%n", calculateAverage());

        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());

        System.out.printf("Percentage        : %.2f%%%n", calculatePercentage());

        System.out.println("Grade             : " + determineGrade());
        System.out.println("Result            : " + determineResult());
        System.out.println("Performance Remark: " + getRemark());

        System.out.println("===============================================");
    }
}

// Main class
public class StudentPerformanceAnalaysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.println("===== STUDENT PERFORMANCE ANALYSIS SYSTEM =====");

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        // Array for five subjects
        int[] marks = new int[5];

        // Read marks
        System.out.println("\nEnter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {

            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
                int mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }
        }

        // Create Student object
        Student student = new Student(rollNumber, studentName, marks);

        // Display complete performance report
        student.displayDetails();

        sc.close();
    }
}


