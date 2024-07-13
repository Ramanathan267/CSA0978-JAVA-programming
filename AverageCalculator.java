import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumPositive = 0, sumNegative = 0;
        int countPositive = 0, countNegative = 0;
        
        System.out.println("Enter -1 to exit…");
        
        while (true) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            
            if (num == -1) {
                break;
            }
            
            if (num > 0) {
                sumPositive += num;
                countPositive++;
            } else if (num < 0) {
                sumNegative += num;
                countNegative++;
            }
        }
        
        // Calculate averages
        double averagePositive = countPositive == 0 ? 0 : (double) sumPositive / countPositive;
        double averageNegative = countNegative == 0 ? 0 : (double) sumNegative / countNegative;
        
        // Display results
        System.out.println("The average of negative numbers is: " + averageNegative);
        System.out.println("The average of positive numbers is: " + averagePositive);
        
        scanner.close();
    }
}
