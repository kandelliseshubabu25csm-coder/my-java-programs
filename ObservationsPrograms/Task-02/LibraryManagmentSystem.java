package packagecodejava;
public class LibraryManagmentSystem {

    // =========================================================
    // PART A & B: CLASS, OBJECTS, CONSTRUCTORS, ENCAPSULATION
    // =========================================================

    static class Book {

        // Private data members - Encapsulation
        private int bookId;
        private String bookName;
        private String author;
        private double price;

        // Default constructor
        public Book() {
            bookId = 0;
            bookName = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        // Parameterized constructor
        public Book(int bookId, String bookName, String author, double price) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
            this.price = price;
        }

        // Getter and Setter for Book ID
        public int getBookId() {
            return bookId;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        // Getter and Setter for Book Name
        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        // Getter and Setter for Author
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        // Getter and Setter for Price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Method to display book details
        public void displayBookDetails() {
            System.out.println("Book ID   : " + bookId);
            System.out.println("Book Name : " + bookName);
            System.out.println("Author    : " + author);
            System.out.println("Price     : Rs. " + price);
        }
    }


    // =========================================================
    // PART C: INHERITANCE
    // =========================================================

    // Parent class
    static class Person {

        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayPersonDetails() {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
        }
    }

    // Student inherits Person
    static class Student extends Person {

        private int studentId;
        private String course;

        public Student(String name, int age, int studentId, String course) {
            super(name, age);
            this.studentId = studentId;
            this.course = course;
        }

        public void displayStudentDetails() {
            displayPersonDetails();
            System.out.println("Student ID : " + studentId);
            System.out.println("Course     : " + course);
        }
    }

    // Faculty inherits Person
    static class Faculty extends Person {

        private int facultyId;
        private String department;

        public Faculty(String name, int age, int facultyId, String department) {
            super(name, age);
            this.facultyId = facultyId;
            this.department = department;
        }

        public void displayFacultyDetails() {
            displayPersonDetails();
            System.out.println("Faculty ID  : " + facultyId);
            System.out.println("Department  : " + department);
        }
    }


    // =========================================================
    // PART D: METHOD OVERLOADING
    // =========================================================

    static class AreaCalculator {

        // Area of circle
        public double area(double radius) {
            return Math.PI * radius * radius;
        }

        // Area of rectangle
        public double area(double length, double breadth) {
            return length * breadth;
        }

        // Area of square
        public double area(int side) {
            return side * side;
        }

        // Area of triangle
        public double area(double base, double height, boolean triangle) {
            return 0.5 * base * height;
        }
    }


    // =========================================================
    // PART D: METHOD OVERRIDING
    // =========================================================

    // Parent Vehicle class
    static class Vehicle {

        public void display() {
            System.out.println("This is a Vehicle.");
        }
    }

    // Car overrides display()
    static class Car extends Vehicle {

        @Override
        public void display() {
            System.out.println("This is a Car.");
        }
    }

    // Bike overrides display()
    static class Bike extends Vehicle {

        @Override
        public void display() {
            System.out.println("This is a Bike.");
        }
    }


    // =========================================================
    // PART E: ABSTRACTION
    // =========================================================

    // Abstract class
    static abstract class Shape {

        // Abstract method
        public abstract void draw();
    }

    // Circle implements abstract method
    static class Circle extends Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a Circle.");
        }
    }

    // Rectangle implements abstract method
    static class Rectangle extends Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle.");
        }
    }


    // =========================================================
    // PART E: INTERFACE
    // =========================================================

    interface Printable {

        void print();
    }

    // Report implements Printable
    static class Report implements Printable {

        @Override
        public void print() {
            System.out.println("Printing the Library Report.");
        }
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("          LIBRARY MANAGEMENT SYSTEM");
        System.out.println("=================================================");


        // =====================================================
        // PART A & B: CLASSES, OBJECTS, CONSTRUCTORS,
        //             ENCAPSULATION
        // =====================================================

        System.out.println("\n\n--- PART A & B: BOOK DETAILS ---");

        // Object using default constructor
        Book book1 = new Book();

        // Using setters
        book1.setBookId(101);
        book1.setBookName("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPrice(450.00);

        System.out.println("\nBook 1 - Default Constructor + Setters");
        book1.displayBookDetails();


        // Object using parameterized constructor
        Book book2 = new Book(
                102,
                "Object Oriented Programming",
                "Robert Lafore",
                550.00
        );

        System.out.println("\nBook 2 - Parameterized Constructor");
        book2.displayBookDetails();


        // Demonstrating getters
        System.out.println("\nAccessing Book 2 using Getter Methods:");
        System.out.println("Book ID   : " + book2.getBookId());
        System.out.println("Book Name : " + book2.getBookName());
        System.out.println("Author    : " + book2.getAuthor());
        System.out.println("Price     : Rs. " + book2.getPrice());


        // =====================================================
        // PART C: INHERITANCE
        // =====================================================

        System.out.println("\n\n--- PART C: INHERITANCE ---");

        // Student object
        Student student = new Student(
                "Rahul",
                20,
                501,
                "Computer Science"
        );

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();


        // Faculty object
        Faculty faculty = new Faculty(
                "Dr. Priya",
                40,
                301,
                "Computer Science"
        );

        System.out.println("\nFaculty Details:");
        faculty.displayFacultyDetails();


        // =====================================================
        // PART D: METHOD OVERLOADING
        // =====================================================

        System.out.println("\n\n--- PART D: METHOD OVERLOADING ---");

        AreaCalculator calculator = new AreaCalculator();

        // Circle
        double circleArea = calculator.area(5.0);
        System.out.println("Area of Circle = " + circleArea);

        // Rectangle
        double rectangleArea = calculator.area(10.0, 5.0);
        System.out.println("Area of Rectangle = " + rectangleArea);

        // Square
        double squareArea = calculator.area(6);
        System.out.println("Area of Square = " + squareArea);

        // Triangle
        double triangleArea = calculator.area(8.0, 4.0, true);
        System.out.println("Area of Triangle = " + triangleArea);


        // =====================================================
        // PART D: METHOD OVERRIDING & RUNTIME POLYMORPHISM
        // =====================================================

        System.out.println("\n\n--- METHOD OVERRIDING ---");

        // Parent reference referring to Car object
        Vehicle vehicle1 = new Car();

        // Parent reference referring to Bike object
        Vehicle vehicle2 = new Bike();

        vehicle1.display();
        vehicle2.display();


        // =====================================================
        // PART E: ABSTRACTION
        // =====================================================

        System.out.println("\n\n--- PART E: ABSTRACTION ---");

        // Abstract class reference
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();


        // =====================================================
        // PART E: INTERFACE
        // =====================================================

        System.out.println("\n\n--- INTERFACE ---");

        Printable report = new Report();

        report.print();


        // =====================================================
        // END
        // =====================================================

        System.out.println("\n=================================================");
        System.out.println("       PROGRAM EXECUTED SUCCESSFULLY");
        System.out.println("=================================================");
    }
}

