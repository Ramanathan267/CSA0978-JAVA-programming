import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number for which to print the table
        System.out.print("Enter the number (M): ");
        int m = scanner.nextInt();
        
        // Input the limit up to which the table should be printed
        System.out.print("Enter the limit (N): ");
        int n = scanner.nextInt();
        
        // Print the multiplication table
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + m + " = " + (i * m));
        }
        
        scanner.close();
    }
}
