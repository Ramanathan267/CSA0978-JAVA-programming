import java.util.Scanner;
public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        double inputDays = scanner.nextDouble();
        if (inputDays < 0) {
            System.out.println("Please enter a positive number of days.");
        } else {
            int days = (int) inputDays;
            int years = days / 365;
            int remainingDaysAfterYears = days % 365;
            int weeks = remainingDaysAfterYears / 7;
            int remainingDaysAfterWeeks = remainingDaysAfterYears % 7;
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + remainingDaysAfterWeeks);
        }
        scanner.close();
    }
}