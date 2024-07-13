import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int nthOddNumber = 2 * n - 1;
        int result = nthOddNumber + 2 * n;
        System.out.println(n + "th odd number after " + n + " odd numbers isṇ