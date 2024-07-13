import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for four subjects
        System.out.print("Enter the marks in Python: ");
        int pythonMarks = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        int cMarks = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int physicsMarks = scanner.nextInt();
        
        // Calculate total and aggregate
        int total = pythonMarks + cMarks + mathMarks + physicsMarks;
        double aggregate = total / 4.0;
        
        // Determine grade
        String grade;
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60 && aggregate < 75) {
            grade = "First Division";
        } else if (aggregate >= 50 && aggregate < 60) {
            grade = "Second Division";
        } else if (aggregate >= 40 && aggregate < 50) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }
        
        // Display results
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        System.out.println("Grade = " + grade);
        
        scanner.close();
    }
}
