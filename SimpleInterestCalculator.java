import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is the customer a senior citizen (y/n): ");
        char seniorCitizen = scanner.next().charAt(0);
        double rate = (seniorCitizen == 'y' || seniorCitizen == 'Y') ? 12 : 10;
        double simpleInterest = calculateSimpleInterest(principal, rate, years);
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}
6