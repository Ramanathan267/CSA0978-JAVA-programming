import java.util.Scanner;

public class SumOfNNumbersarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = 0;

        try {
            for (int i = 0; i <= N; i++) {
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
