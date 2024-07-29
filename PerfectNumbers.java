import java.util.Scanner;

public class PerfectNumbers {

    // Function to check if a number is a perfect number
    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a proper divisor
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n from the user
        System.out.println("Enter the number of perfect numbers to print:");
        int n = scanner.nextInt();

        int count = 0;
        int number = 1; // Start checking from 2 since 1 is not a perfect number

        // Loop to find and print the first n perfect numbers
        while (count < n) {
            if (isPerfect(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

        scanner.close();
    }
}
