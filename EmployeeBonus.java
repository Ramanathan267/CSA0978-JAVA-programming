import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the grade and salary from the user
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        // Calculate the base bonus based on grade
        double bonus = 0;
        if (grade == 'A' || grade == 'a') {
            bonus = salary * 0.05;
        } else if (grade == 'B' || grade == 'b') {
            bonus = salary * 0.10;
        } else {
            System.out.println("Invalid grade entered. No bonus will be applied.");
            System.exit(0);
        }

        // Add extra bonus if the salary is less than $10,000
        if (salary < 10000) {
            bonus += salary * 0.02;
        }

        // Calculate the total salary to be paid
        double totalSalary = salary + bonus;

        // Print the results
        System.out.println("Salary = $" + salary);
        System.out.println("Bonus = $" + bonus);
        System.out.println("Total to be paid = $" + totalSalary);
    }
}
